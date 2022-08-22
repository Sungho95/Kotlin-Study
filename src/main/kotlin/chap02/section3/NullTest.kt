package chap02.section3

// 세이프 콜(?.) : 값이 null인 것을 염두
// non-null 단정 기호(!!) : 값이 null 일리가 없다는 것을 의미

fun main() {
    var str1: String?
    str1 = null
    var str2: String?
    str2 = "hello"
    val len = str1?.length ?: -1 //엘비스 연산자
    val len2 = if (str2 != null) str2.length else -1

    println("str1: $str1, length: ${str1?.length}") //세이프 콜(?.)
    println("str1: $str1, length: ${len}")

    println("str1: $str2, length: ${str2?.length}") //세이프 콜(?.)
    println("str1: $str2, length: ${len2}")

    asdasd
}

// Kotlin은 기본적으로 NotNull, Nullable 표현에는 '?' 사용