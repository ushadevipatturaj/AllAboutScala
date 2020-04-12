package com.allaboutscala.chapter.eight.tutorial_20

object Functions_Map extends App {
  println("Step1: Creating an list")
  val set1:Set[String]=Set("Plain","Strawberry","Chocolate")
  println("Step2: Applying map function on Set")
  println(s"Set $set1")
  println("Set after applying Map"+set1.map(_+" Donut"))
  println("Creating an List with None")
  val set2:Set[Any]=Set("Plain Donut","Strawberry Donut",None)
  println(set2.map(_+" X"))
  println(set2.map{
    case x:String=> x+" X"
    case _ => "Unknown Donut"
  })
  def favouriteDonut:Option[String] = Some("Glazed Donut")
  def leaseFavoriteDonut:Option[String]=None

  println("Applying Map on Some/None values")
  favouriteDonut.map(x => println(s"Donut Name is $x"))
  leaseFavoriteDonut.map(x=>println(s"Unknown Donut")) //this will not be executed since it filters out None
}
