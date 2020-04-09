package com.allaboutscala.chapter.eight.tutorial_6

object Functions_Exists extends App {
  println("Step1: Create an Seq")
  val seq1:Seq[String]=Seq("Plain Donut","Strawberry Donut","Glazed Donut")
  println("Step2: Applying exists function directly")
  println(seq1.exists(donut => donut=="Vanilla Donut"))
  println(seq1.exists(donut => donut=="Plain Donut"))

  println("Step3: Applying exists through value function")
  val validateValue:(String) => Boolean =(donutName) => donutName=="Plain Donut"
  println(seq1.exists(validateValue))

  println("Step3: Applying exists through function")
  def evaluvateString(donutName: String): Boolean = donutName=="Strawberry Donut"
  println(seq1.exists(evaluvateString(_)))
}
