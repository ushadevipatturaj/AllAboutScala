package com.allaboutscala.chapter.eight.tutorial_34

object Functions_Scan extends App {
  println("Step1: Creating a List")
  val list1: List[String]=List("Plain Donut","Chocolate Donut","Caramel Donut","Glazed Donut")
  println(list1)
  println("Step2: Applying Scan function -- Gives the running concatenation of the list")
  println(list1.scan("X")(_+" "+_))
  println("Step3: Applying Scan function -- Gives the running total of the list")
  val list2: List[Int]=List(2,4,6,8,1,9)
  println(list2.scan(0)(_+_))
  println("Step4: Applying Scan function explicitly")
  println(list2.scan(1)((a,b) => (a*b)))
}
