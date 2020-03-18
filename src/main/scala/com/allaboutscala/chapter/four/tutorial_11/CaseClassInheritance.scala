package com.allaboutscala.chapter.four.tutorial_11

object CaseClassInheritance extends App {
abstract class Donut(name:String){
    def printname:Unit
  }
println("Creating case class to extend Donut abstract class")
  case class Vanilladonut(name:String) extends Donut (name){
    override def printname(): Unit = {
      println(s"Donut name is $name")
    }
  }

  //No need to create a companion object since the case class has in-built apply()
  val vanilla =Vanilladonut("Vanilla Donut")
  println("Calling the overridden method through subclass")
  vanilla.printname()
}
