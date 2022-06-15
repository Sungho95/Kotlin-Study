package chap02.section3

/* 스마트 캐스트
* 구체적으로 명시되지 않은 자료형을 자동 변환
* 값에 따라 자료형을 결정
* Number 자료형은 숫자를 저장하기 위한 특수한 자료형으로 스마트 캐스트됨
*/

fun main() {
    var test: Number = 12.2
    println(test)

    test = 12
    println(test)

    test = 120L
    println(test)

    test += 12.0f
    println(test)
}