package com.allaboutscala.chapter.three.tutorial_22

object NestedFunctions extends App {
println("creating a function to check donut availability")
  def checkavailability(donut:String):Boolean={
    val listdonuts = List("Glazed Donut","Plain Donut","Vanilla Donut","Strawberry Donut")
    val found =(donut.nonEmpty && donut.length>0)&&(listdonuts.contains(donut))
    found
  }
  println("Step1: calling a function")
  println(s"Check availability for Vanila Donut :${checkavailability("Vanilla Donut")}")
  println("creating a nested function to check donut availability")
  def checkavailabilitynested(donut:String):Boolean={
    val listdonuts = List("Glazed Donut","Plain Donut","Vanilla Donut","Strawberry Donut")
    val validate =(donut:String) =>{
      (donut.nonEmpty && donut.length>0)
    }
    val found = validate(donut) &&(listdonuts.contains(donut))
    found
  }
  println("Step2: calling a nested function")
  println(s"Check availability for Vanila Donut :${checkavailabilitynested("Vanilla Donut")}")
}
