package com.interview.scala.part21

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer


/**
  * Scala的高阶函数：
  *
  * 高阶函数：能够接受函数作为参数的函数
  *
  * （1）在Scala中，函数也是作为一个对象看待的，即函数也是通过引用来定位的
  *
  * （2）def hello(name:Stirng) = {}
  *
  * hello() ： 表示调用hello函数，但是什么参数也没有传入
  * hello _ : 表示的是hello方法的引用地址
  *
  *
  * （3）传入方法的引用，或者匿名方法即可
  * val func1 = (a:Int) => a.toDouble
  * val func2 = () => (a:Int)
  *
  * 【1】map：一对一
  * 【2】flatMap：一对多，并将多压平
  * 【3】filter：返回为true保留
  *
  * 化简: reduceLeft reduceRight
  *
  * reduceLeft：需要传入 (T,T) => T
  * 第一个T表示结果，第二个T表示左边一个新元素
  *
  * reduceRight：需要传入 (T,T) => T
  * 第二个T表示结果，第一个T表示左边一个新元素
  *
  *
  * 折叠：foldLeft foldRight
  *
  * 可以设置一个起始值
  *
  * 扫描：scanLeft scanRight
  *
  * 和折叠一样，只是返回值为每次的结果的集合
  *
  * 拉链：zip
  * list1.zip(list2)
  *
  * 将list1中的每个元素和list2的对应元素行为一个二元组，如果两个list元素个数不一致则会造成数据丢失
  *
  *
  *
  */
object ScalaPart21 {

  def main(args: Array[String]): Unit = {

    //将方法引用赋值给变量
    /*val func_1: (Double) => Int = func1 _
    println(test1(func_1, 3.5))
    test1((d:Double) => d.toInt,5.6)

    val func_2 = () => {
      "123"
    }

    val func_3 = () => Unit
    val func_4: (Int) => Unit = (a:Int) => ()
    val list1 = List[Int](1,2,3,4,5,6)
    val resList = mapList((a:Int) => a*3,list1)
    println(resList)*/

    val list1 = List("aaa", "bc", "cee")
    val resList1 = list1.map(mapList2 _)
    println(resList1)

    val resList2 = list1.flatMap(x => x)
    println(resList2)

    val resList3 = list1.filter(x => x.length > 2)
    println(resList3)

    val list2 = List(1, 2, 3, 4, 5)

    val res1: Int = list2.reduceLeft[Int]((res_, new_) => res_ - new_) //((1-2)-3)-4 -5  -13
    val res2 = list2.reduceRight[Int]((a, b) => a - b) // 5 - 4
    val res3 = list2.reduceRight[Int]((a, b) => b - a)

    println(res1)
    println(res2)
    println(res3)

    val res4 = list2.reduceLeft((res, newE) => if (res < newE) res else newE)
    println(res4)

    println(list2.scanLeft(10)((a, b) => a - b))


    val ll1 = List(1, 2)
    val ll2 = List("a", "b", "c")
    val ll3 = ll1.zip(ll2)
    println(ll3)

    val init = mutable.HashMap[Char, Int]()
    val arrBuffer = mutable.ArrayBuffer[Char]()

    val sentences = "AAAAABBBBBBBBBBBBBCCCCCCCCCDDDDDDDDDDDEEEEEEEEE"

    val res: mutable.Map[Char, Int] = sentences.foldLeft(init)((res: mutable.HashMap[Char, Int], next: Char) => {
      res.put(next, res.get(next).getOrElse(0) + 1)
      res
    })

    for ((k, v) <- res) {
      println(k + "\t" + v)
    }

    val resArr: mutable.Seq[Char] = sentences.foldLeft(arrBuffer)((res:ArrayBuffer[Char], next:Char) => {
      res.append(next)
      res
    })

    println(resArr)
  }

  def mapList2(in: String): String = {
    in.toUpperCase
  }

  def test1(f1: Double => Int, number: Double): Int = {
    f1(number)
  }

  def func1(d: Double): Int = {
    (d * 2).toInt
  }

  def mapList(func: Int => Int, list: List[Int]): List[Int] = {
    var resList = List[Int]()
    for (ele <- list) {
      resList = resList :+ func(ele)
    }
    resList
  }


}
