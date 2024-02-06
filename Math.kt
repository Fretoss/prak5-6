import kotlin.math.pow
fun main () {
    try {
        println("Введите x")
        var x= readLine()!!.toDouble()
        when  {
            (x<=3) -> x=x.pow(2)-3*x+9
            (x>3) -> x= 1/(x.pow(3) +6)
        }
        println("Ответ: ${String.format("%.3f",x)}")
    } catch (e:Exception) { println("Неверный формат")}
    }