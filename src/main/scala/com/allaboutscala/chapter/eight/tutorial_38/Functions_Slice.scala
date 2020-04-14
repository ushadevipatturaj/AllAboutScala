package com.allaboutscala.chapter.eight.tutorial_38

object Functions_Slice extends App {
  println("Step1: Creating a List")
  val list1: List[String]=List("Plain Donut","Chocolate Donut","Caramel Donut","Glazed Donut")
  println(list1)
  println("Step2: Applying Slice to the list")
  println(s"Slice of List from 0-1 ${list1.slice(0,1)}")
  println(s"Slice of List from 0-2 ${list1.slice(0,2)}")
  println(s"Slice of list from 0-3 ${list1.slice(0,3)}")
  println("Slice will not throw stack overflow error when the end index is max than the actual")
  println(s"Slice of list from 0-5(Actual end index is 4) : ${list1.slice(0,5)}")
}
