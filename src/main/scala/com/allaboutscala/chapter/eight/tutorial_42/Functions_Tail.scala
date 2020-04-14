package com.allaboutscala.chapter.eight.tutorial_42

object Functions_Tail extends App {
  println("Step1: Creating a List")
  val list1: List[Double]=List(3.00,2.50,0.01,1.25,7.77)
  println(list1)
  println("Step2: Applying Tail on Double List")
  println(list1.tail)
  println("Step3: Applying Last Function")
  println(list1.last)
  println("Step4: Applying Head function")
  println(list1.head)
}
