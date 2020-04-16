package com.allaboutscala.chapter.nine.tutorial_1
import scala.concurrent.Future
import scala.concurrent.duration._
import scala.util.{Success,Failure}
import scala.concurrent.ExecutionContext.Implicits.global
object Futures_FirstCompletedOf extends App {
  println("Step1: Creating a future function")
  def checkDonut(donut:String):Future[Option[String]]=Future{
    println(s"Checking the Inventory for $donut")
    if(donut=="Vanilla Donut") Some(donut) else None
  }

  println("Step2: Creating a list of multiple future method calls")
  val futureLists=List(
    checkDonut("Vanilla Donut"),
    checkDonut("Glazed Donut"),
    checkDonut("Plain Donut")
  )
  println("Step3 : Applying firstcompletedof method")
  val firstCompletedResult=Future.firstCompletedOf(futureLists)
  firstCompletedResult.onComplete{
    case Success(value) => println(s"The first completed method call is $value")
    case Failure(e) => println("Exception in executing future methods!")
  }
}
