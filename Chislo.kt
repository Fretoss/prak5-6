fun main () {
    try {
        print("введите двухзначное число: ")
        var chislo = readLine()!!.toInt()
        when {
            chislo in 10..99 -> {
               if (chislo % 10 == 8 || chislo / 10 == 8)
               {
                   println ("В числе присутствует 8")
               } else {
                   println("В числе нет 8")
               }
            }
            else -> println("Введено не двузначное число1")
        }
    } catch (e:Exception) { println("Неверный формат")}
}
