package chap04.section5

fun a() = b()
fun b() = println("b")

//fun c() = {
//    fun d() = e()
//    fun e() = println("e")
//
//}

fun main() {
    a()
//    e()
}