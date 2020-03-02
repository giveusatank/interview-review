package com.interview.scala.part23

/**
  * case class：样例类
  *
  * 是Scala一种特殊的类，会默认提供：
  * （1）apply方法
  * （2）unapply方法
  * （3）toString方法
  * （4）hashcode方法
  * （5）copy方法
  * （6）class 和 object
  *
  * 总之是为了模式匹配而优化的类
  *
  * _ : 忽略当前位置
  *
  * _ * : 直面所有的内容
  *
  * a @ _ * : 将后面所有内容映射到变量a上面
  *
  *
  */
object ScalaPart23 {
  def main(args: Array[String]): Unit = {

    val cat = Cat("huahua","yellow")

    cat match {

      case Cat(_,y) => println(y)

      case _ => println("Nothing!")
    }

  }

}

class Animal{

}

case class Cat(name:String,color:String) extends Animal{

}

sealed class Person{

}

class Man extends Person{

}
