package com.allaboutscala.chapter.eight.tutorial_29

object Functions_ReduceLeft extends App {
  println("Step1: Creating a list")
  val list1:List[Double]=List(2.50,3.75,1.75)
  println("Step2: Applying ReduceLeft function directly to List")
  println(list1.reduceLeft(_+_))
  println("Step3: Applying reduceLeft Function  explicitly")
  println(list1.reduceLeft((a,b) => (a+b)))
  println("Step4: Getting Min value from a list")
  println(list1.reduceLeft(_ min _))
  println("Step4: Getting Max value from a list")
  println(list1.reduceLeft(_ max _))
  val list2: List[String]=List("Plain Donut","Chocolate Donut","Caramel Donut","Glazed Donut")
  println("Step5: Applying reduceLeft for string formatting")
  val StringFormat:String=list2.reduceLeft((start,end) => (start + " and " + end))
  println(StringFormat)
  println("Step6: Applying Reduce left through value function")
  val stringFormatFunction:(String,String) => (String) =(first,last) => (first +" , "+ last)
  println(list2.reduceLeft(stringFormatFunction))

  println("Step7: Applying ReduceLeftOption when the result is uncertain")
  val list3:List[String]=List.empty
  println(list3.reduceLeftOption(stringFormatFunction))
}
