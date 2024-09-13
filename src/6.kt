fun main() {
    println("Введите первую цифру:")
    val f = readLine()?.singleOrNull()?.digitToIntOrNull()

    if (f == null || f < 0 || f > 9) {
        println("Введите корректную цифру от 0 до 9.")
        return
    }

    println("Введите вторую цифру:")
    val s = readLine()?.singleOrNull()?.digitToIntOrNull()

    if (s == null || s < 0 || s > 9 || s == f) {
        println("Введите корректную цифру от 0 до 9, отличную от первой.")
        return
    }

    val o = listOf(f, s).any { it % 2 != 0 }

    if (!o) {
        println("Создать нечетное число невозможно.")
        return
    }

    val n = mutableListOf<Int>()

    for (digit in listOf(f, s)) {
        if (digit % 2 != 0) {
            n.add(digit * 10 + (f + s - digit))
            n.add((f + s - digit) * 10 + digit)
        }
    }

    n.distinct().forEach { println("Возможное нечетное число: $it") }
}
