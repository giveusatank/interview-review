package com.interview.scala.part26


/**
  * Scala的泛型、上下界、视图界定、上下文界定
  *
  * （1）Scala中的泛型支持上界和下界，但是Java中的泛型只有上界
  *
  * （2）Scala中的上下界相当于是：泛型 + 多态的效果
  *
  * （3）Scala中的视图界定相当于：上下界定 + 隐式方法
  *
  * （4）Scala中的上下文节点相当于：上下界定 + 隐式参数 + 柯力化
  *
  */
object ScalaPart26 {

  def main(args: Array[String]): Unit = {

    //
    /*val qinzhen123 = new User("qinzhen123")
    val qinzhen1 = new User("qinzhen1")

    println(new ViewBounds[User](qinzhen123, qinzhen1).greater01())*/

    import MyImplicit._


    /*implicit val sss: Ordering[User] = {
      new Ordering[User] {
        override def compare(x: User, y: User): Int = {
          x.name.length - y.name.length
        }
      }
    }

    val user1 = new User("qinzhen11")
    val user11 = new User("qinzhen1111")
    println(new ViewBounds(user1, user11).greater01())

    new Person[String]("123").m1()

    val p1 = new Person2("1111111111")
    val p2 = new Person2("222")
    println(new Operator().compareNumber(p1, p2))

    val s1 = new Student2(88.88)
    val s11 = new Student2(99.88)
    println(new Operator().compareNumber(s1, s11))

    //val summer: Season#Value = new Season("summer").SUMMER
    //println(summer)

    new Dog[User](new User("123")).m1(new User("999"))

    val summer: SeasonEm.Value = SeasonEm.summer

    summer match {
      case SeasonEm.summer => println("666")
      case SeasonEm.winter => println("888")
      case _ => println("nonthing!")
    }*/

    implicit def convertSing2Run(bird:Bird) = {
        new CanRun(bird.name)
    }

    val white = new WhiteBird
    val black = new BlackBird
    new CanSing(white).greater()
    new CanSing(black).greater()


    implicit val comp : Ordering[User] = new Ordering[User] {
      override def compare(x: User, y: User): Int = {
        x.name.length - y.name.length
      }
    }

    val user1 = new User("qinzhen123")
    val user2 = new User("qinzhen1234")

    println(new ContextBounds_1[User](user1, user2).greater())

  }
}

/*
    测试Scala的上界
 */


class CanSing[E <% CanRun](t:E) {
  def greater() = {
    t.run()
  }
}

class CanRun(val name:String) {
  def run(): Unit = {
    println(s"${name} can running!!")
  }
}

abstract class Bird {
  val name:String
  def sing
}

class WhiteBird extends Bird {
  override def sing: Unit = {
    println("gugugug~~~")
  }

  override val name: String = "WhiteBird"
}

class BlackBird extends Bird {
  override def sing: Unit = {
    println("wawawa~~~~")
  }
  override val name: String = "BlackBird"
}


class User(val name: String) {

  override def toString = s"${name}"
}

class MyCompartor extends Ordering[User]{
  override def compare(x: User, y: User): Int = {
    x.name.length - y.name.length
  }
}

class ContextBounds_1[T <% User](user1:T,user2:T)(implicit val compator:Ordering[T]) {

  def greater() = {
    if(compator.compare(user1,user2) > 0) user1 else user2
  }
}

/*
class User(val name: String) {

  override def toString = s"${name}"
}

class ViewBounds[T <: User](o1: T, o2: T)(implicit val compor: Ordering[T]) {
  def greater01(): T = {
    if (compor.compare(o1, o2) > 0) o1 else o2
  }
}

class Operator[E <: Comparable[E]]() {
  def compareNumber(ele1:E,ele2:E): E = {
    if (ele1.compareTo(ele2) > 0) ele1 else ele2
  }
}

class Person[T](val t: T) {
  def m1() = {
    print(t)
  }
}

class Person2(val name:String) extends Comparable[Person2] {

  override def compareTo(o: Person2): Int = {
    this.name.length - o.name.length
  }

  override def toString = s"${name}"
}

class Student2(val score:Double) extends Comparable[Student2] {
  override def compareTo(o: Student2): Int = {
    (this.score-o.score).toInt
  }

  override def toString = s"${score}"
}

/*
class Person(val salary:Double) extends Ordered[Person] {
  override def compare(that: Person): Int = {
    (this.salary - that.salary).toInt
  }
}


class Dog(val name:String) extends Ordering[Dog]{
  override def compare(x: Dog, y: Dog): Int = {
    x.name.length - y.name.length
  }
}
*/

class Season(info:String) extends Enumeration{
  type Season = Value
  val SUMMER = Value(info)
  val WINTER = Value(info)
  override def toString = s"${info}"
}

class Animal[T](t:T){

  def m1(t:T) = {
    println(t)
  }
}

class Dog[XXX](s:XXX) extends Animal[XXX](s){

}

object SeasonEm extends Enumeration{
  type SeasonEm = Value
  val winter,summer = Value


}

class SeasonClass[E <: SeasonEm](val e:E) {

}*/
