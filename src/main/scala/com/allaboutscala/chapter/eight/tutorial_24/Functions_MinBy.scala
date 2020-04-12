package com.allaboutscala.chapter.eight.tutorial_24

object Functions_MinBy extends App {
  println("Step1: Creating a case class of Donut and List of Donuts")
  case class Donut(name:String,price:Double)

  val list1:List[Donut]=List(Donut("Plain Donut",2.50),Donut("Chocolate Donut",1.75),Donut("Caramel Donut",2.00))
  println(s"Step2: Applying MinBy directly on the lists ")
  println(s"Cheapest Donut is : ${list1.minBy(donut => donut.price)}")

  println("Step3: Applying MinBy through the Value function")
  val minByValue:(Donut) => Double =(donut) => (donut.price)
  println(s"Cheapest Donut is : ${list1.minBy(minByValue)}")
}
