package com.allaboutscala.chapter.three.tutorial_2

object FuntionswithParameters extends App{
def donutprice(donutname:String, quantity:Int):Double = {
  println("calculating the price of the donuts bought..." +
    s"donutname=$donutname , Quantities bought =$quantity")

  2.50*quantity
}
  println("Step1: Functions with parameters")
  println(s"Total price of the donut is ${donutprice("Glazed Donut",4)}")

  def donutpricewithcoupon(donutname:String, quantity:Int, couponcode:String = "NO CODE"):Double = {
    println("calculating the price of the donuts bought..." +
      s"donutname=$donutname , Quantities bought =$quantity, coupon applied $couponcode")
if(couponcode =="NO CODE")
    2.50*quantity
    else
  (2.5*quantity)*0.5
  }
  println("Step2: Functions with parameters and default parameter value")
  println(s"Total price of the donut without coupon code is ${donutpricewithcoupon("Glazed Donut",4)}")
  println(s"Total price of the donut without coupon code is ${donutpricewithcoupon("Glazed Donut",4,"COUPON1234")}")
}
