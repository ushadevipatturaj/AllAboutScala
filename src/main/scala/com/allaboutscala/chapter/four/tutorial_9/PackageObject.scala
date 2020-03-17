package com.allaboutscala.chapter.four.tutorial_9
import Implicitclass._
object PackageObject extends App {
val vanilla = Donut("Vanilla Donut", 2.75)

  println(s"Donut Name : ${vanilla.donutname} , Price : ${vanilla.price} and product name : ${vanilla.productname}")
  println(s"uuid : ${vanilla.uuid()}")
  val today =new datetime()
  println(s"Date as of today $today, and the date time class : ${today.getClass}")
}
