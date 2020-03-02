package com.interview.scala.part16

/**
  * 特质的扩展，trait A extends B(class)
  *
  * 特质也可以继承一个class，如上 ，那么 一个类C混入特质A也就意味着C是B的子类
  *
  * 如果类C还继承了其他的类D，那么这个D必须是B的子类！
  */
object ScalaPart16 {
  def main(args: Array[String]): Unit = {
    val a = new A {}
    a.m1
  }
}

class B {

  def m1 = {
    println("666")
  }
}


trait A extends B{
  def m2 = {
    m1
  }
}

class P extends B{

}

class C extends P with A{

}