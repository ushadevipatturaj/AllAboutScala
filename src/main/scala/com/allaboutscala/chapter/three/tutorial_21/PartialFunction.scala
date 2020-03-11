package com.allaboutscala.chapter.three.tutorial_21

object PartialFunction extends App {
val verytasty : PartialFunction[String,String] ={
case "Glazed Donut" | "Strawberry Donut" =>"Very Tasty"
}

  val tasty : PartialFunction[String,String] ={
    case "Plain Donut"  =>"Tasty"
  }
  val unknowntaste : PartialFunction[String,String] ={
    case donut @ _ => s"unknown taste of  $donut"
  }

  println("Creating and calling partial function to match cases")
  println(s"Tastelevel for Glazed Donut is :${verytasty("Glazed Donut")}")
  println(s"Tastelevel for Strawberry Donut is :${verytasty("Strawberry Donut")}")
  println(s"Tastelevel for Plain Donut is :${tasty("Plain Donut")}")
  println(s"Tastelevel for Coconut Donut is :${unknowntaste("Coconut Donut")}")
}
