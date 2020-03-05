package com.allaboutscala.chapter.three.tutorial_7

object TypedFunctions extends App {

  def applycoupon(coupon:String) ={
    println(s"the valid coupon is $coupon")
  }
  def applycoupon(coupon:Double): Unit ={
    println(s"coupon discount is $coupon")
  }
  println("Step1: Calling Apply method with String ")
  applycoupon("COUPON1234")
  println("Step2: Calling Apply method with Double ")
  applycoupon("12.6")
  println("Step3: Creating apply method using typed [T]")

  def applycoupon2[T](coupon:T) ={
    coupon match {
      case d:String => println(s"the valid coupon is $coupon")
      case e:Double => println(s"coupon discount is $coupon")
      case _=> println(s"Unsupported type")
    }
  }
  applycoupon2[String]("COUPONTEXT")
  applycoupon2[Double](2.50)
  applycoupon2(2)
}
