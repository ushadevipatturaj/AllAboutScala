package com.allaboutscala.chapter.eight.tutorial_21

object Functions_Max extends App {
  println("Creating a List")
  val list1:List[String]=List("Plain Donut","Strawberry Donut","Chocolate Donut","Coconut Donut","Caramel Donut","Glazed Donut")
  println("Step2: Applying Max function on the list")
  println(list1.max)
  val list2:List[Double]=List(2.25,3.00,7.5)
  println(list2.max)
  val list3:List[Any]=List("Plain Donut",3.25,"Coconut Donut",'C',"Glazed Donut")
  val resultlist=list3.collect{case x:String =>x}
  println(resultlist.max)
}
