package chap05.section3

fun main() {
    for(i in 1..5) {
        if (i == 3) break
        println(i)
    }
    println()
    println("outside")
}