# with() 활용하기
## 동작
* 인자로 받는 객체를 이어지는 block의 receiver로 전달하며 결과값을 반환
  * run() 함수와 기능이 거의 동일한데, run의 경우 receiver가 없지만 with()에서는 receiver로 전달할 객체를 처리
```kotlin
// 표준 함수 정의
public inline fun <T, R> with(receiver: T, block: T.() -> R): R = receiver.block()
```

* with는 세이프 콜(?.)은 지원하지 않기 때문에 다음과 같이 let과 같이 사용
```kotlin
supportActionBar?.let {
    with(it) {
        setDisplayHomeAsUpEnabled(true)
        setHomeAsUpIndicator(R.drawable.ic_clear_white)
    }
}
```
