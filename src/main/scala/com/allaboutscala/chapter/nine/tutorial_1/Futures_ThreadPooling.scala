package com.allaboutscala.chapter.nine.tutorial_1
import scala.concurrent.Future
import scala.util.{Success,Failure}
import java.util.concurrent.Executors
object Futures_ThreadPooling extends App {
  println("Creating a singled threaded pool with Java Executors")
  val executeVal=Executors.newSingleThreadExecutor()
  implicit val ec=scala.concurrent.ExecutionContext.fromExecutor(executeVal)
  println("Creating Future method ")
  def checkDonut(donut:String):Future[Int] = Future{
    println(s"Checking the donut Inventory $donut")
    if(donut=="Vanilla Donut") 10 else 0
  }
  println("Calling a future method")
  val result=checkDonut("Vanilla Donut")
  result.onComplete{
    case Success(value) => println(s"Future method completed with single thread $value")
    case Failure(e) => println(s"Completed with Error ${e.getMessage}")
  }
  println("Shutting down the thread created")
  executeVal.shutdownNow()
}
