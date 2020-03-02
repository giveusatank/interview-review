package com.interview.scala.part14

/**
  * 测试Scala中的抽象类
  *
  * 抽象类可以有抽象方法也可以有非抽象方法
  *
  * Scala中的特质trait类似于Java中的抽象方法+接口
  *
  * Scala中的抽象方法和特质有什么区别？
  *
  * （1）抽象类是类，只能单继承，但是特质可以多继承（extends traitA with traitB with traitC ...）
  *
  * （2）抽象类有构造器、特质没有构造器
  *
  * （3）特质支持动态混入
  *
  *
  * Scala中一个抽象类可以继承抽象类然后重写其抽象方法
  * Scala中一个特质可以继承一个特质，重写其抽象方法
  *
  * Java中的抽象类可以重写其抽象父类的抽象方法
  *
  * Java的接口中可以有三种方法：
  * （1）抽象方法
  * （2）默认方法：default
  * （3）静态方法: static
  */
object ScalaPart14 {
  def main(args: Array[String]): Unit = {

    val p = new Person

    val app = new AAP {}
    app.m2()
  }
}


abstract class Animal {
  print("666")
  def m1() = {
    println("dsdsds")
  }

  def m2()
}

object Dog extends Animal{
  print("123")
  override def m2(): Unit = {

  }
}

class Person{
  println("Person")

  {
    println("21")
  }

}

trait CC{


}

abstract class AAP extends Animal{

  override def m2() = {
    println("666")
  }

}