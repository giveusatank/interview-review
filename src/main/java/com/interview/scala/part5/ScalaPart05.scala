package com.interview.scala.part5

/**
  * Scala的异常处理:
  * （1）Scala没有编译期异常，只有运行时异常
  * （2）Scala也是通过try ... catch ... finally来处理异常的
  * （3）在catch代码块中是通过模式匹配来匹配异常的类型的，越详细的
  * 异常越靠上
  * （4）Scala中如果想要实现Java中的thtows，是通过@throws注解来实现的
  */
object ScalaPart05 {




  def main(args: Array[String]): Unit = {

    //testException1()
    /*try{
      testException2()
    }catch {
      case ex:ArithmeticException => {
        println(ex.getMessage)
      }
    }
    println("12333")*/
    //println(testFinallyReturnValue)

    val person = new Person

    person.setName("qinzhen")
    person.setSalary(11.11)

    println(person.getName)
    println(person.getSalary)
    println(person)
  }


  def testException1() = {
    try {
      val a = 1
      val b = 0
      println(a / b)
    }catch {
      case ex:ArithmeticException => {
        println("123")
        println(ex.getMessage)
      }
      case ex:RuntimeException => {
        println("666")
        println(ex.getMessage)
      }
    }finally {
      println("finally!!")
    }
  }

  @throws(classOf[ArithmeticException])
  def testException2() = {
    val a = 1
    val b = 0
    println(a / b)
  }

  def testFinallyReturnValue() : Int= {
    var number = 10
    try{
      println(1 / 10)
      return number
    }catch {
      case ex:ArithmeticException => {
        println("666")
      }
    }finally {
      number+=3
      println(number+"~~")
    }
    println(number+"~~")
    number
  }

}

class Person{


  {

  }

  var name:String = _
  var salary:Double = _

  def setName(name:String) = {
    this.name = name
  }

  def setSalary(salary:Double) = {
    this.salary = salary
  }

  def getName = {
    this.name
  }

  def getSalary = {
    this.salary
  }
  override def toString = {
    s"${this.name}\t${this.salary}"
  }
}
