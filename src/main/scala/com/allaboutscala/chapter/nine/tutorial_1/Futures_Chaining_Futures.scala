package com.allaboutscala.chapter.nine.tutorial_1

import scala.concurrent.{Await, Future}

object Futures_Chaining_Futures extends App {
  println("Step1: Creating two methods with Future return type")
  def checkStock(donut:String) :Future[Int]=Future{
    println("Checking the stock ")
    10
  }

  def buyQuantity(qty:Int) :Future[Boolean] = Future{
    println(s"Buying $qty donuts")
    true
  }

  println("Step2: Chaining 2 Future methods using flatmap")
  val donutStock:Future[Boolean] =checkStock("Vanilla Donut").flatMap(qty => buyQuantity(qty))
  val IsSuccess=Await.result(donutStock,5 seconds)
  println(IsSuccess)

  println("Step2: Chaining 2 Future methods using for loop")
  for {
    stock <- checkStock("Vanilla Donut")
    isSuccess <- buyQuantity(stock)
  }yield println(s"Result of chaining Future methods $isSuccess ")

  Thread.sleep(3000)
}
