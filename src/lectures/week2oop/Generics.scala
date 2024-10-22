package src.lectures.week2oop

object Generics {

  //Вариантность подразумевает, что можно указывать в типах классы, у которых есть наследование
  //В таком случае иерархия наследования может быть следующей:
  // 1 - Ковариантность (+) наследование будет вида: S подтип T, GenericType(S) подтип GenericType(T)
  // 2 - Контрвариантность (-) наследование вид: S подтип T, GenericType(T) подтип GenericType(S)
  // 3 - Инвариантность () наследование вид: S подтип T, GenericType(S) никак не связан с GenericType(T)

  abstract class Customer {
    def isVegetarian: Boolean
  }

  case class RegularCustomer(isVegetarian: Boolean) extends Customer
  case class NewCustomer(isVegetarian: Boolean)  extends Customer


  class Order[T <: Customer](val person: T) {
    def showMenu: String = if (person.isVegetarian) "vegetarian menu" else "ordinary menu"
  }
}