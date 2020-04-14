package com.allaboutscala.chapter.eight.tutorial_39

object Functions_SortBy extends App {
  println("Step1: Creating a List")
  case class Donut(name:String,price:Double)
  val list1: List[Donut]=List(Donut("Plain Donut",2.50),Donut("Chocolate Donut",3.25),Donut("Glazed Donut",1.75))
  println(list1)
  println("Step2: Applying sortby to the Donut List")
  println(list1.sortBy(donut =>donut.price))

}
