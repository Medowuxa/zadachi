fun main() {
    println("Введите строку:")
    val n = readLine() ?: ""

    if (n.isEmpty()) {
        println("Строка не может быть пустой.")
        return
    }

    val c = mutableMapOf<Char, Int>()

    for (char in n) {
        c[char] = c.getOrDefault(char, 0) + 1
    }

    val s = c.toSortedMap()

    for ((char, count) in s) {
        println("$char - $count")
    }
}
