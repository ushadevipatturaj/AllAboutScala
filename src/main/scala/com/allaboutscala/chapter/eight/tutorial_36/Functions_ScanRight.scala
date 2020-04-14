package com.allaboutscala.chapter.eight.tutorial_36

object Functions_ScanRight extends App {
  println("Step1: Creating a List")
  val list1: List[String]=List("Plain Donut","Chocolate Donut","Caramel Donut","Glazed Donut")
  println(list1)
  println("Step2: Applying ScanRightFunction -- Gives running concatenation of a list")
  println(list1.scanRight("Lovely")(_+" "+_))
  println("Step3: Applying ScanRightFunction -- Gives running total of a list")
  val list2: List[Int]=List(2,4,6,8,1,9)
  println(list2.scanRight(0)(_+_))
  println("Step4: Applying ScanRightFunction explicitly")
  println(list2.scanRight(1)((a,b) => (a*b)))
}
