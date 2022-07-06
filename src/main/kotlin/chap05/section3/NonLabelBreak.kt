package chap05.section3

fun nonLabelBreak() {
    println("nonLabelBreak")
    for (i in 1..5){
        second@ for (j in 1..5){
            if (j == 3) break
            println("i: $i, j: $j")
        }
        println("after for j")
    }
    println("after for i")
}

fun main() {
    nonLabelBreak()
}