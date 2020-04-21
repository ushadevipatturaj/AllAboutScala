package com.allaboutscala.chapter.ten.tutorial_1

class Functions_Test {
    def donutprice(quantity:Int):Double = {
      println("calculating the price of the donuts bought..." +
        s"Quantities bought =$quantity")

      2.50*quantity
    }
  def donuts(): Seq[String] = Seq("vanilla donut", "plain donut", "glazed donut")
  def printName():Unit ={
    throw new IllegalStateException("Printing Error!")
  }
  def donutPriceWithDiscount(donut:String):Option[Double]={
    val donutPriceList = Map(
      ("Vanilla Donut" -> 1.5),
      ("Plain Donut" -> 2.75),
      ("Glazed Donut" -> 2.25)
    )
    val price = donutPriceList.get(donut)
    val discountedPrice = price.map{ price => price+(1-ApplyDiscount(donut))}
    discountedPrice
  }



  def ApplyDiscount(donut: String): Double ={
    val discountPrice = Map(
      ("Vanilla Donut" -> 0.5),
      ("Plain Donut" -> 0.2),
      ("Glazed Donut" -> 0.1)
    )
    discountPrice.getOrElse(donut,0)
  }
}
