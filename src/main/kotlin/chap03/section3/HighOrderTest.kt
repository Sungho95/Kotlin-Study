package chap03.section3

fun highFunc(a: Int, b: Int, sum: (Int, Int) -> Int): Int {
    return sum(a, b)
}

fun main() {
    val result = highFunc(1, 3) {
            x, y -> x + y
    }
    println(result)
}

/* 함수형 프로그래밍
* 프로그램을 모듈화하여 디버깅하거나 테스트가 쉬움
* 간략한 표현식을 사용해 생산성이 높음
* 람다식과 고차함수를 사용하면서 다양한 함수 조합을 사용할 수 있음
* */