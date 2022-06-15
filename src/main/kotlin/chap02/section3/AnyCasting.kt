package chap02.section3

fun main() {
    var a: Any = 1
    println("a: $a type: ${a.javaClass}")

    a = 20L
    println("a: $a type: ${a.javaClass}")

    a = "Sungho"
    println("a: $a type: ${a.javaClass}")

    println(checkArg(5))
    println(checkArg("Sungho"))
    println(checkArg(55.5))
}

fun checkArg(x: Any) {
    if (x is String) {
        println("x is String: $x type: ${x.javaClass}")
    } else if (x is Int) {
        println("x is Int: $x type: ${x.javaClass}")
    } else {
        println("x is not String and Int: $x type: ${x.javaClass}")
    }
}