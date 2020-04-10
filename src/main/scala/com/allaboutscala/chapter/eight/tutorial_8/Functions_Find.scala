package com.allaboutscala.chapter.eight.tutorial_8

object Functions_Find extends App{
  println("Step1: Create a Seq ")
  val seq1:Seq[String]=Seq("Plain Donut","Vanilla Donut","Strawberry Donut","Plain Donut")
  println(seq1)
  println("Step2: Applying find directly \n"+seq1.find(donut => donut.contains("Plain")))

  println("Step3: Applying find function through val")
  val findValue:Option[String]=seq1.find(_=="Vanilla Donut")
  val findValue1:String=seq1.find(_=="Glazed Donut").getOrElse("Donut not available!")
  println(findValue.getOrElse("Donut not available!"))
  println(findValue1)
}
