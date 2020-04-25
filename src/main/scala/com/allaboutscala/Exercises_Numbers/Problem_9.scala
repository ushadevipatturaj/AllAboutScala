package com.allaboutscala.Exercises_Numbers

object Problem_9 extends App{
  val numList=(300 to 340).toList
  val oddNumList=numList.filter(num => num%2==1)
  println("Odd numbers between 300 and 340 =\n" +oddNumList.mkString("||"))
}
