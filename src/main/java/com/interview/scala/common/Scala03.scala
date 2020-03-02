package com.interview.scala.common


object Scala03 {
  def main(args: Array[String]): Unit = {

    //算术运算符
    println(1 + 2)
    println(1 - 2)
    println(1 * 2)
    println(1 / 2)
    println(1 % 2)

    //逻辑运算符
    val b1: Boolean = true
    val b2: Boolean = false

    println(b1 && b2)
    println(b1 || b2)
    println(!(b1 && b2))

    //比较运算符
    println(1 > 2)
    println(5 >= 1)
    println(1 == 1)
    println(1 != 4)

    //赋值运算符
    var a = 0
    a -= 2 // 等价于 a = a-2
    println(a)

    //位运算符
    //& | ~ ^ >> << >>>
    val e1 = 10
    val e2 = 6
    println(e1 | e2) //14
    println(e1 & e2) // 2
    println(~e1) //5错误 应该为-11
    println(e1 ^ e2) //12

    println(-20 >> 2)
    println(-20 << 2)

    //流程控制
    val re = 10
    val res = if (re > 210) {
      ">201"
    } else if (re < 100) {
      "<100"
    } else {
      "nono"
    }
    println(res)

    //for循环
    import scala.util.control.Breaks
    val loop = new Breaks

    for (ele <- 1 to 10) {
      print(ele + "\t")
    }

    for (ele <- 1 until 10) {
      print(ele + "\t")
    }

    //引入变量
    for (ele <- 1 to 10; j = 10 - ele) {
      println(ele + "~" + j)
    }

    //双重for
    val arr1 = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
    for (ele <- arr1.length - 1 to 0; mark <- 0 until ele) {
      println(ele + "~" + mark)
    }

    val vc = for(ele <- 1 to 10) yield ele*2
    println(vc)

    //守卫模式代替continue
    for(ele <- 1 to 100 if ele%3 == 0){
      print(ele+"\t")
    }

    //Breaks使用
    loop.breakable{
      for(ele <- 1 to 30){
        println(ele)
        if(ele == 14) loop.break()
      }
    }

    for(ele <- Range(1,10,2)){
      print(ele +"\t")
    }

    for(i <- 0 until args.length){
      print(i)
      print("~~~~~~~~~~~~~~")
    }
  }
}
