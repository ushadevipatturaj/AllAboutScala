package com.allaboutscala.chapter.two.tutorial_13

object Enumerations extends App {
  println("Step1: Testing Enumeration in scala")
object donut extends Enumeration {
  type donut = Value

  val glazed = Value("Glazed Donut")
  val strawberry = Value("Strawberry Donut")
  val plain = Value("Plain Donut")
  val vanilla = Value("Vanilla Donut")
}
  println(s"Glazed donut string: ${donut.glazed}")
  println(s"Vanilla donut id: ${donut.vanilla.id}") // this id function gives the position of the value in enumeration
  println(s"Step2: Print all the values in the enumeration = ${donut.values}")
  println("Step3: Matching the enumeration's value through for each loop")

  donut.values.foreach{
    case d if(d==donut.glazed) => println("Glazed Donut price is 2.50")
    case d if(d==donut.plain) => println("Plain Donut price is 1.25")
    case d if(d==donut.vanilla) => println("Vanilla Donut price is 2.00")
    case _ => println("Strawberry Donut price is 2.20")
  }
}
