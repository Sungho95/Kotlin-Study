# run() 활용하기
## 동작
* run() 함수는 인자가 없는 익명 함수처럼 동작하는 형태와 객체에서 호출하는 혀앹 두 가지로 사용
```kotlin
public inline fun <R> run(block: () -> R): R = return block()
public inline fun <T, R> T.run(block: T.() -> R): R = return block()
```

* 예시
```kotlin
var skills = "Kotlin"
println(skills) // Kotlin

val a = 10
skills = run {
    val level = "Kotlin level:" + a
    level // 마지막 표현식이 반환됨
}
print(skills) // Kotlin Level:10
```
