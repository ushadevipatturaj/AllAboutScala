package com.allaboutscala.chapter.eight.tutorial_47

object Functions_Union extends App {
  println("Step1: Creating a List")
  val list1: List[String]=List("Plain Donut","Chocolate Donut","Glazed Donut")
  val list2: List[String]=List("Plain Donut","Caramel Donut","Strawberry Donut")
  println(list1 +"\n" + list2)
  println("Step2: Applying Union to the lists")
  println("List1 union List2", list1 union(list2))
  println("List2 union List1", list2 union(list1))
  println("List1 ++ List2", list1 ++list2)
  println("List2 ++ List1", list2 ++ list1)
}
