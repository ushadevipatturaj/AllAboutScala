package com.allaboutscala.Exercises_Numbers

object Problem_8 extends App {
  val collectiveSeq:Seq[Any]=Seq(
    "James", 7,
    "Andy", 8,
    "Tommy", 10,
    "Bob", 13,
    "Sam", 10
  )
  val numList=collectiveSeq.collect{
    case age:Int => age
  }
  println(s"Combined sequence of names to ages = $collectiveSeq")
  println("Sum of ages ="+numList.foldLeft(0)(_+_))
}
