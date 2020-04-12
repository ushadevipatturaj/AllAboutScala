package com.allaboutscala.chapter.eight.tutorial_25

object Functions_MkString extends App {
  println("Step1: Creating a List")
  val list1:List[String]=List("Plain Donut","Strawberry Donut","Chocolate Donut","Coconut Donut","Caramel Donut","Glazed Donut")
  println("Step2: Applying MkString with Sep parameter")
  println(list1.mkString(" and "))
  println("Step3: Applying MkString with start,sep,end parameters")
  println(list1.mkString("Favourite Donuts "," and "," are very tasty!"))
}
