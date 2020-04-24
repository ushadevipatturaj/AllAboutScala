package com.allaboutscala.Exercises_String

object Problem_10 extends App {
  val basketOne:Set[String] = Set("Cake","Milk", "Cheese" , "ToiletPaper")
  val basketTwo:Set[String] = Set("Water","Milk", "Juice" , "Cheese","Bread")
  val commonItems=basketOne & basketTwo
  println(s"Getting the common elements from two baskets \n${commonItems.mkString("\n").toUpperCase}")

}
