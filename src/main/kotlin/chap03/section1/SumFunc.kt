package chap03.section1

//fun sum(a: Int, b: Int): Int { // 최상위 함수
//    return a + b
//}
//
//fun max(a: Int, b: Int): Int {
//    return if (a > b) a else b
//}
//
//fun outfunc(name: String) {
//    println("Name: $name")
//}

fun sum(a: Int = 2, b: Int = 5) = a + b

fun max(a: Int, b: Int) = if (a > b) a else b

fun outfunc(name: String) = println("Name: $name")

fun equals(a: Int, b: Int) = a == b

fun main() { // 최상위 (Top-level) 함수

//    fun sum(a: Int, b: Int): Int {
//        return a + b
//    } // 지역 함수

    val a = 3
    val b = 5

    val result1 = sum(2, 3)
    val result2 = max(a, b)
    val result3 = sum(2)
    val result4 = sum()
    val result5 = sum(b = 2)
    val result6 = equals(5, 5)

    outfunc("Sungho")
    println(result1)
    println(result2)
    println(result3)
    println(result4)
    println(result5)
    println(result6)

}

//fun sum(a: Int, b: Int): Int { // 최상위 함수
//    return a + b
//}