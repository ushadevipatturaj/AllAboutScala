package com.allaboutscala.chapter.eight.tutorial_26

object Functions_NonEmpty extends App {
  println("Step1: Creating a List")
  val list1:List[String]=List("Plain Donut","Strawberry Donut","Chocolate Donut","Coconut Donut","Caramel Donut","Glazed Donut")
  println("Step2: Checking the List is empty or not using nonempty function")
  println(s"Is the List1 not empty list:  ${list1.nonEmpty}")
  println("Step3: Creating an empty List")
  val list2:List[String]=List.empty
  println(s"Is the List2 a non empty list: ${list2.nonEmpty}")
}
