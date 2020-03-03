package com.allaboutscala.chapter.three.tutorial_4

object FuntionswithOptionReturntype extends App {

  def donutpricewithcoupondefault():Option[String] = {
 val couponcode="COUPON1234" //try with empty quotes to work for negative scenario
    Option(couponcode).filter(_.nonEmpty)
}
  println("Step1: Functions with Option as return type and GetorElse")
  val coupon= donutpricewithcoupondefault()
  println(s"Coupon code is ${coupon.getOrElse("No Coupon Available")}")
  println("Step2: Functions with Option as return type and pattern Matching")

  coupon match {
    case Some(d)=> println(coupon)
    case None => println("No Coupons Available")}
  println("Step3: Functions with Option as return type and Map method")
  coupon.map(coupon=>println(s"valid coupon  is $coupon"))

}
