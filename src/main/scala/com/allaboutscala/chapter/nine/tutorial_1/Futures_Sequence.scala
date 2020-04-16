package com.allaboutscala.chapter.nine.tutorial_1
import org.joda.time
import org.joda.time.Seconds

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}
import scala.language.postfixOps
import scala.concurrent.duration._

object Futures_Sequence extends App {
  println("Step1: Creating 3 future methods")
  def checkDonut(donut:String):Future[Option[Int]]=Future{
    println("Checking donut stock inventory.. wait for 1 Sec")
    Thread.sleep(1000)
    if(donut=="Vanilla Donut") Some(10) else None
  }
  def buyDonut(qty: Int):Future[Boolean]=Future{
    println(s"Buying $qty Donut .. sleep for 2 Secs")
    Thread.sleep(2000)
    if(qty >0 ) true else false
  }

  def processPayment():Future[Unit]=Future{
    println("Processing payment and sleep for 3 secs")
    Thread.sleep(3000)
  }

  val listFutures:List[Future[Any]]=List(checkDonut("Vanilla Donut"),buyDonut(10),processPayment())
  val SeqFutures=Future.sequence(listFutures)
  SeqFutures.onComplete{
    case Success(results) => println(s"The Sequence of Future methods are successful $results")
    case Failure(e) => println(s"Error processing the Sequence of Future")
  }

}
