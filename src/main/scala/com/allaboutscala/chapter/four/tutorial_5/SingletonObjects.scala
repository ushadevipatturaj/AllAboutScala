package com.allaboutscala.chapter.four.tutorial_5

object SingletonObjects extends App {
object Donutalculator{
  val discount:Double=1.75
  def totalcost(donutlist:List[String]):Double={
    println(s"Total no of Donuts are ${donutlist.length}")
    val totalcost= (donutlist.length)*2.50
    totalcost-discount
  }
}
  println("Creating objects for singleton objects to call totalcost function")
  val donutlist=List("Glazed Donut","Vanilla Donut","Coconut Donut","Strawberry Donut","Plain Donut")
  val obj=Donutalculator.totalcost(donutlist)
  println(s"Total cost of the list of Donuts : $obj")
}
