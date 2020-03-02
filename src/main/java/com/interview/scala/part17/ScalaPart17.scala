package com.interview.scala.part17

import com.interview.scala.part17

/**
  * 测试Scala中的内部类
  *
  * Java中的内部类有四种：静态内部类、成员内部类、局部内部类、匿名内部类
  *
  * （1）Java静态内部类：属于外部类的静态成分，但是是类，所以可以有静态、非静态的属性、方法
  *
  *  静态属性、方法可以通过 OutterClass.StaticInnerClass直接调用
  *
  *  非静态属性、方法通过 new OutterClass.StaticInnerClass调用
  *
  *  内部类能够访问外部类私有的成员变量
  *
  *  静态内部类只能访问外部类static的成分
  *
  *  （2）Java成员内部类，能访问外部类静态、非静态的属性、方法
  *
  *  实例化：Outter out = new Outter();
  *         InnerClass inner = out.new InnerClass();
  *
  *
  * （3）Java的局部内部类：是在Java的方法中定义的类
  *  传入局部内部类的局部变量必须是final的，因为防止出现数据的不一致
  *
  *
  * Scala中有成员内部类、静态内部类：
  *
  * （1）class中定义的内部类就是成员内部类
  *
  * （2）object中定义的内部类就是静态内部类
  *
  * 实例化方式： new OutterClass.InnerClass
  *
  * Scala的类型投影：
  * Scala的内部类实例和外部类实例是关联的
  *
  * val outter1 = new Outter
  * val outter2 = new Outter
  *
  * val inner1 = new outter1.inner
  * val inner2 = new outter2.inner
  *
  * 实际上这里面inner1和outter1   inner2和outter2是关联的
  *
  * 如果Inner里面有方法 def m1(in:Inner) = {}
  *
  * 那么调用inner1.m1只能传入inner1
  *
  * 可以使用类型投影 Outter#Inner 就和Java一样了
  *
  *
  */
object ScalaPart17 {
  def main(args: Array[String]): Unit = {
    val abc_1 = new ABC
    val abc_2 = new ABC

    val inner_1: abc_1.ScalaInnerClass = new abc_1.ScalaInnerClass
    val inner_2: abc_2.ScalaInnerClass = new abc_2.ScalaInnerClass

    inner_1.m2(inner_1)
    inner_2.m2(inner_2)

    inner_1.m3(inner_2)
  }
}


class ABC {

  outterClass =>

  val name: String = "qinzhen"
  private val salary: Double = 999.99

  class ScalaInnerClass {

    def m1 = {
      println(outterClass.name)
      println(outterClass.salary)
    }

    def m2(s:ScalaInnerClass) = {
      println(s)
    }

    //类型投影
    def m3(s:ABC#ScalaInnerClass) = {
      println(s)
    }
  }

}

object ABC {

  staticOutterClass =>
  val address: String = "Beijing"
  private val info: String = "hello"

  class ScalaStaticInnerClass {

    def m2(): Unit ={
      println(staticOutterClass.address)
      println(staticOutterClass.info)
    }
  }

}
