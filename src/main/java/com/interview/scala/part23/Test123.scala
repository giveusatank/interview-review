package com.interview.scala.part23

import scala.collection.mutable.ListBuffer

/**
  * Scala的偏函数：
  *
  * （1）偏函数：实际上就是对于每个元素进行判断，对于符合条件的元素进行相应处理，不符合条件的直接过滤
  *
  * {
  * case =>
  * case =>
  * }
  *
  * （2）函数的引用地址: def m1(name:String) = {}
  *
  * 实际上这个m1 或者 m1 _ 就是方法m1的引用
  *
  *
  * （3）匿名函数：高阶函数可以将一个方法作为参数，也可以返回一个函数。
  *
  * 调用的时候可以传入方法的引用或者一个匿名函数 比如 def m2(iD:Int,f1:Int => Double) =  { f1(iD)}
  *
  * val no_fun1 = (a:Int) => a.toDouble
  *
  * （4）类型推断：在传入一个匿名函数的时候，根据函数的形参可以类型 因此m2(123,a => a.toDouble)
  *
  * 进一步还可以化简，匿名函数中使用_来匹配匿名函数=>左边的参数位置，要求就是_个数必须和参数相同，且没有重复使用的输惨
  *
  *
  * 闭包的概念：
  *
  * 就是一个函数的返回值是一个匿名函数，这个匿名函数的的参数和该方法就形成了闭包
  *
  * 柯力化：将一个传入多个参数的函数转换为传入一个参数的过程
  *
  *
  *
  *
  *
  */
object Test123 {

  def main(args: Array[String]): Unit = {

    val list1: Seq[Any] = List(1, 2, 3, 4, 5.6, "abc")

    val list2 = list1.collect {
      case a: Int => a + 1
      case b: Double => (b * 2).toInt
    }

    println(list2)

    val func1: (Int) => String = (a: Int) => {
      a.toString
    }

    func2(func1)

    func2((a: Int) => a.toString)

    func2(fun_3 _)

    //测试匿名函数
    val no_func1 = (number: Int) => Math.sqrt(number / 2)
    println(fun_4(no_func1, 5))

    fun_5(3)(0)

    println(fun_6("1", "2", "3", _ + _ + _))

    println(func_7("JAVA")("入门到放弃"))
    println(func_7("Scala")("入门到放弃"))
  }

  def func1(f: PartialFunction[Any, Int], l: Seq[Any]) = {
    var resList: List[Int] = Nil
    for (ele <- l) {
      val n: Int = f(ele)
      resList = resList :+ n
    }
    resList
  }

  def func2(f: Int => String) = {

  }

  def fun_3(a: Int): String = {
    a.toString
  }

  def fun_4(f1: Int => Double, number: Int): Double = {
    f1(number)
  }

  def fun_5(x: Int) = {
    //返回一个匿名函数
    (y: Int) => x - y
  }

  def fun_6(a:String,b:String,c:String,f: (String, String, String) => String) = {
    f(a,a,c)
  }

  /*def fun_7[T1, T2, T3](t1: T1, t2: T2, t3: T3, f: (T1, T2) => T3) : T3 = {
    f(t1,t1)
  }*/

  def func_7(fileName:String) = {
    (x:String) => {
      if("JAVA".equals(fileName)){
          x+".java"
      }else {
         x+".other"
      }
    }
  }

  def testCurry(x:String)(y:String) = {

  }
}


