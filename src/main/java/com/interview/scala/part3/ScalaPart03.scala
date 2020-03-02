package com.interview.scala.part3
import scala.collection.immutable
import scala.util.control.Breaks

/**
  * （1）Scala的if
  *
  * （2）Scala的for循环
  *   1.普通for循环
  *   2.多层for循环
  *   3.守卫模式
  *   4.yield用法
  *
  * （3）Scala的break使用
  *
  * val loop = new Breaks()
  *
  * loop.breakable{
  *
  * 将要break的代码写在里面
  *
  * loop.break
  *
  * }
  *
  */
object ScalaPart03 {

  def main(args: Array[String]): Unit = {

    /*if(true){

    }else if (false){

    }else{

    }*/

    /*for(i <- 1 to 10){
      print(i+"\t")
    }

    for(i <- 1 until 10){
      print(i+"\t")
    }

    for(i <- 1 to 10 if i % 2 == 0){
      print(i+"\t")
    }

    for(i <- 1 to 10 ; j <- 1 to 3){
        println(i + "\t" +j)
    }*/

    /*for(i <- 1 to 10 ; j = 5-i){
      println(j)
    }*/

    val res = for (i <- 1 to 10) yield 3-i

    println(res)

    val loop = new Breaks

    loop.breakable{
      for(i <- 1 to 10){
        if(i == 4){
          loop.break()
        }
        println(i)
      }
    }

  }

}
