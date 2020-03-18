package com.allaboutscala.chapter.four.tutorial_12

object TypedClass extends App {
abstract class Donut(name:String){
  def printname:Unit
}
println("Creating case sub classes for class Donut")
  case class VanillaDonut (name:String) extends Donut(name){
    override def printname(): Unit = {
      println(s"Donut name =$name")
    }
  }

  case class GlazedDonut (name:String) extends Donut(name){
    override def printname(): Unit = {
      println(s"Donut name =$name")
    }
  }
println("Creating objects for the subclasses of Donut")
  val vanilla:Donut=VanillaDonut("Vanilla Donut")
  val glazed=GlazedDonut("Glazed Donut")
  vanilla.printname
  glazed.printname

println("Creating typed classes of type Donut ")
// the typed class will not allow ay other type apart from Donut, for eg, we cannot create Seq[String]
  class Shoppingcart[D <: Donut](shoppingcart:Seq[D]){
    def printcartitems = shoppingcart.foreach(donut => println(s"Donut name is :$donut"))
  }
println("creating Seq with Donut objects and call Shopping cart class")
  val donutsequence= Seq[Donut](vanilla,glazed)
  val shoppingcartobj=new Shoppingcart[Donut](donutsequence)
  shoppingcartobj.printcartitems

}
