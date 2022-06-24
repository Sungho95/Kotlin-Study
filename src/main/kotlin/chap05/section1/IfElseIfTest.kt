package chap05.section1

fun main() {
    print("Enter the core: ")
    val score = readLine()!!.toDouble()

    var grade: Char = 'F'

    if (score >= 90.0) {
        grade = 'A'
    } else if (score >= 80 && score <= 89.9) { // score in 80..89
        grade = 'B'
    } else if (score in 70.0..79.9) { // score >= 70 && score <= 79.9
        grade = 'C'
    }

    println("score: $score, grade: $grade")
}