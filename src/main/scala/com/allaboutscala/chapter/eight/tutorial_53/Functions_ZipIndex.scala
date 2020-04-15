package com.allaboutscala.chapter.eight.tutorial_53

object Functions_ZipIndex extends App {
  println("Step1: Creating a List")
  val list1: List[String]=List("Plain Donut","Chocolate Donut","Glazed Donut","StrawberryDonut")
  println(list1)
  val IndexedList:List[(String,Int)]=list1.zipWithIndex
  println(IndexedList)
  IndexedList.foreach(donut => println(s"Donut Name is ${donut._1} and the index is ${donut._2}"))
}
