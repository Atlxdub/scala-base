package src.lectures.week1basics

object TypesValuesVariables {
  def main(args: Array[String]): Unit = {
    // Переменную можно объявить двумя способами:
    val hi = "HelloDesu"
    val hi2: String = "HelloDesu2"

    // Типы переменных:
    // Строка
    var aString = "This is string" // последовательность Char
    // Символ
    val aChar = 'C' // 16 бит
    // Целочисленные значения
    val aInt = 32 //  -2147483648 to 2147483647
    val aLong = 11L //  -9223372036854775808 to 9223372036854775807 (Буква в конце значения указывает тип переменной)
    val aByte: Byte = 123 // Значения от -128 до 127
    val aShort: Short = 32000 // Значения от -32768 до 32767
    // Значения с плавающей точкой
    val aDouble = 2.0 // 64 бит
    val aFloat = 3.0f // 32 бит
    // Подсказки по указанию типов: Float (f), Long (L),

    aString = "darova"


  }
}
