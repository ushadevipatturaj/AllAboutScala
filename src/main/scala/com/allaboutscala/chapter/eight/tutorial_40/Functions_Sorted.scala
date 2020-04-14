package com.allaboutscala.chapter.eight.tutorial_40

object Functions_Sorted extends App {
  println("Step1: Creating a List")
  val list1: List[String]=List("Plain Donut","Chocolate Donut","Caramel Donut","Glazed Donut")
  println(list1)
  println("Step2: Applying Sorted to the list")
  val listSorted:List[String]=list1.sorted
  println("Sorted new List"+listSorted)
  println(s"The actual list is $list1")
  val list2: List[Double]=List(3.00,2.50,0.01,1.25,7.77)
  println("Sorted new List"+list2.sorted)
  println(s"The actual list is $list2")
}
