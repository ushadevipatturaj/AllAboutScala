package com.allaboutscala.Exercises_Numbers

object Problem_5 extends App {
  val numList1:List[Double]=List(99.5, 100.0, 50.0, 55.0, 70.0, 100.0, -1.0)
  val numlist2:List[Double]=List(10.0, 20.0, 30.0, 40.0, 50.0)
  val mergedList:List[Double] =List(numList1,numlist2).flatten
  println("Combined number literals ="+mergedList)
  println("Lowest number literal = "+ mergedList.min)
  println("Largest number literal = "+mergedList.max)
}
