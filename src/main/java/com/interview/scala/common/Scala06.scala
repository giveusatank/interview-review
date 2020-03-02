package com.interview.scala.common

object Scala06 {


  def main(args: Array[String]): Unit = {
    try{
      testScalaException2
      println("!!!")
    }catch {
      case ex:RuntimeException => println("666")
      case _ => println("888")
    }finally {
      println("异常处理完毕！")
    }
    println("&&&&")
  }

  def testScalaException() = {
    try{
      val number1 = 0
      val number2 = 1
      println(number2 / number1)
      println("~~~~~~")
    }catch{
      case ex:RuntimeException => println("666")
      case _ => println("888")
    }finally {
      println("异常处理完毕！")
    }
    println("@@@@@@@@")
  }

  @throws(classOf[RuntimeException])
  def testScalaException2() = {
    val number1 = 0
    val number2 = 1
    println(number2 / number1)
    println("~~~~~~")
  }
}
