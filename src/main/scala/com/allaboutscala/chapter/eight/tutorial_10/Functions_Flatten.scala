package com.allaboutscala.chapter.eight.tutorial_10

object Functions_Flatten extends App {
  println("Step1: Create 2 Lists")
  val list1:List[String]=List("Plain Donut","Vanilla Donut","Glazed Donut")
  val list2:List[String]=List("Strawberry Donut","Coconut Donut")
  println("Step2: Applying Flatten function")
  val list3:List[List[String]]=List(list1,list2)
  println(list3.flatten)
  println("Step2: Applying Map with Flatten function")
  val listDonutsFromFlatten2: List[String] = list3.flatten.map(_ + " Donut")
  println(s"Elements of listDonutsFromFlatten2 = $listDonutsFromFlatten2")
}
