package com.allaboutscala.chapter.nine.tutorial_1
import scala.concurrent.{Future, Promise}
import scala.util.{Failure, Success, Try}
import scala.concurrent.ExecutionContext.Implicits.global
object Future_Promises extends App {
  println("Step1: Creating Future method")
  def checkStock(donut:String):Int = {
    println(s"Checking for the Donut $donut")
    if(donut=="Vanilla Donut") 10 else throw new IllegalStateException("Unknown Donut")
  }
  println("Step2: Creating a promise variable and wrap it with the future")
  val intPromise = Promise[Int]()
  val donutpromise=intPromise.future

  donutpromise.onComplete{
    case Success(value) => println(s"Execution is successful ! $value")
    case Failure(e) => println(s"Failed to complete the processing $e")
  }

  println("Step3: Calling future method call with Success and Failure")
  val donut1="Vanilla Donut"
  if(donut1 == "Vanilla Donut"){
    intPromise.success(checkStock(donut1))
  }
  else
    intPromise.failure(Try(checkStock(donut1)).failed.get)

  println("Step4: Calling future method call with Complete")
  val intpromise2 = Promise[Int]()
  val donutPromise2 = intpromise2.future

  donutPromise2.onComplete{
    case Success(value) => println("Future promise has been completed successfully")
    case Failure(e) => println(s"Failed to completed the function :$e")
  }
  intpromise2.complete(Try(checkStock("Plain Donut")))
}
