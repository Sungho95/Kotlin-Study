package chap05.section4

fun main() {
    var amount = 600

    try {
        amount -= 100
        checkAmount(amount)
    } catch (e : Exception) {
        println(e.message) // 예외 메시지 출력
    }
    println("amount: $amount")
}

fun checkAmount(amount: Int) {
    if (amount < 1000)
        throw Exception("잔고가 $amount 으로 1000 이하입니다.") // 예외 발생
}