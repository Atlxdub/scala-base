package src.playground

import java.util.jar.Attributes.Name
import scala.annotation.tailrec
import scala.jdk.Accumulator


object ScalaPlayground {
  def main(args: Array[String]): Unit = {
    // Удаление "лишних" пробелов + реверс
    /*
    val input = "i                 4mo               scala"
    val dab = input.split("\\s+").reverse.mkString(" ").trim
    println(dab)
*/
    //Практика
    // 1
    /*
    abstract class Account
    case class PersonalAccount() extends Account
    case class BusinessAccount() extends Account

    abstract class Bank
    case class HeadOffice() extends Bank {
      def openAccount(accountType: String): Account = {
        if (accountType == "business") BusinessAccount()
        else PersonalAccount()
      }
    }

    case class Branch() extends Bank {
      def openAccount(accountType: String): Account = {
        if (accountType == "business") BusinessAccount()
        else PersonalAccount()
      }
    }

    val branch = Branch()
    val account = branch.openAccount("business")

    println(account)*/
    // 2

    sealed trait AccountType
    class FreeAccount extends AccountType
    class PaidAccount extends AccountType

    sealed trait SubscriptionStatus

    class Subscribed extends SubscriptionStatus
    class Unsubscribed extends SubscriptionStatus
    class SubscriptionMissingData extends SubscriptionStatus

    class Settings {
      case class AccountSettings(
                                  email: String,
                                  password: String,
                                  picture: String)

      case class SubscriptionSettings(
                                       paymentMethod: String,
                                       notifications: String,
                                       expiration: String)
    }

    class Unsubscriber {
      def unsubscribe(accountId: Int): Unit = println(s"$accountId unsubscribed")
    }

    class Account(
                   accountId: Int,
                   accountType: AccountType,
                   settings: Settings.AccountSettings) {

      def info(): Unit = println(s"Account Type: $accountType")

      def subscribe(accountId: Int): Unit = println(s"$accountId ${settings.email} subscribed")

      def performAction(): Unit
    }

    class BaseAccount extends Account(
      accountId: Int,
      accountType: AccountType,
      settings: Settings.AccountSettings) {

      def performAction(): Unit = {
        subscribe(this.accountId)
      }
    }

    class PrivilegedAccount extends Account(
      accountId: Int,
      accountType: AccountType,
      settings: Settings.AccountSettings,
      subscriptionStatus: SubscriptionStatus) {

      override def performAction(): Unit = {
        unsubscribe(this.accountId)
      }
    }

  }
}
//Переопределение унарного метода (_+)
  /*
    class Person(val name: String) {

      def unary_+ : Person = Person(s"$name NoSurname")
    }
    // наследование классов
    /*case class Restaurant(name: String = "Unique Cafe" ) {
      def info(): Unit = println(s"This is $name")

    }

    class Cafe () extends Restaurant // ошибка: Unspecified value parameters: name: String*/
    val bob = new Person("Bob")
    val alice = new Person("Alice")
    println((+bob).name) // Bob NoSurname
    println((+alice).name) // Alice NoSurname
*/
  /*trait trTest() {
    def empty(): Unit = s"button -test- has been clicked"
  }

    // задача с кнопками. класс с обычной кнопкой, закругленной и тестовый класс
  class Button extends trTest (label: String) {
    def click(): String = s"button -${label}- has been clicked"
  }

 class RoundedButton(label: String) extends Button (label) {
    override def click(): String = s"rounded button -${label}- has been clicked"
  }

 class TestButton extends Button {
    override def click(): String = s"test ${super.click()}"
  }*/
//Рекурсия со степенью двойки
  /*def powerOfTwo(n: Int): BigInt = {
    @tailrec
    def loop(x: Int, accumulator: BigInt = 1): BigInt = {
      if (x <= 0) accumulator
      else loop(x - 1, 2*accumulator)
    }
    loop(n)
  }*/
// сумматор x+y n-раз и вывод столько раз, сколько символов в результате Int
  /*def sumRepeat2(x: Int, y: Int, n: Int): Unit = {
    @tailrec
    def loop(t: Int = 0, g: Int, i: Int): Int = {
      def lgStr(a: Int): Int = {
        if (a < 1)
          print("is the result")
          a
        else {
          print(s"$t ")
          lgStr(a - 1)
        }
      }
      if (i <= 0) {
        lgStr(t.toString.length)
        t
      }
      else {
        loop(t + g, g, i - 1)
      }
    }
    loop(x, y, n)
  }*/
  // Базовая работа с классами
  /*class Employee(val name: String, var salary: Double) {
    def this() = this("Empty", 0)
  }

  val employee = new Employee()
  println(s"${employee.name}'s salary is ${employee.salary}")*/
/*
  //класс с методом объединрения имени и фамилии и присвоении id
  class Instructor(instructorId: Int, name: String, surname: String) {
    def fullName(): String = name.capitalize.trim() + " " + surname.capitalize.trim()

    def idInst(): Int = this.instructorId

  }

  // класс с 3-я методами, 1 - получает id курса и инструктора, 2 - проверяет связь инструтора и курса, 3 -
  class Course(courseId: Int, title: String, var releaseYear: String, instructor: Instructor) {
    def getId(): String = (s"$courseId${instructor.idInst()}")

    def isTaughtBy(instructor: Instructor): Boolean = {
      if ((instructor.fullName() + instructor.idInst()) != this.instructor.fullName() + this.instructor.idInst())
        false
      else
        true
    }

    def copyCourse(newReleaseYear: String): Course = {
      releaseYear = newReleaseYear
      this
    }
  }*/


