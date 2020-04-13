package com.allaboutscala.chapter.eight.tutorial_29

object Functions_Reduce extends App {
  println("Step1: Creating a list")
  val list1:List[Double]=List(2.50,3.75,1.75)
  println("Step2: Applying Reduce for adding values")
  val sum:Double=list1.reduce(_+_)
  println(sum)
  println("Step3: Applying reduce to get sum with explicit function")
  val sumFunction:Double=list1.reduce((a,b) => (a+b))
  println(sumFunction)
  println("Step4: Getting the max value from the list using reduce")
  println(list1.reduce(_ max _))
  println("Step4: Getting the min value from the list using reduce")
  println(list1.reduce(_ min _))
  val list2: List[String]=List("Plain Donut","Chocolate Donut","Caramel Donut","Glazed Donut")
  println("Step5: Applying reduce to concat String value to the elements")
  val listConcat:String=list2.reduce( (start,end) => (start+" and "+end) )
  println(listConcat)
  println("Step6: Applying reduce to concat strings through value function")
  val ValueFunction:(String,String) => (String) = (first, last) => (first + " , " + last)
  println(list2.reduce(ValueFunction))
}
