package chap04.section3

fun main() {
    val source = "Hello World!"
    val target = "Hello Kotlin!"
    print(source.getLongString(target))
}

fun String.getLongString(target: String): String =
        if (this.length > target.length) this else target

// this는 확장 대상에 있던 자리의 문자열인 source 객체를 나타냄
// 기존 표준 라이브러리를 수정하지 않고도 확장