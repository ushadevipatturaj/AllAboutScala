package com.allaboutscala.chapter.nine.tutorial_1
import org.joda.time.Seconds

import scala.language._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Await
import scala.concurrent.duration._
import scala.util.{Failure,Success}
object Functions_Futures_Blocking_NonBlocking extends App {
  println("Step1: Creating a method with return type of Future")
  def checkStock(donut:String):Future[Int]=Future{
    println("Checking the Stock for the donut")
    10
  }
  println("Step2: Calling a method with blocking await.result")
  val stockValue= Await.result(checkStock("Vanilla Donut"),5 seconds)
  println(stockValue)

  println("Step3: Calling a method with non-blocking .onComplete")
  checkStock("Vanilla Donut").onComplete(stock => println(stock))

  println("Step4: Calling a method with non-blocking using Success and Failure")
  checkStock("Glazed Donut").onComplete{
    case Success(stock) => println(s"Stock for Glazed Donut is $stock")
    case Failure(stock) => println("No Stock is available!")
  }
  Thread.sleep(3000)
}
