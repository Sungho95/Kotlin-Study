package chap05.section4

fun main() {
    val a = 6
    val b = 0
    val c: Int

    try {
        c = a / b
        println("result: $c")
    } catch (e: Exception) {
        println("Exception")
    } finally {
        println("Finally")
    }
}