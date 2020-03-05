package com.allaboutscala.chapter.three.tutorial_8

object PolymorphicFunction extends App {
def applyCouponWithGenericReturn[T](coupon:T) : Seq[T]={
  coupon match {
    case d:String => println("Coupon type is String")
      Seq(coupon)
    case d:Double => println("Coupon type is Double")
      Seq(coupon)
    case _ =>println("Unsupported Coupon type")
      Seq(coupon)
  }
}
  println("Step1: Calling the polymorphic function with parameters of type String,Double,Char")
  applyCouponWithGenericReturn[String]("COUPONCODE")
  applyCouponWithGenericReturn[Double](2.80)
  applyCouponWithGenericReturn[Char]('U')
}
