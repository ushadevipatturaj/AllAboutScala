package com.allaboutscala.chapter.eight.tutorial_17

object Functions_IsEmpty extends App {
  println("Step1: Creating a list ")
  val list1:List[String]=List("Plain Donut","Strawberry Donut","Chocolate Donut","Coconut Donut","Caramel Donut","Glazed Donut")
  println(s"Applying Isempty function on non empty function - ${list1.isEmpty}")
  println("Step2: Creating an empty List")
  val list2:List[String]=List.empty
  println(s"Applying IsEmpty function on empty function - ${list2.isEmpty}")
}
