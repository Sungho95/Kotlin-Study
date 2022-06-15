package chap02.section3

fun main() {
    val a: Int = 128
    // val b: Double = a.toDouble()
    val b = a

    val c: Int? = a
    val d: Int? = a
    val e: Int? = c

    println(c == d)
    println(c === d) // 값은 똑같지만 참조하는 주소 공간은 다름.
    println(c === e)

}