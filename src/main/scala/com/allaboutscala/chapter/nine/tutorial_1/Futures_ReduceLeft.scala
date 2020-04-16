package com.allaboutscala.chapter.nine.tutorial_1
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.util.{Failure, Success}
object Futures_ReduceLeft extends App {
  println("Step1: Creating a future method")
  def checkstock(donut:String):Future[Option[Int]]=Future{
    println(s"Checking the donut inventory $donut")
    if(donut=="Vanilla Donut") Some(10) else None
  }

  val listFutures=List(
    checkstock("Vanilla Donut"),
    checkstock("Vanilla Donut"),
    checkstock("Plain Donut")
  )
  val executeList = Future.reduceLeft(listFutures){case (a,b) => a.map(qty => qty +b.getOrElse(0))}
  executeList.onComplete{
    case Success(value) => println(s"Future Reduceleft functions completed ! $executeList")
    case Failure(e) => println(s"Failed to complete future functions! ${e.getMessage}")
  }

}
