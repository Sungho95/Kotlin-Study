package chap05.section2

fun main() {
    var total = 0

    for (num in 1..100 step 2) { // 홀수 합
        total += num
    }
    println("total: $total")

    total = 0
    for (num in 2..100 step 2) { // 짝수 합
        total += num
    }
    println("total: $total")
}