package com.interview.scala.part7

import scala.beans.BeanProperty

/**
  * （1）测试@BeanProperty注解
  *
  * （2）Java中的包的作用：区分相同类名、访问控制权限、更好管理类
  *
  * （3）Scala中的包和Java中的作用类似，但是Scala的包使用更加灵活。
  *
  * 【1】Scala中的包可以嵌套，即包中有包，每个包中都可以是object class trait，实现
  * 的效果就是在一个原文件中，我们可以定义不同的包
  *
  * 【2】子包可以直接访问父包内容，父包访问子包时需要import
  *
  * （4）包对象：包中只能包含class trait object 不能有属性、方法的定义，为了弥补这个问题。有了包对象
  *  package object packName
  * 【1】每个包都能拥有一个包对象
  * 【2】包对象的名称要和子包相同
  * 【3】包对象中定义属性、方法
  * 【4】子包中能够只用其包对象的属性、方法
  *
  *
  */

package aaa{
  object ScalaPart07 {

    def main(args: Array[String]): Unit = {


      val p = new Person

      println(p.getName)
      p.setName("q")
      println(p.getName)
    }
  }

  class Person {

    @BeanProperty var name:String = null

  }

  package bbb {

    package object ccc {

      val address:String = "TianJin"

      def showAddress = {
        println(this.address)
      }
    }

    import com.interview.scala.part7.aaa.bbb.ccc.Student

    class Animal{

      val name:String = "beijing"
    }

    object Dog {
      def main(args: Array[String]): Unit = {

        val s = new Student
        s.id
      }
    }

    package ccc {

      class Student {
        val id:Long = 1001
      }

      object Teacher {

        def main(args: Array[String]): Unit = {

          val animal = new Animal
          animal.name

          showAddress

          println(address)
        }
      }
    }
  }
}

