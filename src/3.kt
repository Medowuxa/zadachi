fun main() {
    println("Введите натуральное число:")
    val p = readLine()

    val n = p?.toIntOrNull()
    if (n == null || n <= 0) {
        println("Введите корректное натуральное число.")
        return
    }

    val b = n.toString(2)
    println("Двоичное представление: $b")
}
