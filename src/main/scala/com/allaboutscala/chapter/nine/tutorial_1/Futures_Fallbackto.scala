package com.allaboutscala.chapter.nine.tutorial_1
import scala.concurrent.Future
import scala.util.{Success,Failure}
import scala.concurrent.ExecutionContext.Implicits.global
object Futures_Fallbackto extends App {
  println("Step1: Creating Future method")
  def checkStock(donut:String):Future[Int] = Future{
    println(s"Checking for the Donut $donut")
    if(donut=="Vanilla Donut") 10 else throw new IllegalStateException("Unknown Donut")
  }
  println("Step2: Creating Future method similar to the first")
  def checkStockSimilar(donut:String):Future[Int] = Future{
    println(s"Checking for the Donut $donut")
    if(donut=="Glazed Donut") 20 else 0
  }
  println("Step3: Calling the Future method with fallbackto for the known Exception")
  checkStock("Glazed Donut").fallbackTo(checkStockSimilar("Glazed Donut")).
    onComplete{
      case Success(value) => println(s"Execution is successful ! $value")
      case Failure(e) => println(s"Failed to complete the processing ${e.getMessage}")
    }
  println("Step4: Calling the Future method with Fallbackto for the known Exception")
  checkStock("Vanilla Donut").fallbackTo(checkStockSimilar("Vanilla Donut")).
    onComplete{
      case Success(value) => println(s"Execution is successful ! $value")
      case Failure(e) => println(s"Failed to complete the processing ${e.getMessage}")
    }
  println("Step5: Calling the Future method with recover for the known Exception")
  checkStock("Plain Donut").fallbackTo(checkStockSimilar("Plain Donut")).
    onComplete{
      case Success(value) => println(s"Execution is successful ! $value")
      case Failure(e) => println(s"Failed to complete the processing ${e.getMessage}")
    }

}
