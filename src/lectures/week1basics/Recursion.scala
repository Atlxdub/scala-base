package src.lectures.week1basics

object Recursion {
  def main(args: Array[String]): Unit = {

  //Факториал
  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else n * factorial(n - 1)
  }

    println(factorial(4))
  }
  //Хвостовая рекурсия
  def factorialWithTailRecursion(n: Int): Int = {
    def loop(x: Int, accumulator: Int): Int = {
      if (x <= 1) accumulator
      else loop(x - 1, x * accumulator)
    }
    loop(3, 1)
  }
}
