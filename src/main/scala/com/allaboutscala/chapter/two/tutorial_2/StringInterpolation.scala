package com.allaboutscala.chapter.two.tutorial_2

object StringInterpolation extends App {

  println("Step1: Using String Interpolation to print a variable")
  val favoritedonut="Glazed Donut"
  println(s"Favourite Donut: $favoritedonut")

  println("Step2: Using String Interpolation on Object Properties")
  case class Donut(donutname:String, tastelevel:String)
  val favoritedonut2:Donut =Donut ("Chocolate Donut", "Very Tasty") // Doesnt require instantiation since the case class has apply() -so no need for getter or setter
  println(s"Favourite Donut: ${favoritedonut2.donutname}, tastelevel=${favoritedonut2.tastelevel}")

  println("Step3: Using String Interpolation to evaluate expressions")
  val quatitytobuy=10
  println(s"Quantity to buy is 10: ${quatitytobuy==10}")

  println("Step4: Using String Interpolation to format text") //this can be achieved using f keyword instead of s
  val favoritedonut3:Donut =Donut ("Vanilla Donut", "Tasty")
  println(f"Favourite Donut: ${favoritedonut3.donutname}%20s tastelevel=${favoritedonut3.tastelevel}%20s")

  println("Step5: Using f Interpolation to format numbers")
  val donutprice:Double =2.50
  println(s"Donut Price =$donutprice")
  println(f"Donut Price =$donutprice%.2f")

  println("Step6: Using raw Interpolation to print the symbol as it is") //raw interpolation will print the string as it is and not evaluate \t against tab
  println(raw"\t will be printed as string and now evaluated as tab")
}
