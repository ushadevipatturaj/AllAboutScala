package com.allaboutscala.chapter.nine.tutorial_1
import scala.concurrent.Future
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}
object Futures_Traverse extends App {
  println("Step1: Creating a Future method")
  def checkStock(donut:String):Future[Option[Int]]=Future{
    println(s"Checking the inventory for the donut $donut")
    if(donut=="Vanilla Donut") Some(10) else None
  }
  val listCallMethod=List(
    checkStock("Vanilla Donut"),
    checkStock("Glazed Donut"),
    checkStock("Plain Donut")
  )

  val results=Future.traverse(listCallMethod){qtys => qtys.map(qty => qty.getOrElse(0))}
  results.onComplete{
    case Success(value) => println("The future method has been completed")
    case Failure(e) =>println(s"Failed with exception ${e.getMessage}")
  }

}
