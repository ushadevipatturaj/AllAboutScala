package com.allaboutscala.chapter.eight.tutorial_31

object Functions_ReduceRight extends App {
  println("Step1: Creating a list")
  val list1:List[Double]=List(2.50,3.75,1.75)
  println("Step2: Applying ReduceRight on the list")
  println(list1.reduceRight(_+_))
  println("Step3: Applying ReduceRight explicitly")
  println(list1.reduceRight((a,b) => (a+b)))
  println("Step4: Getting the Max value from the list")
  println(list1.reduceRight(_ max _))
  println("Step5: Getting the Min value from the List")
  println(list1.reduceRight(_ min _))
  println("Step6: Applying String formatting through ReduceRight")
  val list2: List[String]=List("Plain Donut","Chocolate Donut","Caramel Donut","Glazed Donut")
  println(list2.reduceRight( (start,end) => (start+" and "+end)))
  println("Step7: Applying the string formatting through Value function")
  val stringFormat:(String,String)=>String = (start,end) => (start +" , " + end)
  println(list2.reduceRight(stringFormat))
  println("Step8: Applying ReduceRightOption Function on the list")
  val listempty:List[String]=List.empty
  println(listempty.reduceRightOption(stringFormat))

}
