package com.allaboutscala.chapter.eight.tutorial_44

object Functions_TakeRight extends App {
  println("Step1: Creating a List")
  val list1: List[Double]=List(3.00,2.50,0.01,1.25,7.77)
  println(list1)
  println("Step2: Applying TakeRight on Double List")
  println(s"Getting first 1 element from right ${list1.takeRight(1)}")
  println(s"Getting first 2 element from right ${list1.takeRight(2)}")
  println(s"Getting first 3 element from right ${list1.takeRight(3)}")
}
