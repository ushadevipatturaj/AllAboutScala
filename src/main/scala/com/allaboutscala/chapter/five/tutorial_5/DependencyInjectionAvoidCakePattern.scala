package com.allaboutscala.chapter.five.tutorial_5

object DependencyInjectionAvoidCakePattern extends App {
  println("Creating a class DonutInventoryServices")
  class DonutInventoryServices[T]{
    def checkInventory(donut:T):Boolean ={
      println("Checking the inventory-> DonutInventoryServices")
      true
    }
  }
  println("Creating a class DonutPricingServices")
  class DonutPricingServices[T]{
    def calculateprice(donut:T):Double={
    println("Calculating the price of the donut -> DonutPricingServices")
      2.50
    }
  }
  println("Creating a class DonutOrderService")
  class DonutOrderService[T]{
  def createorder (donut:T,price:Double,quantity:Int):Int={
    println("Submitting order -> DonutOrderService ")
    100
  }
}
  println("Creating a class DonutShoppingcartServices")
  class DonutShoppingcartServices[T](
    donutInventoryService: DonutInventoryServices[T],
    donutPricingService: DonutPricingServices[T],
    donutOrderService: DonutOrderService[T]){
    def bookorder(donut:T, quantity:Int):Int={
    println("Booking order -> DonutShoppingcartServices")
      donutInventoryService.checkInventory(donut) match {
        case true =>
          val price =donutPricingService.calculateprice(donut)
          donutOrderService.createorder(donut,price,12)
        case false =>
          println("Sorry! Donut is out of stock!")
          -10
    }
    }
  }
  trait DonutStoreServices{
    val donutInventoryServices=new DonutInventoryServices[String]
    val donutOrderService=new DonutOrderService[String]
    val donutPricingServices=new DonutPricingServices[String]
    val donutShoppingcartServices=new DonutShoppingcartServices[String](donutInventoryServices,donutPricingServices,donutOrderService)
  }

  trait DonutStoreControllerApp{
    this:DonutStoreServices=>
    def bookorder(donut:String,quantity:Int):Int={
    println("Book order -> DonutStoreControllerApp")
    donutShoppingcartServices.bookorder(donut:String,quantity:Int)
  }
  }
object DonutStoreApp extends DonutStoreControllerApp with DonutStoreServices

  DonutStoreApp.bookorder("Vanilla Donut",12)

}