package src.lectures.week1basics

object Functions {
  def main(args: Array[String]): Unit = {

/*
    // вызов по значению (x: вычисляет выражение ДО ВЫЗОВА ФУНКЦИИ)
    def callByValue(x: Long): Unit = {
      println(s"call by value: x1 = $x")
      println(s"call by value: x2 = $x")
    }

    // вызов по имени ( x: => вычисляет выражение В МОМЕНТ ВЫЗОВА Ф-ИИ)
    def callByName(x: => Long): Unit = {
      println(s"call by name: x1 = $x")
      println(s"call by name: x2 = $x")
    }

    callByValue(System.nanoTime())
    callByName(System.nanoTime())
*/
    //Вложенные функции
    def aBossFunction(): String = {
      def aHelperFunction(): String = "I'm here to help"

      aHelperFunction()
    }
  }

}
