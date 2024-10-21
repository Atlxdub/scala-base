package src.lectures.week1basics

object StringOperations {
  def main(args: Array[String]): Unit = {
    /*val aString: String = "Hello, world!"

        println(aString.length) // выводит 13
        println(aString.charAt(1)) // выводит e
        println(aString.substring(0, 2)) // выводит He
        println(aString.split(" ").toList) // выводит List(Hello,, world!)
        println(aString.startsWith("He")) // выводит true
        println(aString.replace("!", ".")) // выводит Hello, world.
        println(aString.toLowerCase) // выводит hello, world!
        println(aString.toUpperCase) // выводит HELLO, WORLD!
        println("abcd".reverse) // выводит dcba
        println("abcd".take(2)) // выводит ab

        val aNumber = "42".toInt
        println(aNumber)
        println(aNumber.toString.getClass)
    // интерполяция строк
    val name = "John"
    // s - интерполятор строк. Для нескольких переменных используется {}
    println(s"hello , $name")
    //raw - интерполятор, показывающий все символы обработки строки
    println(raw"This is \n a string with raw")
    println("This is \n a string without raw")
*/
    val link = "https://stepik.org"
    println(s"The link is ${link.toUpperCase}")
  }
}
