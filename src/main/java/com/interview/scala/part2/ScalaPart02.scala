package com.interview.scala.part2

/**
  * （1）测试Scala中的算术运算符: + - * / %
  *
  * （2）Scala中没有 ++ --操作，使用+= -=代替
  *
  */
object ScalaPart02 {

  def main(args: Array[String]): Unit = {

    println(1 + 1)
    println(1 - 2)
    println(10 / 3)
    println(10 % 3)
    println(3 % 4)

    var number1 = 10
    number1+=1
    println(number1)

  }
}
