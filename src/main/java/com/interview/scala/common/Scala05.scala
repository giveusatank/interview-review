package com.interview.scala.common

object Scala05 {

  def main(args: Array[String]): Unit = {
    m1()
  }

  def m1() = {
    lazy val name:String = m2
    Thread.sleep(3000)
    name
  }

  def m2() : String = {
    println("m2方法被调用了！！")
    "qinzhen"
  }
}
