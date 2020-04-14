package com.allaboutscala.chapter.eight.tutorial_33

object Functions_ReverseIterator extends App {
  println("Step1: Creating a list")
  val list1: List[String]=List("Plain Donut","Chocolate Donut","Caramel Donut","Glazed Donut")
  println(list1)
  println("Step2: Applying ReverseIterator on the list")
  val reverseIteratorResult:Iterator[String]=list1.reverseIterator
  println(reverseIteratorResult)
  println("Step3: Applying reverseIterator and foreach")
  reverseIteratorResult.foreach(println(_))
}
