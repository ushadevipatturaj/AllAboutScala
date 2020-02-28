package com.allaboutscala.chapter.two.tutorial_5
import scala.io.StdIn._
object IfandElseexpressions extends App{
val donutsperperson=2
  val defaultdonuts=10
  val totalpeople=readLine("No of people available: ").toInt

  if(totalpeople>=10)
    {
      println("Donuts to buy :"+totalpeople*donutsperperson)
    }
else if (totalpeople ==0)
    {
      println("No person available")
    }
  else
    println("Donuts to buy is :"+defaultdonuts)

  //inline expressions
  val donutstobuy:Int = if(totalpeople>=10) (totalpeople*donutsperperson) else defaultdonuts
  println("testing inline if and else statements"+donutstobuy)
}
