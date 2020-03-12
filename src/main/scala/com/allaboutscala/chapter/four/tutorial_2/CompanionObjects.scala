package com.allaboutscala.chapter.four.tutorial_2

object CompanionObjects extends App {

  println("creating a class donut ")

  class Donut (donutname :String, productcode :Int){
    def print()={
      println(s"Donut name is $donutname ad the product code is $productcode")
    }
  }
println("creating companion objects for the class Donut")
  object Donut{
    def apply(donutname :String, productcode :Int):Donut= {
      new Donut(donutname  ,productcode )
    }
  }
  println("creating instantiation of Donut class using companion object")
  val vanilladonut=Donut("Vanilla Donut",111)
  val glazeddonut=Donut("Glazed Donut",222)
  println("calling the function inside the class")
  vanilladonut.print()
  glazeddonut.print()
}