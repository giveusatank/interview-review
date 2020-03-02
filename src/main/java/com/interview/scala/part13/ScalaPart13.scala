package com.interview.scala.part13

/**
  * 测试Scala的伴生类和伴生对象
  *
  * （1）Scala中没有静态的概念，但是可以使用伴生对象实现静态的效果。
  *
  * （2）在一个Scala源文件中，class A 和 object A 互为伴生类和伴生对象。
  * 编译之后为：A.class 和 A$.class
  *
  * （3）可以理解为Object里面的属性、方法全都是静态的，class里面的属性、方法全为非静态的
  *
  * （4）伴生类和伴生对象之间能相互调用私有属性、方法
  *
  * （5）伴生对象里面的apply方法，可以实现 类名() 直接创建对应类的实例
  *
  *
  */
object ScalaPart13 {
  def main(args: Array[String]): Unit = {

    val d = Dog("gouzi!!")
    d.show()
  }
}

class Dog(val name:String){
  def show(): Unit = {
    println(this.name)
  }
}

object Dog{
  def apply(name:String): Dog = new Dog(name)
}
