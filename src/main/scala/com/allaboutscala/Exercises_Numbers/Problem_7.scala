package com.allaboutscala.Exercises_Numbers

object Problem_7 extends App {
  val numList=List(2, 8, 19, 20, 25, 50, 100, 10)
  val valueFunction:(Int)=> Boolean = (num)=> num%2==0
  val resultList=numList.dropWhile(valueFunction)
  resultList.foreach(println(_))

}
