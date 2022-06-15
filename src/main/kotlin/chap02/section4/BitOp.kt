package chap02.section4

fun main() {
    var x = 4 // 0100(2) 4(10)
    var y = 0b0000_1010 // 5(10)
    var z = 0x0f // 0b0000_1111(2) 15(10)

    println("x shl 2 -> ${x.shl(2)}") // 16(10) 0001_0000(2)
    println("x inv -> ${x.inv()}") // -5(10) 1111 ... 1011(2)

}