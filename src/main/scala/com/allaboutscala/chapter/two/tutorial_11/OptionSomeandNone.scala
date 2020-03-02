package com.allaboutscala.chapter.two.tutorial_11

object OptionSomeandNone extends App{
println("Step1: Using Option with Some")
  val glazeddonut: Option[String]=Some("Glazed Donut")
  println(s"Get donut name using get method ${glazeddonut.get}")
  println("Step2: Using Option with Some")
  val nodonut: Option[String]=None
  println(s"Get donut name using getorElse method ${nodonut.getOrElse("No Donut")}")
  println("Step3: Pattern matching for Some and None")
  val donuttype=List(glazeddonut,nodonut)
  donuttype.foreach{str=> str match {
    case Some(str) => println("It has some value")
    case None => println("It has None")
  }}

}
