package chap05.section3

fun main() {
    retFunc()
}
inline fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}
/*
fun retFunc() {
    println("Start of Func")
    inlineLambda(13, 3) { a, b ->
        val result = a + b
        if(result > 10) return // 비지역 반환으로 인해 함수를 빠져나감
        println("result: $result") // 출력 안하게 됌
    }
    println("end of retFunc") //출력 안하게 됌
}
*/

// 라벨을 넣어 인라인 함수를 의도에 맞게 조절
fun retFunc() {
    println("Start of Func")
    inlineLambda(13, 3) lit@{ a, b ->
        val result = a + b
        if(result > 10) return@lit
        println("result: $result")
    }
    println("end of retFunc")
}