package com.allaboutscala.chapter.four.tutorial_4

object FieldsandValuesinCompanionObjects extends App {

  println("Creating class with print function")
class Donut (donutname :String, productcode:Option[Int]=None){
  def print(): Unit ={
    println(s"Donut name is $donutname , product code is $productcode and unique id is ${Donut.uuid}")
  }
}
  println("Creating companion Object with private value ad apply moethod")
  object  Donut{
    private val uuid =1
    def apply(donutname: String, productcode: Option[Int]): Donut = {
      new Donut(donutname, productcode)
    }
    def apply(donutname: String): Donut = {
      new Donut(donutname)
    }
  }
println("creating objects and calling print method in Donut class")
  val vanilla=Donut("Vanilla Donut",Some(111))
  val glazed=Donut("Glazed Donut")
  val plain=Donut("Plain Donut",Some(123))

  vanilla.print()
  glazed.print()
  plain.print()
}
