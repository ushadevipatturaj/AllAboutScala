package com.allaboutscala.chapter.eight.tutorial_45

object Functions_TakeWhile extends App {
  println("Step1: Creating a List")
  val list1: List[String]=List("Plain Donut","Chocolate Donut","Plain Donut","Caramel Donut","Glazed Donut")
  println(list1)
  println("Step2: Applying TakeWhile function")
  println(list1.takeWhile(_.contains("Plain")))
  println("Applying TakeWhile using Value function")
  val ValueResult:(String) => Boolean = (donut) => (donut.charAt(0)=='C')
  println(list1.takeWhile(ValueResult))
}
