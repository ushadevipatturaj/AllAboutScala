package com.allaboutscala.chapter.three.tutorial_10

object SymbolsasFunctionName extends App {
class donutcostcalculator {
  val totalcost=100

  def minusdiscount(discount:Double): Double ={
    totalcost-discount
  }

  def - (discount:Double): Double ={
    totalcost-discount
  }
  def +++(tax:Double): Double ={
    totalcost+tax
  }
}

  val donutcostcalculator =new donutcostcalculator()
  println(s"Step1: To call the function from instantiation ")
  println(s"total cost after discount is ${donutcostcalculator.minusdiscount(4.5)}")
  println(s"Step2: To call the function with symbol as name ")
  println(s"total cost after discount is ${donutcostcalculator.-(7.5)}")
  println(s"Step1: To call the function with symbol as name - operator style notation ")
  println(s"total cost after discount is ${donutcostcalculator - 7.0}")
  println(s"Step1: To call the function with symbol as name +++ operator style notation ")
  println(s"total cost after discount is ${donutcostcalculator +++ 5.0}")
}
