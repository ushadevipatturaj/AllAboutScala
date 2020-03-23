package com.allaboutscala.chapter.five.tutorial_6

object TraitCompanion extends App {
object Cakes{
  trait Cake{
    def name:String
  }
  class CupCake extends Cake{
    override def name: String = "Cupcake is very delicious"
  }
  class UnknownCake extends Cake{
    override def name: String = "Unknown Cake , but delicious"
  }
}
  object Cakefactory{ //wrapper Object for cake
    import Cakes._
    def apply(cake:String):Cake={
    cake match {
      case "Cup Cake" => new CupCake()
      case _ => new UnknownCake()
    }
    }
  }
  println(s"Cupcake : = ${Cakefactory("Cup Cake").name}")
  println(s"Cupcake : = ${Cakefactory("Roll Cake").name}")
}
