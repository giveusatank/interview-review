package com.interview.scala.part19

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
  * Scala中的集合：
  *
  *
  * （1）
  * Array:不可变数组
  * ArrayBuffer：可变数组
  *
  * 不可变意味着数组长度不可变，即不会动态扩容
  * 可变意味着数组长度可以动态扩容，返回一个新的内存地址
  *
  * Scala中默认的就是不可变集合
  *
  * Scala中的不可变数组类似于Java中的Object[]，不可动态扩容
  * Scala中的可变数组类似于Java中的ArrayList，是Object[]的一个包装类，是可以动态扩容的
  *
  * （2）
  * Scala中的二维数组
  *
  * Array.ofDim[T](number:Int,dim:Int)
  *
  *
  */
object ScalaPart19 {
  def main(args: Array[String]): Unit = {

    //定义了一个容量为5的Int数组
    val arr1: Array[Int] = new Array[Int](5)

    //通过Array的apply方法，创建一个容量为4的数组
    val arr2: Array[Any] = Array(1,2,3,"5")

    //不可变数组的赋值
    arr1(0) = 6

    //获取指定索引的元素
    println(arr1.apply(0))

    //更新指定索引位置的数组元素
    arr1.update(0,88)
    println(arr1.apply(0))

    //遍历数组
    for(k <- arr1){
      print(k+"\t")
    }
    println
    println("~~~~~~~~~~~~~~~~~~~~~~~~~")

    val arrBuf = new scala.collection.mutable.ArrayBuffer[Int]()
    arrBuf.append(1,2,3,4,5,6,7,8,9)
    println(arrBuf.length)


    val arrBuf_2 = ArrayBuffer(1,2,3,4,5)
    println(arrBuf_2.length)
    arrBuf_2.append(6,7,8,9)
    println(arrBuf_2.length)

    println
    println("~~~~~~~~~~~~~~~~~~~~~~~~~")

    //可变数组和不可变数组之间的转换
    val immutableArr1: Array[Int] = Array(1,2,3,4)
    val mutableArr1: mutable.Buffer[Int] = immutableArr1.toBuffer
    mutableArr1.append(1,2,3,54,6)


    //可变数组转为不可变数组
    val mutablArr2 = ArrayBuffer(1,2,3,5)
    val immutableArr2 = mutablArr2.toArray
    println(immutableArr1.length)


    val dimIntArr = Array.ofDim[Int](3,4)

    val arr11 = Array(1,2,3,4)
    val arr12 = Array(2,4,6,8)
    val arr13 = Array(4,8,16,32)

    dimIntArr(0) = arr11
    dimIntArr(1) = arr12
    dimIntArr(2) = arr13

    for(i <- dimIntArr;j<-i){
        print(j+"\t")
    }
  }
}
