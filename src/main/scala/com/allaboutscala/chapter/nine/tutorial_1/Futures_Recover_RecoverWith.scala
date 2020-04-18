package com.allaboutscala.chapter.nine.tutorial_1
import scala.concurrent.Future
import scala.util.{Success,Failure}
import scala.concurrent.ExecutionContext.Implicits.global
object Futures_Recover_RecoverWith extends App {
  println("Step1: Creating Future method")
  def checkStock(donut:String):Future[Int] = Future{
    println(s"Checking for the Donut $donut")
    if(donut=="Vanilla Donut") 10 else throw new IllegalStateException("Unknown Donut")
  }
  println("Step2: Calling the Future method without recover")
  checkStock("Vanilla Donut").onComplete{
    case Success(value) => println(s"Execution is successful ! $value")
    case Failure(e) => println(s"Failed to complete the processing ${e.getMessage}")
  }
  println("Step3: Calling the Future method with recover for the known Exception")
  checkStock("Unknown Donut").recover{case msg:IllegalStateException=> 0}.
    onComplete{
    case Success(value) => println(s"Execution is successful ! $value")
    case Failure(e) => println(s"Failed to complete the processing ${e.getMessage}")
  }
  println("Step4: Calling the Future method with recoverWith for the known Exception")
  checkStock("Unknown Donut").recoverWith{case msg:IllegalStateException=> Future.successful(0)}.
    onComplete{
      case Success(value) => println(s"Execution is successful ! $value")
      case Failure(e) => println(s"Failed to complete the processing ${e.getMessage}")
    }
}
