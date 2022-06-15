/* 자료형
* 기본형 : 가공되지 않은 순수한 자료형으로 프로그래밍 언어에 내장
* int, long, float, double 등

* 참조형 : 동적 공간에 데이터를 둔 다음 이것을 참조하는 자료형
* Int, Long, Float, Double 등
*/

/* 변수
* val(value) : 불변형(immutable)
* var(variable) : 가변형(mutable)
*/

// val username[: String] = "Sungho" []: 생략가능
// 키워드 변수 이름: 자료형 값

fun main() {
    // val username: String = "Sungho" //불변형
    var username = "Sungho" //가변형
    var username2: String
    username2 = "Gildong"
    var count = 3
    username = "Dooly"
    println("username: $username, count: $count, username2: $username2")
}

/* 표기법
* 일반 변수, 함수명
* userName
* classNumber
* numberOfBooks

* 클래스, 인터페이스
* AnumalCategory
* CarEngine
* */