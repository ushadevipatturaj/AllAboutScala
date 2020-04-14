package com.allaboutscala.chapter.eight.tutorial_49

object Functions_Unzip3 extends App {
  println("Step1: Creating a List")
  val list1: List[(String,Double,String)]=List(("Plain Donut",1.25,"Tasty"), ("Chocolate Donut",2.75,"Very Tasty"), ("Glazed Donut",3.0,"Tasty"))
  println(list1 )
  println("Step2: Unzipping using unzip3 Lists")
  val unzippedList:(List[String],List[Double],List[String])=list1.unzip3
  println(unzippedList)
  println(unzippedList._1)
  println(unzippedList._2)
  println(unzippedList._3)
}
