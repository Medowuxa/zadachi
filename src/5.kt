fun main() {
    println("Введите целое число n:")
    val n = readLine()?.toIntOrNull()

    if (n == null) {
        println("Введите корректное целое число.")
        return
    }

    println("Введите основание степени x:")
    val x = readLine()?.toIntOrNull()

    if (x == null || x <= 1) {
        println("Введите корректное основание степени больше 1.")
        return
    }

    var y = 0
    var v = 1

    while (v < n) {
        v *= x
        y++
    }

    if (v == n) {
        println("Целочисленный показатель степени: $y")
    } else {
        println("Целочисленный показатель не существует.")
    }
}
