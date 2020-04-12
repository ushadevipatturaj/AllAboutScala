package com.allaboutscala.chapter.eight.tutorial_19

object Functions_Last extends App {
  println("Step1: Creating an List")
  val set1:List[String]=List("Plain Donut","Strawberry Donut","Chocolate Donut","Coconut Donut","Caramel Donut","Glazed Donut")
  println("Step2: Getting last value using size-1")
  println(s"Last element is ${set1((set1.size-1))}")

  println("Step3: Getting last element using last function")
  println(s"Last element is ${set1.last}")

  println("Step3: creating an empty List")
  val set2:List[String]=List.empty
  println(s"the last element is ${set2.lastOption.getOrElse("No Donut is available!")}")
}
