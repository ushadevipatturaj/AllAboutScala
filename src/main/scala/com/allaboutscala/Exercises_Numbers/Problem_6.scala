package com.allaboutscala.Exercises_Numbers

object Problem_6 extends App {
  val numList:List[Int]=List(10, 77, 90, 50, 100, 110)
  println(s" Does magic number 77 exist within the numerical value of 10,77,90,50,100,11? ${numList.contains(77)}")

}
