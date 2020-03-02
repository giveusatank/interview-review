package com.interview.scala.part24

object ScalaPart24 {

  def main(args: Array[String]): Unit = {
  }
}

abstract class Pizza {
  var name:String
  val address:String
  val info:String = "1111"
  var hobby:String = "playing"
  val title : String = "high"
  var salart : Double = 222
}

class CheesePizza extends Pizza {
  var name: String = _
  val address: String = "2312"
  override val info:String = "222"
  //override var hobby:String = "swimming"

def m1(name:String) = {
this.name = name
this.salart = 555;
// this.title = "23"
}


}

class Person{
  val name:String = "88"
  //var address:String

}
class Man extends Person{
  // var name :String = "2"

  def m1(): Unit ={
    //println(this.name)
    //println(super.name)
    //this.name = "33"
    //println(super.name)
  }


}

class Cat()() {

}