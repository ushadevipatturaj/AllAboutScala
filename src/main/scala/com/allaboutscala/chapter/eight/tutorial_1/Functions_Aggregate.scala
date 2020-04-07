package com.allaboutscala.chapter.eight.tutorial_1

object Functions_Aggregate extends App{
  println("Step1: Create/Initialize a Set")
  val set1:Set[String]=Set("Plain Donut","Glazed Donut", "Strawberry Donut")
  val set3:Set[Int]=Set(1, 2, 5, 7)
  println("Step2: Creating value function for accumulator of aggregator")
  val donutLengthAccumulator:(Int,String) => Int = (accumulator,donutName)=>accumulator+donutName.length
  val sum:(Int,Int) => Int = (starter,price) => starter+price
  println("Step3: Calling the aggregate function with accumulator value")
  val totalLength=set1.aggregate(10)(donutLengthAccumulator,_+_)
  println(s"Total length of all donuts are : $totalLength")
  val totalSum = set3.aggregate(0)(sum,_+_)
  println(s"Sum of Set3 $totalSum")
  val totalSum2 = set3.foldLeft(0)(sum) //This replaces aggregate function from 2.13.0 since aggregate is deprecated
  println(totalSum2)
  var i=0
  set3.foreach(x=> i+=x)
  println(i)

  println("Step4: Applying Aggregate function on Set of Tuples")
  val set2:Set[(String, Int, Double)]=Set(("Glazed Donut",2,2.5),("Plain Donut",5,1.75),("Strawberry Donut",7,2.00))
  println("Step5: Creating an Accumulator for aggregator")
  val priceAccumulator:(Double,Int,Double)=>Double=(accumulator,quantity,price)=>accumulator+(quantity*price)
  println("Step6: Calling an Aggregator with Accumulator")
  val totalCost=set2.aggregate(0.0)((accumulator:Double,tuple:(String,Int,Double))=>priceAccumulator(accumulator,tuple._2,tuple._3),_+_)
  println(totalCost)
}
