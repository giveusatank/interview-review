package com.interview.scala.part11

object ScalaPart11 {
  def main(args: Array[String]): Unit = {

    val cat = new Cat("hauhua","tianjin")
    cat.show
  }
}

class Animal(name:String){
  var name_1:String = name
}
class Cat(name:String,address:String) extends Animal(name){

  var address_1:String = address

  def show = {
    println(this.address_1)
    println(this.name_1)
  }

}