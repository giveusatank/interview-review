package com.interview.scala.part8

/**
  * 测试Scala的访问控制权限
  *
  * （1）Java的权限修饰符： public（任意位置）
  * protected（本包、子类）
  * default（本包）
  * private（本类）
  *
  * 这四种权限修饰符都能修饰属性、方法，只有public default能修饰类
  *
  * （2）Scala的权限修饰符为：default protected private
  *
  * default：任意位置
  * Scala中使用default修饰的属性，底层字节码是private，只是提供了default的get set方法，且方法名和
  * 属性名相同，效果上是default的属性
  *
  * protected修饰的属性、方法只能在子类、本类、伴生类中访问到
  *
  * private修饰的属性，会提供private的get set方法
  *
  * （3）伴生类和伴生对象之间能够相互访问到对象的private结构，还是需要对象和类名才能访问！
  *
  * （4）在Scala中没有static关键字，静态的概念是通过伴生对象来实现的，在一个原文件中object class名称相同
  * 即互为伴生类、半生对象，讲静态的属性、方法放到伴生对象中。
  *
  * （5）Scala中在权限修饰符后面[]里面，是对包的修饰，里面可以添加子包，或者this，添加子包相当于扩大了访问范围。
  * 而this表示，只能在本类使用，不会为该属性添加get set方法
  */


/*
class Person {

  private[this] val name: String = "qz"
  private val address: String = "beijing"
  private var salary: Double = 111.11
  protected val info:String = "hello"

  def m1 = {
    println(info)
    println(Person.hobby)
  }

  private[aaa] def m2() = {
    println(salary)
    Person.tt
  }
}

object Person {

  private val hobby :String = "playing"
  private var salary: Double = 111.13

  def main(args: Array[String]): Unit = {

    val person = new Person
    person.address
    person.salary

    person.salary=1
    println(person.salary)
    person.info

    person.m2()
  }

  def tt = {

  }
}

class Student extends Person{

  /*def m2 = {
    val p = new Person

    p.info
  }*/

}*/
