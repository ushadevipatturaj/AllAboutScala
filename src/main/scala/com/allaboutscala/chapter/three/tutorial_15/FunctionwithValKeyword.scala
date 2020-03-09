package com.allaboutscala.chapter.three.tutorial_15

object FunctionwithValKeyword extends App{

  def totalcostwithdiscount (donutname:String)(quantity: Int)(f:Double=>Double):Double={
    println(s"Donutname =$donutname, quantity =$quantity")
    val totalcost=(quantity*2.50)
    f(totalcost)
  }

  println(s"Higher Order Function-Function as a parameter ")
  println(s"Step1: Passing the parameter through named function ")
  def applycoupon(totalcost:Double): Double ={
    val discount=0.45
    totalcost-discount
  }
  println(s"""${totalcostwithdiscount("Glazed Donut")(5) (applycoupon(_)) }""")

  println(s"Step2: creating function with val keyword ")
  val applycoupon2= (totalcost:Double)=>{
    val discount=0.45
    totalcost-discount
  }
  println(s"""${totalcostwithdiscount("Glazed Donut")(5) (applycoupon2) }""")

}
