package com.allaboutscala.chapter.nine.tutorial_1
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Success,Failure}

object Futures_ZipWith extends App{
  println("Step1: Creating 2 Future methods")
  def checkDonut(donut:String):Future[Option[Int]] = Future{
    println(s"Checking the inventory for $donut")
    if(donut=="Vanilla Donut") Some(10) else None
  }
  def donutPrice():Future[Double] = Future.successful((3.25))
  println("Creating Value function for applying Zip with")
  val valueFunction:(Option[Int],Double ) => (Int,Double) = (qty,price) => (qty.getOrElse(0),price)
  println("Applying ZipWith on the results of 2 future methods")
  val zippedResult =checkDonut("Vanilla Donut").zipWith(donutPrice())(valueFunction)
  zippedResult.onComplete{
    case Success(value) => println(s"ZipWith has been completed $value")
    case Failure(e) => println(s"Failed to complete the zipWith ${e.getMessage}")
  }
}
