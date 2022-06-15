package chap02.section2

// 지수부와 가수부의 주의사항
fun main() {
    var num: Double = 0.1

    for (x in 0..999) {
        num += 0.1
    }
    println("num: $num")
}