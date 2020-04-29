package com.allaboutscala.Exercises_Classes_Traits

object Problem_15 extends App {
  abstract class Donut(Name:String){
    def printName()
  }
  case class VanillaDonut(Name:String) extends Donut(Name){
    override def printName(): Unit = println(Name)
  }
  case class GlazedDonut(Name:String) extends Donut(Name){
    override def printName(): Unit = println(Name)
  }
  class Pastry[D<:Donut](donut:Donut){
    def name(): Unit =  donut.printName()
  }
  val vanillaDonut=VanillaDonut("Vanilla Donut")
  val glazedDonut=GlazedDonut("Glazed Donut")
  val vanillaPastry=new Pastry[VanillaDonut](vanillaDonut)
  vanillaPastry.name()
  val glazedPastry=new Pastry[GlazedDonut](glazedDonut)
  glazedPastry.name()




}
