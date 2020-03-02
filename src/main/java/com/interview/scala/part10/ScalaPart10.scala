package com.interview.scala.part10

/**
  * OOP的三大特性：
  * （1）封装：将抽象出来的属性和对属性的操作封装在一起，保护内部属性的安全。
  *
  * （2）继承：继承是为了解决代码复用问题，Java、Scala都是单继承。（不允许有多个父类）
  *
  * （3）多态:
  *
  *
  * Scala中的继承：
  * （1）重写方法:override关键字
  * （2）调用父类方法:super关键字
  *
  *
  * Scala中的isInstanceOf和asInstanceOf
  */
object ScalaPart10 {
  def main(args: Array[String]): Unit = {

    val an: Animal = new Dog

   /* println(an.isInstanceOf[Animal])
    println(an.isInstanceOf[Dog])*/
    an.shout

    val dog: Dog = an.asInstanceOf[Dog]
    dog.shout

  }
}

class Animal {

  val name: String = "animal"

  def shout = {
    println("我是Animal!")
  }
}

class Dog extends Animal {

  override def shout = {
    println("我是Dog!")
  }

  def m1 = {
    println("666")
  }
}
