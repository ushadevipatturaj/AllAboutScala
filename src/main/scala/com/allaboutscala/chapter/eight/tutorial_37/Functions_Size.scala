package com.allaboutscala.chapter.eight.tutorial_37

object Functions_Size extends App {
  println("Step1: Creating a List")
  val list1: List[String]=List("Plain Donut","Chocolate Donut","Caramel Donut","Glazed Donut")
  println(list1)
  println("Step2: Applying Size function ")
  println(list1.size)
  println("Step3: Applying count function to the list")
  println("Getting the total count of the list: "+ list1.count(_.contains("Donut")))
  println(s"Getting the count of the Plain donut in the list ${list1.count(_ =="Plain Donut")}")
}
