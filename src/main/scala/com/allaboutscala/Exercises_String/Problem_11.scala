package com.allaboutscala.Exercises_String

object Problem_11 extends App {
  val cartItems:Set[String]=Set( "Milk", "Cheese", "Donuts", "Apples", "Bananas")
  val ValueFunction: String =>Boolean= item=> item =="Bananas" || item =="Apples"
  val noFruits=cartItems.filterNot(ValueFunction)

  println(noFruits.mkString("<items values= \"","|","\"></items>"))
}
