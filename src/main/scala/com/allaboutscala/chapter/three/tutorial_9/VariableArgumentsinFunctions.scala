package com.allaboutscala.chapter.three.tutorial_9

object VariableArgumentsinFunctions extends App {
def printdonuts(donuts:String*)={
  println("printing report of Donuts")
  println(s"${donuts.mkString("-")}")
}

  println("Step1: calling variable arguments function with List")
  val listval=List("Glazed Donut","Plain Donut","Strawberry Donut","Chocolate Donut")
  printdonuts(listval: _*)

  println("Step2: calling variable arguments function with Seq")
  val seqval=Seq("Strawberry Donut","Chocolate Donut")
  printdonuts(seqval: _*)

  println("Step3: calling variable arguments function with Array")
  val arrayval=Array("Coconut Donut")
  printdonuts(arrayval: _*)
}
