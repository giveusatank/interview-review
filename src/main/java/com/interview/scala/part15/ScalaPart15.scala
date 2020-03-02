package com.interview.scala.part15

/**
  * Scala的特质
  *
  * 注意：所有的Java接口都可以当作Scala的特质使用
  *
  *
  * Scala的特质中可以有抽象方法也可以有非抽象方法，
  * （1）如果只有抽象方法底层对应就是一个接口
  * （2）如果有抽象方法还有非抽象方法那么底层就是一个接口+一个抽象类
  *
  *
  *
  * （1）静态混入：
  * 对于静态混入时候的构造器顺序：如果有父类那么extends后面一定是父类
  * 从左到右，依次检查，如果其有父类则先调用其父类构造器
  * 最后调用当前类构造器
  *
  * （2）动态混入:
  *
  *  动态混入特质的声明顺序是，从左往右，依次构建实例，同时构建每个实例时要根据先父再子的顺序构建。
  *
  *  new A with B with C
  *
  *  构建class A，然后混入特质B，特质C
  *
  *
  *  调用顺序，从右往左，特质中入股遇到super，先找前面一个特质，如果前面没有特质再看父特质。
  * 【注意，如果左边的特质是父特质的父类特质，那么不会直接调用该特质，而是一层一层调用】
  *
  *
  * （3）Scala中富接口：带有抽象方法、非抽象方法的特质
  *
  *
  */
object ScalaPart15 {
  def main(args: Array[String]): Unit = {
    //Creature
    //Animal
    //特质A
    //特质B
    //Dog
    /*val d = new Dog

    val aAImpl = new AAImpl
    aAImpl.m2

    new AA {
      override def m2: Unit = ???

      override val name: String = _
    }

    val bb = new BB {}*/
    //Pet
    //Cat
    //AAA
    //BBB
    //CCC
    //DDD
    val cat = new Cat with LLL with DDD
    cat.info()



  }
}

trait A {
  println("特质A")
}

trait B extends A {
  println("特质B")
}

class Creature {
  println("Creatue!!")
}

class Animal extends Creature {
  println("Animal!!")
}

class Dog extends Animal with B with JavaInter {
  println("Dog!!")

  override def m1(): Unit = {

  }
}


trait AA {
  val name: String

  def m2

  def m3(address: String) = {
    println(address)
  }
}

trait BB extends AA {
  override val name: String = "OO"

  override def m2: Unit = {
    println(this.name)
  }

  override def m3(address: String): Unit = {
    println("666788")
  }
}

class AAImpl extends AA {
  override val name: String = "Q"

  override def m2: Unit = {
    println(this.name)
  }
}


trait AAA{
  println("AAA")
  def info() = {
     println("111")
  }
}

trait BBB extends AAA{
  println("BBB")

  override def info(): Unit = {
    super.info()
    println("222")
  }
}

trait CCC extends BBB{
  println("CCC")

  override def info(): Unit = {
    super.info()
    println("333")
  }
}

trait LLL extends CCC{
  println("LLL")

  override def info(): Unit = {
    super.info()
    println("000")
  }
}

trait DDD extends CCC{
  println("DDD")

  override def info(): Unit = {
    super[CCC].info()
    println("444")
  }
}

trait EEE extends CCC{
  println("EEE")
  override def info(): Unit = {
    super.info()
    println("555")
  }
}


class Pet{
  println("Pet")
}

class Cat extends Pet{
  println("Cat")

}

abstract class Wolf{
  def m4()
}

trait KKK{

  def m5()
}
