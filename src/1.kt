fun main() {
    println("Введите строку:")
    val n = readLine() ?: ""

    if (n.isEmpty()) {
        println("Строка не может быть пустой.")
        return
    }

    val r = StringBuilder()
    var c = 1

    for (i in 1 until n.length) {
        if (n[i] == n[i - 1]) {
            c++
        } else {
            r.append(n[i - 1])
            if (c > 1) r.append(c)
            c = 1
        }
    }

    r.append(n.last())
    if (c > 1) r.append(c)

    println("Результат: $r")
}


