package com.allaboutscala.chapter.eight.tutorial_4

object Functions_Drop extends App{
  println("Step1: Create a sequence")
  val seq1:Seq[String]=Seq("Glazed Donut","Vanilla Donut","Plain Donut")
  println("Drop function will take a int value and drop the first n value from the sequence")
  println(s"Drop of 2 is ${seq1.drop(2)}")
  println(s"Drop of 1 is ${seq1.drop(1)}")
  println(s"Drop of 3 is ${seq1.drop(3)}")
  println(s"Drop of 10 is ${seq1.drop(10)}") //even if the int exceeds the no of elements in the collection, it will not throw error
}
