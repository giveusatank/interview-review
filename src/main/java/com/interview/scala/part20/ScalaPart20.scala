package com.interview.scala.part20

import scala.collection.{immutable, mutable}
import scala.collection.mutable.ListBuffer

/**
  *
  * 【1】 Scala的isInstanceOf[T] 判断是否为T的实例对象
  *
  * asInstanceOf[T] 将父类引用转为子类引用并返回
  *
  * 【注意】实际上无论是Java中的(Man)p ；还是Scala中的asInstanceOf[T]
  *  甚至是构造器方法的调用的返回值都是先到操作数栈中，如果没有进行引用的赋值，那么
  *  根本不会影响原先的父类引用。实际上这个父类引用向下转型变为子类引用，只是类型变了，具体值（内存地址）没变！
  *
  * 【2】Scala的Option使用：
  * 为了避免空指针问题
  * Option的两个子类：Some 和 None
  * Option的方法：
  * （1）getOrElse：如果为None，返回默认值
  * （2）isDefined：是否为Some
  * （3）get：返回值
  *
  *
  * 【3】Scala的List
  * 默认List是不可变
  * ListBuffer是可变
  *
  * （1）List的方法
  * 空的List：Nil
  * 更新元素：update(index:Int,ele:Any) 返回一个新的List
  * 添加元素: +:   :+ 注：冒号永远跟着List
  * 添加集合：:: 添加顺序是从左往右添加
  * 添加扁平化集合： ::: 注意：只能是集合之间的操作，顺序为从左往右
  *
  * （2）ListBuffer方法
  * 更新update
  * 追加元素:append 、+=
  * 追加集合: ++=
  *
  *
  * 【4】Scala的Queue
  * 一般我们使用可变的队列
  *
  * 【5】Scala的Map
  * 和Java的Map类似，都是数组+链表（Java8 红黑树）
  * 也分为可变和不可变
  *
  * 不可变的Map，不能增加、删除、更新Entry
  * 一般使用可变的Map
  *
  * （1）Map创建：val map1 = mutable.Map(("name","123"))
  *              val map2 = immutable.Map(("name","123"))
  *
  * （2）通过Key获取value：map1(key) 如果没有报错
  *
  *                      map1.get(key) 返回一个Option对象
  *
  *                      map1.getOrElse(key,defaultValue) 如果没有返回默认值
  *
  *
  * （3）遍历：
  *
  * for((k,v) <- map1) {}
  *
  * for(tuple <- map1) {}
  *
  *
  * 【6】Scala的Set
  *  mutable.HashSet 可变
  *  immutable.HashSet 不可变
  *
  *
  *
  */
object ScalaPart20 {
  def main(args: Array[String]): Unit = {

    /*var aa : String = "123"

    val tuple_1: (Int, Int, Int, Int, Int) = (1,2,3,4,5)

    println(tuple_1._2)

    val iter = tuple_1.productIterator

    for(i <- iter){
    print(i + "\t")
  }

  //Some(1,2,3)
  None
  Some(Array(1))

  val arr: Array[String] = "123,456".split(",")

  val so: Option[Array[String]] = Some(arr)

  val n = None
  var res= so.getOrElse("123")

  val resNew = res.asInstanceOf[Array[String]]

  println(resNew.mkString("~"))

    val map_1 = Map("name"->"qinzhen","address"->"beijing",("info","loving"))

    val op_1: Option[String] = map_1.get("aaa")
    val op_2: Option[String] = map_1.get("name")
    println(op_1.isDefined)
    println(op_2.isDefined)
    println(op_1.getOrElse("1231321321"))
    println(op_2.get)

    val some_1 : Some[String]= Some(null)

    println(some_1.getOrElse(13))*/

    val list1 = List(1, 2, 3, 4, 5)
    println(list1(2))

    //更新
    val list_1 = list1.updated(3, 88)
    println(list_1)

    //添加元素
    val list2 = list1 :+ 99
    println(list2)

    val list3 = 66 +: list1
    println(list3)

    //List()
    val empList = Nil
    println(empList)

    val list4 = empList :+ 90
    println(list4)

    //添加集合
    val arr1 = Array(1, 2, 3, 4)
    val list5 = 1 :: 5 :: list1 :: Nil // List(1,5,List(1,2,3,4,5))
    println(list5)

    //扁平化添加集合
    val list6 = 1 :: 5 :: list1 ::: list1 // List(1,5,1,2,3,4,5)
    println(list6)

    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")

    val listBuf1 = ListBuffer(1,2,3,4)
    println(listBuf1)
    //删除元素
    listBuf1.remove(0)
    println(listBuf1)

    //更新元素
    listBuf1.update(0,77)
    println(listBuf1)

    //追加元素
    listBuf1.append(11,111,1111)
    println(listBuf1)

    listBuf1 += 777
    println(listBuf1)

    //追加集合
    listBuf1 ++= Array(6,66)
    println(listBuf1)

    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")

    val queue1 = new mutable.Queue[Int]()

    //添加元素
    queue1 += 1
    queue1 += 2
    println(queue1)

    queue1.enqueue(5,5,5,5,5)
    println(queue1)

    //出队
    queue1.dequeue()
    println(queue1)

    //获取队首元素
    println(queue1.head)
    println(queue1.last)
    println(queue1.tail)

    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")

    val map1 = mutable.Map(("name","qiznhen"),("address","beijing"))

    //获取指定key的value
    println(map1("name"))
    //println(map1("sss"))

    println(map1.get("name").get)
    println(map1.getOrElse("ss", "666"))

    //更新元素
    map1("name") = "fengyu"
    println(map1.get("name").get)

    //增加元素
    map1 += (("info1","ss"),("info2","hh"))

    //删除元素
    map1 -= ("address")

    //遍历
    for(entry <- map1){
      println(entry)
    }
    for((k,v) <- map1){
      println(k +"\t" + v)
    }

    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")

    val set1 = mutable.HashSet(1,2,3,4)
    set1 += 6
    set1.add(7)
    println(set1.size)

    //删除元素
    set1 -= 1
    println(set1.size)

    //set的遍历
    for(in <- set1){
      print(in +"\t")
    }


  }
}
