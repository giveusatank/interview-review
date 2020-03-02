package com.interview.scala.part18

/**
  * 测试Scala的隐式转换
  *
  * （1）隐式方法：
  *
  * （2）隐式参数：
  *
  * （3）隐式类：
  *
  *
  * 隐式陷阱：
  * （1）二义性
  * （2）无线递归调用
  *
  *
  * 隐式转换的时机：
  * （1）调用方法没有传参
  * （2）参数类型不匹配
  * （3）调用对象的方法找不到
  */

import com.interview.scala.part18.ImplicitScalaClass._

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object ScalaPart18 {

  implicit val ss: Int = 123

  implicit def stringConvert(name: Int) = {
    name.toString
  }

  def main(args: Array[String]): Unit = {
    /*val a: Int = 3.5
    val p = new Person
    p.fly*/

    //隐式参数的优先级：（1）传入的参数 （2）隐式参数 （3）默认参数
    hello1("123")
    hello1

    show(123)

  }

  mutable.HashMap

  def hello1(implicit name: String = "QZ") = {
    println(name)
  }


  def show(name: String) = {
    println(name)
  }

}

class CCC {


}

trait AAA {

  implicit class AAA(val p: Person) {
    def addHook() = {
      println("666")
    }
  }

}

class Person extends CCC with AAA {

}

class SuperMan {

  def fly = {
    println("i can fly!!")
  }

}

class ScalaImplicitClass {

  def m1 = {
    val p = new Person
  }
}

object Person {

}
