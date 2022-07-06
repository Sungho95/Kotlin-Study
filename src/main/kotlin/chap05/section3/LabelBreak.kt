package chap05.section3

fun labelBreak() {
    println("labelBreak")
    first@ for (i in 1..5){
        second@ for (j in 1..5){
            if (j == 3) break@first // for문을 벗어난 뒤 첫 번째 for문 실행
            println("i: $i, j: $j")
        }
        println("after for j")
    }
    println("after for i")
}

fun main() {
    labelBreak()
}