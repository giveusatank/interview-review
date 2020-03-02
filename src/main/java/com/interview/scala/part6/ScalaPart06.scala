package com.interview.scala.part6

/**
  * 测试Scala的类的实例化：
  *
  * （1）Scala的构造器分为主构造器、辅助构造器
  *
  * （2）辅助构造器以this为方法名，构造器之间可以形成方法的重载，
  * 可以从辅助构造器开始但是最终一定要调主构造器
  *
  * （3）主构造器中的形参，如果没有任何修饰表示局部变量，
  * 如果val修饰则为不可变的成员变量，var修饰则为可变成员变量
  *
  * （4）在对类实例化的过程中，整个类体都会被执行，包括成员变量的赋值，非静态代码块的执行！
  *
  */
object ScalaPart06 {

  def main(args: Array[String]): Unit = {

    val scalaClass = new ScalaClass(100.1)

    //println(scalaClass)

  }
}


class ScalaClass(val name:String){

  lazy val address :String = getValue()
  var salary2:Double = _
  var sex2:Char = _

  {
    println("非静态代码块部分！")
  }

  def this(sex:Char) = {
    this("qinzhen")
    this.sex2 = sex
  }

  def this(salary:Double) = {
    this('m')
    this.salary2 = salary
  }

  def getValue() : String= {
    println("getValue方法执行")
    "Beijing"
  }


  override def toString = s"ScalaClass($name, $salary2, $sex2, $address)"
}
