package chap04.section2

// 매개변수에 람다식 함수를 이용한 고차 함수(값에 의한 호출)
// 실행 순서 lambda -> callByValue
fun main() {
    val result = callByValue(lambda())
    println(result)
}

fun callByValue(b: Boolean): Boolean {
    println("callByValue function")
    return b
}

// 변수형태로 선언된 람다식(함수 역할을 함)
val lambda: () -> Boolean = {
    println("lambda function")
    true
}
