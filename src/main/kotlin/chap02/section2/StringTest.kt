package chap02.section2

fun main() {
    var str1: String = "Hello"
    var str2 = "World"
    var str3 = "Hello"
    val str4 = "Hello"

    println("str1 === str2 ${str1 === str2}")
    println("str1 === str3 ${str1 === str3}") // 주소는 같지만 변수 이름만 다름.
    println("str1 === str3 ${str1 === str4}") // val(불변형)도 마찬가지.
}