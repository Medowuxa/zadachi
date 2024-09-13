fun main() {
    println("Введите два числа и операцию (например: 5.0 3.0 +):")
    val n = readLine()?.split(" ")

    if (n == null || n.size != 3) {
        println("Неверный ввод. Введите два числа и операцию через пробел.")
        return
    }

    val num1 = n[0].toDoubleOrNull()
    val num2 = n[1].toDoubleOrNull()
    val operation = n[2]

    if (num1 == null || num2 == null) {
        println("Введите числа больше нуля.")
        return
    }

    val result = when (operation) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else "Ошибка: деление на ноль."
        else -> "Неизвестная операция."
    }

    println("Результат: $result")
}
