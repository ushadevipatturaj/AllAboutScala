package com.allaboutscala.chapter.eight.tutorial_43

object Functions_Take extends App {
  println("Step1: Creating a List")
  val list1: List[Double]=List(3.00,2.50,0.01,1.25,7.77)
  println(list1)
  println("Step2: Applying Take on Double List")
  println(s"Getting the first 1 element from the List ${list1.take(1)}")
  println(s"Getting the first 2 element from the List ${list1.take(2)}")
  println(s"Getting the first 3 element from the List ${list1.take(3)}")

}
