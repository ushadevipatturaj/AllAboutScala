package com.allaboutscala.chapter.nine.tutorial_1
import scala.concurrent.duration._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object Futures_Composing_Futures extends App {
  println("Step1: Creating Future methods ")
  def checkDonuts(donut: String):Future[Option[Int]] =Future{
    println("Checking the donut inventory")
    if (donut == "Vanilla Donut") Some(10) else None
  }

  def buyDonuts(qty:Int) :Future[Boolean]=Future{
    println(s"Buying $qty donuts")
    if (qty > 0) true else false
  }
  println("Step2: Chaining two future methods using map")
  val isSuccess:Future[Future[Boolean]]=checkDonuts("Vanilla Donut").map(qty => buyDonuts(qty.getOrElse(0)))


  println("Map methods gives return type of Future[Future[Boolean]]")
  println("Step3: Chaining two future methods using flatmap")
  val flatMapSucess:Future[Boolean] = checkDonuts("Vanilla Donut").flatMap(qty => buyDonuts(qty.getOrElse(0)))
  println(flatMapSucess)
}
