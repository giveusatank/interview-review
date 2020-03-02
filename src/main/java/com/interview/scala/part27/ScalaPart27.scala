package com.interview.scala.part27

/**
  * Scala中的协变、逆变、不变
  *
  * 可变：协变、逆变
  *
  * Java中只有不变
  *
  * 如果A是B的子类 => List[A] 是 List[B]的子类 那么就是协变
  *
  * Scala中 + 表示协变
  *         - 表示逆变
  *
  */
object ScalaPart27 {


  def main(args: Array[String]): Unit = {

    val user1: User[Dog] = new User[Animal]("qinzhen")

    //val user2: User[Animal] = new User[Dog]("haha")


  }
}

class User[-T](val name:String) {

}

class Animal{}

class Dog extends Animal{}

