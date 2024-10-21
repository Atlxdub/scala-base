package src.lectures.week2oop

object ClassesOop {

  def main(args: Array[String]): Unit = {

  }
  //абстрактные классы
  abstract class Operation {
    def perfomOperation(num: Int): Unit
  }

  //val OperationName и def performOperation являются абстрактными членами класса Operation
  // без реализации экземпляр абстрактного класса создать нельзя
  // для создания экземпляра класса нужно:
  class Addition extends Operation {
    private def addTwo(num: Int) = num + 2

    override def perfomOperation(num: Int): Unit = {
      println(addTwo(num))
    }
  }

  val operation = new Addition

  operation.perfomOperation(5)


  //Анонимные классы
  /*
  val addition = new Operation {
    private  def addTwo(num :Int) = num + 2
    override def perfomOperation(num: Int): Unit = println(addTwo(num))
  }
  addition.perfomOperation(5)*/

  //Трейты
  trait Saver{
    def save (value: Int): Unit = println(s"saved value is $value")
  }
  //Т.к. класс не наследует ни от какого другого класса, используем extends, a не with
  // with используется для трейта, который необходимо добавить в наследуемый класс
  // У которого прописан суперкласс
  class Additon extends Saver {
    private def addTwo (num: Int) = num + 2

    def performOperation(num: Int): Unit = {
      val result = addTwo(num)
      save(result)
    }
    val operation = new Addition

    operation.perfomOperation(4)
  }
}

