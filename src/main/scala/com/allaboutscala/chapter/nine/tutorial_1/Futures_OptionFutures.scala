package com.allaboutscala.chapter.nine.tutorial_1

import org.joda.time
import org.joda.time.Seconds

import scala.concurrent.Future
import scala.concurrent.duration._
import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.language.postfixOps
import scala.util.{Failure, Success}

object Futures_OptionFutures extends App {
  println("Step1: Creating two future methods")
  def checkStock(donut:String):Future[Option[Int]] =Future{
    println("Checking the stock inventory")
    if (donut =="Vanilla Donut") Some(10) else None
  }

  def buyDonuts(qty:Int):Future[Boolean] = Future{
    println(s"Buying $qty Donuts ")
    if (qty > 0) true else false
  }

  println("Step2: Chaining Future methods using for")
  for{
    stock <- checkStock("Vanilla Donut")
    isSuccess <- buyDonuts(stock.getOrElse(0))
  }yield println(s"Result of the Chained future methods $isSuccess")

  println("Step3: Chaining Future methods using map")
  checkStock("Vanilla Donut").map(donut => println(s"Result of the Chained future methods ${buyDonuts(donut.getOrElse(0))}"))
}
