package com.interview.scala.common

object Scala04 {

  def main(args: Array[String]): Unit = {

    //当方法没有形参时，可以直接方法名调用
    m1

    //return 必须声明返回值类型
    println(m2)

    //支持带名参数
    m4(name = "fengyu")

    m6("qinzhen",1,2,3,4,56,67)

    println(fabonacci(6))
  }

  def m1() = {
    println("666")
  }

  def m2() : String = {
    return "111"
  }

  def m3() = {
    777
  }

  def m4(name:String = "qinzhen",address:String="tianjin") = {
    println(name)
    println(address)
  }

  def m5(): Unit ={}

  def m6(name:String,ids:Int*) = {
    println(name)
    for(ele <- ids){
      print(ele+"\t")
    }
    println()
  }

  // 1 1 2 3 5 8 13 ...
  def fabonacci(num:Int) : Int = {
    if(num == 1 || num == 2) return 1
    fabonacci(num-1) + fabonacci(num-2)
  }


}
