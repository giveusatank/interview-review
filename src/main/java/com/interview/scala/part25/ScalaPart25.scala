package com.interview.scala.part25

/**
  * Scala的控制抽象：
  * （1）接收参数为函数
  * （2）接受的函数没有接收参数，没有返回值
  *
  *  比如breakable{
  *
  *
  *  }
  */
object ScalaPart25 {

  def main(args: Array[String]): Unit = {

    testAbstractControl{
      println("666")
    }
  }

  def testAbstractControl(f:  => Unit) = {
    println("222")
    f
  }
}
