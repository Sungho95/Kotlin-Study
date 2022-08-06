package chap06.section7

fun main() {
    data class User(val name: String, var skills: String, var email: String? = null)

    val user = User("Kildong", "default")

    val result = with (user) { //this 생략 가능
        skills = "Kotlin"
        email = "kildong@example.com"
        "Kotlin Master"
    }
    println(user)
    println("result: $result")
}