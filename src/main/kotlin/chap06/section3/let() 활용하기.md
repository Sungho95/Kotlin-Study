# let() 활용
## let 동작
* 함수를 호출하는 객체 T를 이어지는 block의 인자로 넘기고 block의 결과값 R을 반호환```kotlin
```kotlin
public inline fun <T, R> T.let(block: (T) -> R): R { ... return block(this) }
```
* 매개변수 block은 T를 매개변수로 받아 R을 반환
* let() 함수 역시 R을 반환
* 본문의 this는 객체 T를 가리키는데 람다식 결과 부분을 그대로 반환한다는 뜻
* 다른 메서드를 실행하거나 연산을 수행하는 경우 사용

## let의 중첩 사용
### 중첩 사용
```kotlin
var x = "Kotlin!"
    x.let { outer ->
        outer.let { inner ->
            print("Inner is $inner and outer is $outer") // 이때는 it을 사용하지 않고 명시적이름을 사용
        }
    }
```

### 반환값은 바깥쪽의 람다식에만 적용
```kotlin
var x = "Kotlin!"
    x = x.let { outer ->
        outer.let { inner ->
            print("Inner is $inner and outer is $outer")
            "Inner String" // 이는 반환되지 않음
        }
        "Outer String" // 문자열이 반환되어 x에 할당
    }
```

## 커스텀 뷰에서 let() 활용하기
### 안드로이드의 커스텀 뷰에서 Padding 값을 지정
#1 기본 사용
```kotlin
val padding = TypedValue.applyDimension(
    TypedValue.COMPLEX_UNIT_DIP, 16f, resources.displayMetrics).toInt()

setPadding(padding, 0, padding, 0) // 왼쪽, 오른쪽 padding 설정
```
#2 람다식을 활용
```kotlin
TypedValue.applyDimension(TypedValue.COMPLEX_UNIT,DIP, 16f,
    resources.displyMetrics).toInt().let { padding ->
    setPadding(padding, 0, padding, 0) // 계산된 값을 padding 이라는 이름의 인자로 받음
}
```
#3 it 활용
```kotlin
TypedValue.applyDimension(TypedValue.COMPLEX_UNIT,DIP, 16f,
    resources.displyMetrics).toInt().let {
        setPadding(it, 0, it, 0) // padding 대신 it 사용
}
```
## null 가능성이 있는 객체에서 let() 활용하기
### null 검사
let을 세이프 콜(?.)과 함께 사용하여 if (null != obj)와 같은 null 검사 부분을 대체
#1 if문을 활용한 null 검사
```kotlin
var obj: String // null일 수 있는 변수 obj
if (null != obj) {
    Toast.makeTest(applicationContext, obj, Toast.LENGTH_LONG).show()
}
```

#2 let과 세이프콜(?.)을 활용한 null 검사
```kotlin
obj?.let { // obj가 null이 아닐 경우 작업 수행 (Safe call + let)
    Toast.makeText(applicationContext, it, Toast.LENGTH_LONG).show()
}
```

### else문이 포함된 문장 대체
```kotlin
val firstName: String?
var lastName: String

if (null != firstName) {
    print("$firstName $lastName"")
} else {
    print("$lastName")
}
```
#let을 사용한 경우
```kotlin
firstName?.let { print("$it $lastname") } ?: print("$lastName")
```