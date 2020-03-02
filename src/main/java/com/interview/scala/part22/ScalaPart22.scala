package com.interview.scala.part22

/**
  * Scala的模式匹配：
  * 类似于Java中的switch case，使用关键字match进行匹配，从上到下依次
  * 查看case，如果满足则执行=>后面内容，_表示都不匹配的情况，case匹配成功即退出不会出现Java
  * 中的穿透现象
  *
  * （1）case后面的数据类型,但是如果是不可能的情况编译时会提示
  * （2）case的守卫模式，在_前，可以有自定义匹配规则
  * （3）还可以用来匹配变量的类型
  *
  *
  */
object ScalaPart22 {
  def main(args: Array[String]): Unit = {

    /*val obj = "c"
    val res1 = obj match {
      case 1.2 => println("666")
      case "AAA" => println("hahah")
      case _ => {
        println("other!!")
        "AAA"
      }
    }
    println(res1)*/
    /*val str1 = "#!@$"

    for(ele <- str1){

      ele match {
        case '#' => println("#")
        case '!' => println("!")
        case '@' => println("@")
        case 'G' => println("G")
        case _ if(ele > 100 || ele <= 100) => println(ele)
        case _ if(ele <10) => println("....")
        case _ => println("aa"+ele)
      }
    }*/

    val arr1 = Array(1, 2, 3, 4)
    println(Some(arr1))

    val fields = "123~567~899"
    println(Some(fields.split("~")))

    val ss: String = "hehe~haha~xiuxiu"
    ss match {
      case Person(a, b, c) => println(a+"\t"+b+"\t"+c)
      case _ => println("other")

    }

  }


}
