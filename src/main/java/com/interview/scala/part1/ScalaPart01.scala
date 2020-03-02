package com.interview.scala.part1

import scala.collection.{immutable, mutable}

/**
  * （1）测试一下Scala的转移符
  *
  * （2）测试字符串占位符
  *
  * （3）Scala中的类继承关系：
  *
  *   最上层Any 子类 AnyRef、AnyVal
  *
  *   AnyRef的子类有Scala的集合、Java的所有类、Scala自定义类
  *
  *   Null类是AnyRef的子类，只有一个实例对象null
  *
  *   AnyVal的子类有Double、Float、Int、Boolean，Unit
  *
  *   Unit表示范围值为空，即Java中的void，只有一个实例()
  *
  *   Nothing是所有类型的子类
  *   如果一个方法的返回值类型为Nothing，表示这个方法没有正常的返回值，只能是异常
  */
object ScalaPart01 {

  def main(args: Array[String]): Unit = {

    val list_1 = List[Double](12)
    val list_2 = List[String]("123")

    println(list_1.getClass)
    println(list_2.getClass)

    var immuSet = Set(1,2,3)
    immuSet += 123
    println(immuSet)

    val muSet = mutable.Set(1,2,3)
    muSet += 34
    muSet.add(6)
    println(muSet)

    println("\t")
    println("\n")
    println("\\")
    println("\\t")
    println("\\n")

    val name = "qinzhen"
    val address = "beijing"

    println(s"姓名为:${name}\t地址为:${address}")

    val b1:Boolean = true

    val map: immutable.Map.type = null

    println(10.toString.isInstanceOf[String])

    val animal:Animal = new Dog

    animal.m1()

    if(animal.isInstanceOf[Dog]) {
      val dd = animal.asInstanceOf[Dog]
      dd.m2()
    }

  }

  def m1() : Nothing = {
    throw new Exception("123")
  }
}

class Animal {

  def m1() = {
    println("Animal!")
  }
}

class Dog extends Animal{

  def m2() = {
    println("Dog!")
  }
}