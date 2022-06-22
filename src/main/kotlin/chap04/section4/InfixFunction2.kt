package chap04.section4

fun main() {
    val num = 3
    //var str = num.strPlus("Kotlin")

    var str = num strPlus "Kotlin"
    println(str)
}

infix fun Int.strPlus(x: String): String{
    return "$x version $this"
}