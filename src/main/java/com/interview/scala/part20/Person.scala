package com.interview.scala.part20

class Person[K,V](val name:K,val salary:V) {
  def m1() = {
    println(name)
  }

  def m2() = {
    println(salary)
  }
}

object Person{
  def apply[K,V](name:K,salary:V) = {
    new Person[K,V](name,salary)
  }
}
