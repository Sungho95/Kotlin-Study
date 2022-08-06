package chap06.section7

fun main() {
    data class User(val name: String, var skills: String, var email: String? = null)

    val user = User("Kildong", "default")

    val result = with (user) { //this 생략 가능
        skills = "Kotlin"
        email = "kildong@example.com"
        // 기본적으로 Unit 반환, 필요하면 다음과 같이 마지막 표현식 반환할 수 있음.
        "Kotlin Master" // 마지막 표현식 반환
    }
    println(user)
    println("result: $result")
}