package com.allaboutscala.chapter.eight.tutorial_27
import scala.collection.parallel._
import scala.collection.parallel.CollectionConverters._
object Functions_Par extends App{
  println("Step1: Creating a Seq")
  val seq1:Seq[String]=Seq("Plain Donut","Strawberry Donut","Chocolate Donut","Coconut Donut","Caramel Donut","Glazed Donut")
  println(seq1)
  println("Step2: Applying par method")
  val parseq1:ParSeq[String]=seq1.par
  println(parseq1)
  println("Step3: Applying map function to the parSeq")
  println(parseq1.map(x => x.concat(" X")))
}
