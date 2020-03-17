package com.allaboutscala.chapter.four.tutorial_8

object ImplicitClasses extends App {
case class Donut (donutname:String, price:Double, productcode:Option[Int]=None){
  def print(): Unit ={
    println(s"Donut name : $donutname ,price: $price and product code: $productcode")
  }
}

  val vanilla = Donut("Vanilla Donut",2.75)
  vanilla.print()
import DonutImplicits._

  println(s"uuid for the vanilla object is ${vanilla.uuid()}")

}
