package chap06.section3

fun main() {
    var a = 1
    val b = 2

    a = a.let { it + 2 }.let {
        println("a = $a") // 복사된 a로 변경되기 전의 값으로 1이 출력됨
        val i = it + b // it에는 3이 들어감
        i // 반환 값 i: a 값에 할당됨
    }
    println(a) // 5

    // 중첩 사용
    var x = "Kotlin!"
    x.let { outer ->
        outer.let { inner ->
            print("Inner is $inner and outer is $outer") // 이때는 it을 사용하지 않고 명시적 이름을 사용
        }
    }
}