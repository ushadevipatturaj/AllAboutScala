package com.allaboutscala.chapter.nine.tutorial_1

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.util.{Failure, Success}

object Futures_FoldLeft extends App {
  println("Step1: Creating Future method ")
  def checkDonut(donut:String):Future[Option[Int]] = Future{
    println(s"Checking the donut Inventory $donut")
    if(donut=="Vanilla Donut") Some(10) else None
  }
  println("Step2: Applying foldleft on the List of future methods")
  val futureList = List(checkDonut("Vanilla Donut"),checkDonut("Plain Donut"),checkDonut("Glazed Donut"))
  val listResult=Future.foldLeft(futureList)(0){ case (acc,list1) => acc+list1.getOrElse(0)}
  listResult.onComplete{
    case Success(value) => println(s"Future method executed successfully $listResult")
    case Failure(e)=>println(s"Failed to complete the Future methods !")
  }
}
