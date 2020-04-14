package com.allaboutscala.chapter.eight.tutorial_48

object Functions_Unzip extends App {
  println("Step1: Creating a List")
  val list1: List[String]=List("Plain Donut","Chocolate Donut","Glazed Donut")
  val list2: List[Double]=List(1.25,2.75,3.00,0.75)
  println(list1 +"\n" + list2)
  println("Step2: Zipping 2 Lists")
  val zippedLists:List[(String,Double)]=list1 zip list2
  println("Step3: Unzipping a list")
  println(zippedLists.unzip)

}
