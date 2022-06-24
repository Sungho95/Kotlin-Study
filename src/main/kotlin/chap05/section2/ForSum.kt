package chap05.section2

fun main() {
    var sum = 0
    for (x in 1..10) sum += x

    println("sum: $sum")

    // 하행 반복
    sum = 0
    for (x in 10 downTo 1) sum += x // 10..1 은 잘못된 사용

    println("sum: $sum")

    // 단계 증가
    for (x in 1..10 step 2) print("$x ")

    println()
    // 하행 + 단계
    for (x in 10 downTo 1 step 2) print("$x ")

}