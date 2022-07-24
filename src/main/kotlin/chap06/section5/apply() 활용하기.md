# apply() 활용하기

## 동작
* apply() 함수는 also() 함수와 마찬가지로 호출하는 객체 T를 이어지는 block으로 전달하고 객체 자체인 this를 반환
```kotlin
public inline fun <T, R> T.let(block: (T) -> R): R = block(this)
public inline fun <T> T.also(block: (T) -> Unit): T { block(this); return this }
public inline fun <T> T.apply(block: T.() -> Unit): Unit = { block(); return this }
```
* T.()와 같은 표현에서 람다식이 확장 함수로서 처리

## 레이아웃 초기 시 기존 코드
```kotlin
val param = LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT)
param.gravity = Gravity.CENTER_HORIZONTAL
param.weight = 1f
param.topMargin = 100
param.bottomMargin = 100
```

```kotlin
val param = LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT).apply {
    gravity = Gravity.CENTER_HORIZONTAL
    weight = 1f // param을 사용하지 않고 직접 값을 지정할 수 있다.
    topMargin = 100
    bottomMargin = 100
}
```