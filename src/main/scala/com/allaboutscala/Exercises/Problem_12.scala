package com.allaboutscala.Exercises

object Problem_12 extends App {
  val couponList:List[String] = List("A", "BB", "CCC", "DDDD", "EEEEE")
  couponList.foreach(item => println(item +"-"+ item.size))

}
