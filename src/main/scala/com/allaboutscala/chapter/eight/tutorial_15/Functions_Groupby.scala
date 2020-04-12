package com.allaboutscala.chapter.eight.tutorial_15

object Functions_Groupby extends App{
  println("Step1: Creating a Seq")
  val seq1:Seq[String]=Seq("Plain Donut","Strawberry Donut","Chocolate Donut","Coconut Donut","Caramel Donut","Glazed Donut")
  println("Applying group by function on the Seq")
  println(seq1.groupBy(_.charAt(0)))
  case class Donut(name:String,price:Double)

  val seq2:Seq[Donut]=Seq(Donut("Plain Donut",1.25),Donut("Strawberry Donut",2.00),Donut("Chocolate Donut",2.50),Donut("Coconut Donut",2.50))
  val resultMap:Map[String,Seq[Donut]]=seq2.groupBy(_.name)
  println(resultMap)
}
