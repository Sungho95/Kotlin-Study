package chap06.section6

fun main() {
    // apply와 run 비교하기
    // apply와 run 모두 this를 생략할 수 있음.
    data class Person(var name: String, var skills : String)
    var person = Person("Kildong", "Kotlin")

    val returnObj = person.apply {
        this.name = "Sean"
        this.skills = "Java"
        "success" // 사용되지 않음
    }
    println(person)
    println("returnObj: $returnObj")

    val returnObj2 = person.run {
        this.name = "Dooly"
        this.skills = "C#"
        "success" // success 문자열 반환
    }
    println(person)
    println("returnObj2: $returnObj2")

}