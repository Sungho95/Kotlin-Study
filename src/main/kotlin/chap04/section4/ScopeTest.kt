package chap04.section4

var global = 10 //전역 변수

fun main() {
    println("global: $global")

    fun localFunc1() {
        println("localFunc1")
    }
    localFunc1() //지역 함수

    global = 15 //패키지 내에서 접근 가능
    val local1 = 15//메인 함수의 지역 변수

    println("global: $global")

    userFunc()
    println("final - global: $global, local1: $local1")
}

//전역 함수
fun userFunc() {
    global = 20 //패키지 내에서 접근 가능
    val local1 = 20 //userFunc 함수의 지역 변수
    println("userFunc - global: $global, local1: $local1")
}