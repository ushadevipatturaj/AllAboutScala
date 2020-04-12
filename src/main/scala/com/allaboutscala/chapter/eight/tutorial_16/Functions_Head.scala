package com.allaboutscala.chapter.eight.tutorial_16

object Functions_Head extends App {
  println("Step1: Creating a Seq")
  val seq1:Seq[String]=Seq("Plain Donut","Strawberry Donut","Chocolate Donut","Coconut Donut","Caramel Donut","Glazed Donut")
  println("Applying Head function to the Seq")
  println(seq1.head)
  println("Step3: Creating an empty Seq")
  val seq2:Seq[String]=Seq.empty
  println(seq2.headOption.getOrElse("No Donut is available!"))
}
