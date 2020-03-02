package com.interview.sort

import java.text.SimpleDateFormat
import java.util
import java.util.{Calendar, List}

object TestArgs {

  def main(args: Array[String]): Unit = {
    for(i <- 0 until  args.length){
      println(args(i))
    }
  }


  def getCurrentSchoolYear(yestStr: String) :List[String] = {
    val result = new util.ArrayList[String]
    try {
      val syStartMonth = 9
      val syEndMonth = 8
      val ysds = yestStr
      val format = new SimpleDateFormat("yyyyMMdd")
      val yesterday = format.parse(ysds)
      val startCal = Calendar.getInstance
      val endCal = Calendar.getInstance
      startCal.setTime(yesterday)
      var start :String  = null
      var end :String = null
      val month = startCal.get(Calendar.MONTH)
      if (month >= 8) {
        startCal.set(Calendar.MONTH, 8)
        startCal.set(Calendar.DAY_OF_MONTH, 1)
        start = format.format(startCal.getTime)
        end = ysds
      }
      else {
        startCal.add(Calendar.YEAR, -1)
        startCal.set(Calendar.MONTH, 8)
        startCal.set(Calendar.DAY_OF_MONTH, 1)
        start = format.format(startCal.getTime)
        end = ysds
      }
      result.add(start)
      result.add(ysds)
    } catch {
      case e: Exception =>
        e.printStackTrace()
    }
    return result
  }
}
