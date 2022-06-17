package chap04.section2

// 매개변수가 없는 람다식
fun noParam(out: () -> String) = println(out())

// 매개변수가 1개인 람다식
fun oneParam(out: (String) -> String) {
    println(out("OneParam"))
}

// 매개변수가 2개인 람다식
fun moreParam(out: (String, String) -> String) {
    println(out("OneParam", "TwoParam"))
}

// 일반 매개변수와 람다식 매개변수를 같이 사용하는 경우(마지막 매개변수가 람다식)
fun withArgs(a: String, b: String, out: (String, String) -> String) {
    println(out(a, b))
}

// 두 개의 람다식
fun twoLambda(first: (String, String) -> String, second: (String) -> String) {
    println(first("OneParam", "TwoParam"))
    println(second("OneParam"))
}

fun main() {
    // 매개변수가 없는 람다식은 () 생략 가능
    noParam({ "Hello World!" })
    noParam { "Hello World!" }

    oneParam({ a -> "Hello World! $a" })
    oneParam { a -> "Hello World! $a" } // () 생략 가능
    oneParam { "Hello World! $it" } // $it을 사용하여 매개변수 대체 가능

    moreParam({ a, b -> "Hello World! $a $b" })
    moreParam { a, b -> "Hello World! $a $b" } // () 생략 가능, 매개변수는 생략 불가
    moreParam { _, b -> "Hello World! $b" } // _를 사용하여 특정 매개변수 생략 가능

    // 일반 매개변수와 람다식 매개변수를 같이 사용하는 경우
    withArgs("Arg1", "Arg2", { a, b -> "Hello World! $a $b" })
    withArgs("Arg1", "Arg2") { a, b -> "Hello World! $a $b" } // 마지막 인자가 람다식 일 때 () 분리 가능

    // 두 개 이상의 람다식
    twoLambda({ a, b -> "First $a $b"}, {"Second $it"})
    twoLambda({ a, b -> "First $a $b"}) {"Second $it"} // 마지막 인자인 람다식만 () 분리 가능

}