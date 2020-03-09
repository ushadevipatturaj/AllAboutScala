package com.allaboutscala.chapter.three.tutorial_17

object FunctionwithComposeKeyword extends App{
  val applycoupon=(totalcost:Double)=>{
    val discount=1.45
    totalcost-discount
  }

  val applytax = (totalcost:Double)=> {
    val tax=0.75
    totalcost+tax
  }
  println("Step1:Calling the functions separately ")
  println(s"Calling Coupon and tax functions ${applycoupon(17.00) } , ${applytax(17.00)}")
  println("Step2:Calling the functions using AndThen Keyword ")
  println(s"Calling Coupon and tax functions ${(applycoupon compose  applytax)(17.00)}")

}
