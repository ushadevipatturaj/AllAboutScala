package com.allaboutscala.chapter.eight.tutorial_23

object Functions_Min extends App {
  println("Step1: Creating a list ")
  val list1:List[String]=List("Plain Donut","Strawberry Donut","Chocolate Donut","Coconut Donut","Caramel Donut","Glazed Donut")
  println("Step2: Applying Min on String List"+list1.min)
  val list2:List[Double]=List(2.25,3.70,1.75,10.00,0.01)
  println(s"Step3: Applying Min on the Double List ${list2.min}")
  val list3:Map[String,Double]=Map(("Plain Donut",2.50),("Chocolate Donut",1.75),("Caramel Donut",2.00))
  println(list3.min)
}
