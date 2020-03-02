package com.interview.scala.part12

/**
  * Java的属性覆盖：
  *
  * Java在继承中，方法可以被重写，但是属性不能被重写。在子类中，如果和父类有着相同的属性名，则父类的被隐藏。
  *
  * 方法的调用编译时看引用类型，运行时看真实类型。
  *
  * 属性的调用，只看引用类型，不看真实类型。
  *
  *
  * 总结一下：如果是调用非静态方法，那么会有动态绑定。
  *
  * 如果是调用属性（对象.属性 、this.属性） ,不会有动态绑定，即属性只取决于引用类型以及this所在的类
  *
  *
  * Scala的属性重写：
  *
  * （1）Java的属性是不能重写的，但是Scala的属性能够重写，使用override关键字，Scala中不允许子类和父类属性名相同，除非使用重写
  *
  * （2）Scala中有抽象属性的概念，就是没有初始化过的字段，包含抽象属性的类是抽象类
  *
  * （3）Scala中属性和方法都是动态绑定的
  *
  *
  * Scala的匿名内部类：和Java一样，如果我们要实例化一个接口或者抽象类，必须重写抽象方法，
  * 每次自定义一个类实现接口或者继承抽象类非常麻烦，因此可以使用匿名内部类
  *
  */
object ScalaPart12 {

  def main(args: Array[String]): Unit = {

    val car = new Benz

    car.show()
    car.run()

    println(car.name)
    println(car.price)

    new Monster {
      override def m1(): Unit = {
        println(this.name)
      }
      override val name: String = "qinzhen"
    }.m1()
  }
}

class Animal {

  val name: String = "xiaoming"

}

class Dog extends Animal {

  override val name: String = "gouzi"
}

abstract class Creature {
  val name: String
}

class Human extends Creature {
  override val name: String = "qinzhen"
}

abstract class Car {
  val name: String
  val price: Double
  val address: String = "China"

  def show()

  def run() = {
    println("Car is runnning!!")
  }
}

class Benz extends Car {
  override val name: String = "Benz"
  override val price: Double = 30000.88

  override def show(): Unit = {
    println("Benz is showing!")
  }
}

abstract class Monster {

  val name:String

  def m1()
}
