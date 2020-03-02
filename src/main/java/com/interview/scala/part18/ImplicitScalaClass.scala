package com.interview.scala.part18

object ImplicitScalaClass {
  implicit def DoubleConvert(number:Double) : Int = {
    number.toInt
  }

  implicit def PersonConvert(p:Person) : SuperMan = {
    new SuperMan
  }
}
