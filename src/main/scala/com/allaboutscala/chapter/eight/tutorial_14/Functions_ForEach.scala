package com.allaboutscala.chapter.eight.tutorial_14

object Functions_ForEach extends App {
  println("Step1: Creating a List")
  val list1:List[String]=List("Plain Donut","Glazed Donut","Vanilla Donut","Coconut Donut")
  println("Step2: Applying foreach directly")
  list1.foreach(println(_))
  println("Step2: Applying foreach using value function")
  val result:(String)=>String = (x) => {
    val upperValue:String=x.toUpperCase()
    println(upperValue)
    upperValue
  }
  list1.foreach(result)
}
