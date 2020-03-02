package com.interview.scala.common

object Scala02 {

  def main(args: Array[String]): Unit = {

    val a = true

    val b = false

    val ss = 1L
    println(ss.getClass)
    val dd:Int = ss.toInt

    println(ss.isInstanceOf[Int])
    try{
      println(1 / 0)
    }catch {
      case ex:RuntimeException => method1()
      case _ => println("ok")
    }

  }

  def method1() : Nothing = {
    throw new RuntimeException("出现了运行时异常！")
  }
}
