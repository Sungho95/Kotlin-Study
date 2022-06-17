# 익명함수
## 함수의 이름이 없는 것.

```kotlin
fun (x: Int, y: Int): Int = x + y // 함수 이름이 색량됨

val add: (Int, Int) -> Int = fun(x, y) = x + y // 익명 함수를 사용한 add를 선언
val result = add(10, 2)
```

```kotlin
// 람다식과 매우 흡사
val add = fun(x: Int, y: Int) = x + y
val add = {x: Int, y: Int -> x + y}
```

* 일반 익명 함수에서는 return, break, continue가 사용 가능하지만,
* 람다식에서는 사용하기가 어렵다.(라벨 표기법과 같이 사용해야 하기 때문)

# 인라인 함수
## 함수가 호출되는 곳에 내용을 모두 복사
## 함수의 분기 없이 처리 -> 성능 증가

### 인라인 함수의 단점
* 코드가 복사되므로 내용이 많은 함수에 사용하면 코드가 늘어남

### noinline 키워드
* 일부 람다식 함수를 인라인 되지 않기 위해 사용
* ```kotlin
  inline fun sub(out1: () -> Unit, noinline out: () -> Unit)
  ```
  
### crossinline 키워드
* 비지역 반환 문제를 해결하기 위해 사용
* 람다식 내부 리턴을 금지


# 확장 함수(Extension Function)
## 클래스의 멤버 함수를 외부에서 더 추가할 수 있다.
```
fun 확장대상.함수명(매개변수, ...): 반환값 {
    ...
    return 값
}
```