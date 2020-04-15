package com.allaboutscala.chapter.eight.tutorial_52

object Functions_Zip extends App{
  println("Step1: Creating a List")
  val list1: List[String]=List("Plain Donut","Chocolate Donut","Glazed Donut","StrawberryDonut")
  val list2:List[Double]=List(2.00,3.25,1.75,2.00)
  println(list1)
  println(list2)
  println("Step2: Applying zip to 2 Lists")
  val zippedList:List[(String,Double)]=list1 zip list2
  println(zippedList)
  println("Step3: Applying unzip to get the actual lists")
  val unzippedList=zippedList.unzip
  println(unzippedList._1)
  println(unzippedList._2)
}
