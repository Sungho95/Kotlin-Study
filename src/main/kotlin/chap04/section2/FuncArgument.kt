package chap04.section2

fun sum(a: Int, b: Int) = a + b

fun mul(a: Int, b: Int): Int {
    return a * b
}

fun funcFunc(a: Int, b: Int) =  sum(a, b)

fun main() {

    val result = sum(10, 10)
    val result2 = mul(sum(10, 5), 10)
    val result3 = funcFunc(2, 3)

    println("result: $result")
    println("result2: $result2")
    println("result3: $result3")

}