fun main () {
    try {
        print("введите возраст первого школьника: ")
        var x = readLine()!!.toInt()
        print("введите возраст второго школьника: ")
        var y = readLine()!!.toInt()
        when (x)
        {
            in 7..16 -> println("Первый друг имеет школьный возраст")
            else -> println("Не школьный возраст")
        }
        when (y)
        {
            in 7..16 -> println("Второй друг имеет школьный возраст")
            else -> println("Не школьный возраст")
        }
    } catch (e:Exception) { println("Неверный формат")}
    }