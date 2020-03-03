package com.allaboutscala.chapter.three.tutorial_3

object FunctionsUsingOptions extends App {
  def donutpricewithcoupon(donutname:String, quantity:Int, couponcode:Option[String] ):Double = {
    println("calculating the price of the donuts bought..." +
      s"donutname=$donutname , Quantities bought =$quantity, coupon applied $couponcode")

    couponcode match {
      case Some(d) => 2.50*quantity
      case None => (2.5*quantity)*0.3
    }
  }

  def donutpricewithcoupondefault(donutname:String, quantity:Int, couponcode:Option[String] =None):Double = {
    println("calculating the price of the donuts bought..." +
      s"donutname=$donutname , Quantities bought =$quantity, coupon applied $couponcode")

    couponcode match {
      case Some(d) => 2.50*quantity
      case None => (2.5*quantity)*0.3
    }
  }
  println("Step1: Functions with Option")
  println(s"Total price of the donut without coupon code is ${donutpricewithcoupon("Glazed Donut",4,None)}")
  println(s"Total price of the donut with coupon code is ${donutpricewithcoupon("Glazed Donut",4,Some("COUPON1234"))}")
  println("Step2: Functions with Option ad default parameter value")
  println(s"Total price of the donut without coupon code is ${donutpricewithcoupondefault("Glazed Donut",4)}")
  println(s"Total price of the donut with coupon code is ${donutpricewithcoupon("Glazed Donut",4,Some("COUPON1234"))}")

}
