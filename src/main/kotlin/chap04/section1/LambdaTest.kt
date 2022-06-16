package chap04

fun main() {
    val result: Int
    val result2: Int

//    val multi: (a: Int, b: Int) -> Int = { a, b -> a * b}
    val multi = { a: Int, b: Int -> a * b}
    val multi2: (a: Int, b: Int) -> Int = { a, b ->
        println("a: $a, b: $b")
        a * b
    }

    result = multi(10, 20)
    println(result)
    println()
    result2 = multi2(10, 20)
    println(result)

    // 반환 자료형이 없거나 매개변수가 하나 있을 때
    // val greet: ()->Unit = {println("Hello world!")}
    val greet = {println("Hello world!")}
    // val square: (Int) -> Int = { x -> x * x}
    val square = {x: Int -> x * x}


    // 람다식 안에 람다식이 있는 경우
    val nestedlambda: () -> () -> Unit = {{ println("nested") }}
    val nestedlambda2 = {{println("nested")}}

}

/* 람다식의 구성
* 표현식이 2줄 이상일 때
val multi: (Int, Int) -> Int = { x: Int, y: Int ->
    println("x * y")
    x * y
}

* 람다식의 표현방법 세 가지
val multi: (Int, Int) -> Int = {x: Int, y: Int -> x * y} // 전체 표현식
val multi = {x: Int, y: Int -> x * y // 선언 자료형 생략
val multi: (Int, Int) -> Int = {x, y -> x * y} // 람다식 매개변수 자료형 생략
 */