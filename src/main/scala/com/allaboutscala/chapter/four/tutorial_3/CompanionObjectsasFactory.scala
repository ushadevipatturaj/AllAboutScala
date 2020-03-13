package com.allaboutscala.chapter.four.tutorial_3

object CompanionObjectsasFactory extends App{

  println("Creating parent class of Donut")
class Donut(donutname:String, productcode:Option[Int]=None){
    def print() ={
      println(s"Donut name is :$donutname and the productcode is ${productcode.getOrElse(0)}")
    }
  }
  println("Creating sub classes of Donut class")
  class GlazedDonut(donutname:String) extends Donut(donutname)
  class VanillaDonut(donutname:String) extends Donut(donutname )
println("Creating companion object as a factory for all classes")
  object Donut{
    def apply(donutname: String, productcode: Option[Int]=None): Donut = {
donutname match {
  case "Glazed Donut" => new Donut(donutname)
  case "Vanilla Donut" => new Donut(donutname)
  case _ => new Donut(donutname,Option(productcode.getOrElse(0)))
}
    }
  }
println("Calling class Donut and Inherited from Donut class")
  val glazed=Donut("Glazed Donut")
  val vanilla=Donut("Vanilla Donut")
  val plain=Donut("Plain Donut", Some(111))
  println("Calling print method in the parent class through companion Object")
  glazed.print()
  vanilla.print()
  plain.print()
}
