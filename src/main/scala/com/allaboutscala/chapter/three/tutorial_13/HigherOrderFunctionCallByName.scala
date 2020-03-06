package com.allaboutscala.chapter.three.tutorial_13

import scala.util.Random

object HigherOrderFunctionCallByName extends App {
println("Step1:Creating List of tuple3 for donuts")
  val donutlist=List(("Glazed Donut",17,2.5),("Coconut Donut",9,1.90)) //(Donutname, Quantity,Price)
  println("Step2: create a function to loop through the list ad get totalcost")
  def totalcostwithexchangerate(orders:List[(String,Int,Double)])(exchangerate:Double):Double ={
    var totalcost:Double=0.0
    orders.foreach{
      orders=>
        val donutrate=orders._2*orders._3*exchangerate
        totalcost+=donutrate
    }
  totalcost
  }
println(s"step3: Calling the totalcost function directly ${totalcostwithexchangerate(donutlist)(0.75)}")
  def totalcostwithexchangerate2(orders:List[(String,Int,Double)])(exchangerate: =>Double):Double ={
    var totalcost:Double=0.0
    orders.foreach{
      orders=>
        val donutrate=orders._2*orders._3*exchangerate
        totalcost+=donutrate
    }
    totalcost
  }
  val exchangerate=new Random(10)
  def usdtoeurconversion(): Double ={
    exchangerate.nextDouble()
  }
  println(s"step3: Calling the totalcost function through call by name ${totalcostwithexchangerate2(donutlist)(usdtoeurconversion())}")
}
