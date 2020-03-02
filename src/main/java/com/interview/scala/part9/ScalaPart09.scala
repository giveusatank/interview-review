package com.interview.scala.part9



import scala.collection.mutable


/**
  * 测试Scala的包的import
  *
  * （1）Scala中的import可以出现在任意位置，好处就是缩小import的作用范围。仅限于当前的代码块中
  *
  * （2）在Java中导入包下所有类使用*，在Scala中使用_
  *
  * （3）可以使用一行代码，导入指定包下的某些类
  *
  * （4）import时候可以为冲突的类名起别名
  *
  * （5）可以选择那些类不进行import
  */
object ScalaPart09 {


  /*{
    import scala.beans.BeanProperty
    @BeanProperty val str :String = "12"
  }

  //@BeanProperty
  val salary:Double = 1.11

  def main(args: Array[String]): Unit = {

    import scala.collection.mutable.{HashMap,HashSet}
    //import java.util.{HashMap => JavaHashMap}

    //val javaHashMap = new JavaHashMap[]()
    val scalaHashMap = new mutable.HashMap[String,String]()
    import java.util.{HashMap => _,_}

  }*/
}
