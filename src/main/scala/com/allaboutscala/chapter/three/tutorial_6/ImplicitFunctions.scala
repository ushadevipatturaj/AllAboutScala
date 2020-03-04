package com.allaboutscala.chapter.three.tutorial_6

object ImplicitFunctions extends App{

  println("using wrapper classes which extends String class")
class donutString(s:String){
  def isFavourite():Boolean = s=="Glazed Donut"
}
  println("Assigning implicit Functions to call")
  object donutConversions {
    implicit def stringToDonut(s: String )=new donutString(s) //implicit function call
  }
import donutConversions._
  println("using implicit Functions")
  val glazed="Glazed Donut"
  val vanilla="Vanilla Donut"
  println(s"Is $glazed is my favorite donut ? : ${glazed.isFavourite}")
  println(s"Is $vanilla is my favorite donut ? : ${vanilla.isFavourite}")
}
