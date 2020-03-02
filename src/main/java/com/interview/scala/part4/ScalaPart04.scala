package com.interview.scala.part4

object ScalaPart04 {

  def main(args: Array[String]): Unit = {

    val lazyVal = m3()

    println("~~~")

    println(lazyVal)

  }

  def m1(name:String = "qz") = {
    println(name)
  }

  def m2(address:String*) = {
    for(i <- 0 to address.length){
      print(address(i)+"\t")
    }
  }

  def m3() : String = {
    println("hahaha")
    "super!"
  }


}
