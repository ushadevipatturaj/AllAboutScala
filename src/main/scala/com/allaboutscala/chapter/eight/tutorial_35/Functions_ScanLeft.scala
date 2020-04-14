package com.allaboutscala.chapter.eight.tutorial_35

object Functions_ScanLeft extends App {
  println("Step1: Creating a List")
  val list1: List[String]=List("Plain Donut","Chocolate Donut","Caramel Donut","Glazed Donut")
  println(list1)
  println("Step2: Applying ScanLeft function -- Gives running concatenation of a list")
  println(list1.scan("Nice")(_+" "+_))
  val list2: List[Int]=List(2,4,6,8,1,9)
  println("Step3: Applying ScanLeft function -- Gives running balance of a list")
  println(list2.scan(0)(_+_))
  println("Step4: Applying ScanLeft explicitly")
  println(list2.scan(1)((a,b) => (a*b)))
}
