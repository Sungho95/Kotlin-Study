# use() 활용하기
## 동작
* use()를 사용하면 객체를 사용한 후 close() 등을 자동적으로 호출해 닫아준다.
```kotlin
// 표준 함수의 정의
public inline fun <T : Closeable?, R> T.use(block: (T) -> R): R
public inline fun <T : AutoCloseable?, R> T.use(block: (T) -> R): R
```
* T의 제한된 자료형을 보면 Closeable?로 block은 닫힐 수 있는 객체를 지정해야 함
* Java 7 이후는 AutoCloseable?로 사용됨

## 파일관련 처리 예
* 파일로부터 읽기 위한 자바 코드
```java
private String readFirstLine() throws FileNotFoundException {
    BufferedReader reader = new BufferedReader(new FileReader("test.file"));
    try {
        return reader.readLine();
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    return null;
}
```

* 코틀린으로 변경한 코드
```kotlin
private fun readFirstLine(): String {
    BufferedReader(FileReader("test.file")).use { return it.readLine() }
}
```

## use()의 구현부
```kotlin
...
public inline fun <T: Closeable?, R> T.use(block: (T) -> R): R {
    var exception: Throwable? = null 
    try {
        return block(this)
        } catch (e: Throwable) {
            exception = e
            throw e
        } finally {
            wher {
                apiVersionIsAtLeast(1, 1, 0) -> this.closeFinally(exception)
            this == null -> {}
            exception == null -> close()
            else ->
                try{
                close()
                } catch (closeException: Throwable) {
                    // cause.addSuppressed(closeException) // ignored here
                }
...
```