# also() 활용하기
## 동작
* also()는 함수를 호출하는 객체 T를 이어지는 block에 전달하고 객체 T 자체를 반환
```kotlin
// 표준 함수의 정의 let과 비교
public inline fun <T, R> T.let(block: (T) -> R): R = block(this)
public inline fun <T, R> T.also(block: (T) -> Unit): T { block(this); return this }
```
* also는 블록 안의 코드 수행 결과와 상관없이 T인 객체 this를 반환
```kotlin
var m = 1
m = m.also { it + 3 } // 반환을 하지 않음
println(m) // 원본 값 1
```