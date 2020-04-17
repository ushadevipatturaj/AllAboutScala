package com.allaboutscala.chapter.nine.tutorial_1
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.util.{Failure, Success}
object Futures_AndThen extends App {
  println("Step1: Creating Future method ")
  def checkDonut(donut:String):Future[Int] = Future{
      println(s"Checking the donut Inventory $donut")
      if(donut=="Vanilla Donut") 10 else 0
  }
  println("Step2: Applying And then to the future method")
  val Result = checkDonut("Vanilla Donut").andThen{case qty => println(s"qty is $qty")}

}
