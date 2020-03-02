package com.interview.scala.part22

class Person(args:Int) {

}

object Person{

  def unapplySeq(arg: String) = {
    if(arg.contains("~")){
      Some(arg.split("~"))
    }else {
      None
    }
  }

  /*def unapply(arg:Int) = {
    println("!!!")
    Some(arg)
  }
*/
  def apply(args:Int) = {
    println("rrrrr")
    new Person(args)
  }



}
