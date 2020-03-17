package com.allaboutscala.chapter.four.tutorial_10

object ClassInheritance extends App {

  abstract class Donut(name:String){
    def printname:Unit
  }

  class vanilladonut(name:String) extends Donut(name){
    override def printname: Unit = println(s"Printing the name inside subclass of Donut :The Donut name is $name")
  }
  object vanilladonut{
    def apply(name: String): vanilladonut = new vanilladonut(name)
  }

  class glazeddonut(name:String) extends Donut(name){
    override def printname: Unit = println(s"Printing the name inside subclass of Donut :The Donut name is $name")
  }
  object glazeddonut{
    def apply(name: String): glazeddonut = new glazeddonut(name)
  }

  val vdonut=vanilladonut("Vanilla Donut")
  val gdonut=glazeddonut("Glazed Donut")

  println(s"Objects created for the 2 subclasses of Donut: ")
  vdonut.printname
  gdonut.printname
}
