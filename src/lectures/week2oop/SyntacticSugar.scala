package src.lectures.week2oop

object SyntacticSugar {

  // Синтаксический сахар позволяет визуально легче воспринимать код
  // Пример инфиксной нотации (для методов с одним параметром)

  class Person(val name: String, jobTitle: String) {
    def worksAs(position: String): Boolean = position == jobTitle
  }

  val bob = new Person("Bob", "Developer")

}
