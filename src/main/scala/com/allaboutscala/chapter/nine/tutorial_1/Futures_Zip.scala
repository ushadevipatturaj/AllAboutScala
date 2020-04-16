package com.allaboutscala.chapter.nine.tutorial_1

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object Futures_Zip extends App {
  println("Step1: Creating 2 future functions")
  def checkDonut(donut:String):Future[Option[Int]]=Future{
    println(s"Checking the Inventory for $donut")
    if(donut=="Vanilla Donut") Some(10) else None
  }

  def donutPrice():Future[Double] =Future.successful(3.25)
  println("Step2: Applying zip on the result of 2 future methods")
  val zippedValue = checkDonut("Vanilla Donut") zip donutPrice()
  zippedValue.onComplete{
    case Success(value) => println(s"Results of two future functions zipped $value")
    case Failure(e) => println("Failed to complete future functions")
  }

}
