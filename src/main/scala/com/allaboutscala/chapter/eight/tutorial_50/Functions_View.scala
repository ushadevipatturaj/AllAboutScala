package com.allaboutscala.chapter.eight.tutorial_50

object Functions_View extends App {
  println("Step1: Creating a Million integer List and get 10 odd values from it")
  val oddList:List[Int]= (1 to 1000000).view.filter(a => a % 2 == 1).take(10).toList
  println(oddList)

}
