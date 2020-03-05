package com.allaboutscala.chapter.three.tutorial_11

object CurryingandPartiallyAppliedFunctions extends App {
def totalcost (donutname :String)(quantity :Int)(discount:Double):Double={
println(s"Donutname =$donutname, quantity =$quantity, discount= ${(discount*100) }%")
  val totalcost=(quantity-discount)
  totalcost
}
  println("Step1: Calling Curried function with parameters seperated by ()")
  println(s"""total cost is : ${totalcost("Glazed Donut")(17)(0.25)}""")
  println("Step2: Calling partially applied function ")
  val partialval=totalcost("Plain Donut") _
  println(s"""total cost is : ${partialval(7)(0.15)}""")
}
