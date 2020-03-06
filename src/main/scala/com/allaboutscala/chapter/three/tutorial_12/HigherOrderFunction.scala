package com.allaboutscala.chapter.three.tutorial_12

object HigherOrderFunction extends App{

  def totalcostwithdiscount (donutname:String)(quantity: Int)(f:Double=>Double):Double={
    println(s"Donutname =$donutname, quantity =$quantity")
    val totalcost=(quantity*2.50)
    f(totalcost)
  }

  println(s"Higher Order Function-Function as a parameter ")
  println(s"Step1: Passing through the parameter anonymously ")
  println(s"""${totalcostwithdiscount("Glazed Donut")(5){totalcost =>
    val discount=0.45
    totalcost-discount}
  }""")

  println(s"Step2: Passing the parameter through named function ")
  def applycoupon(totalcost:Double): Double ={
    val discount=0.45
    totalcost-discount
  }

  println(s"""${totalcostwithdiscount("Glazed Donut")(5)(applycoupon(_))}""")
}