fun main () {
    try {
        println("Введите свой возраст")
        var age= readLine()!!.toInt()
        when (age) {
            in 0..5 -> println("Вы младенец")
            in 6..12 -> println("Вы ребёнок")
            in 13..19 -> println("Вы подросток")
            in 20..64 -> println("Вы взрослый")
            else -> println("Вы пожилой человек")
        }
    } catch (e:Exception) { println("Неверный формат")}
}