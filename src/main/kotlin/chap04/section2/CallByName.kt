package chap04.section2

// 람다식 이름을 사용한 호출
// 함수 실행 순서 callByName -> otherLambda
fun main() {
    val result = callByName(otherLambda)
    println(result)
}

fun callByName(b: () -> Boolean): Boolean {
    println("callByName function")
    return b()
}

val otherLambda: () -> Boolean = {
    println("otherLambda function")
    true
}