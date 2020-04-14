package com.allaboutscala.chapter.eight.tutorial_32

object Functions_Reverse extends App {
  println("Step1: Creating a List")
  val list1: List[String]=List("Plain Donut","Chocolate Donut","Caramel Donut","Glazed Donut")
  println(list1)
  println("Step2: Applying reverse on the list")
  println(list1.reverse)

  println("Step3: Applying Reverse and iterate the list with foreach")
  val reverseList:List[String]=list1.reverse
  reverseList.foreach(println(_))
}
