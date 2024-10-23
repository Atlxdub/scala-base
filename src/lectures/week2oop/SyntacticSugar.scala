package src.lectures.week2oop
import scala.language.postfixOps
// Синтаксический сахар позволяет визуально легче воспринимать код
object SyntacticSugar {
  def main(args: Array[String]): Unit = {
    val bob = new Person("Bob", "Developer")

  }

  class Person(name: String, jobTitle: String) {
    def apply(company: String): Unit = println(s"$name works as a $jobTitle in $company")
  }

  val bob = new Person("Bob", "Developer")
  bob ("Samsung")
  bob apply "Samsung"
  bob.apply("Samsung")
  bob("Samsung")
}
