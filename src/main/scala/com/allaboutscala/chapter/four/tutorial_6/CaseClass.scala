package com.allaboutscala.chapter.four.tutorial_6

object CaseClass extends App{
println("Creating case class for Donut")
  case class Donut(donutname :String,price:Double, productcode:Option[Int]=None)

  val vanilla= Donut("Vanilla Donut", 2.50,Some(111))
  val glazed =Donut("Glazed Donut", 1.75)

  println("Printing the Donut objects")
  println(s"Vanilla Donut object $vanilla}")
  println(s"Glazed Donut object $glazed")

  println("printing each properties of an object")
  println(s"Donut Name ${vanilla.donutname}")
  println(s"Donut Name ${vanilla.price}")
  println(s"Donut Name ${glazed.productcode}") //these values cannot be modified since these objects are immutable

  println("Defining Hashcode and equals method for Donut Object")
  val mapdonut:Map[String,Int] = Map("Vanilla Donut" -> 5)
  val mapdonut1:Map[String,Int] = Map("Glazed Donut" -> 7)
//equals ad hashcode functions are already implemented through case class
  val equalstest=mapdonut.equals(mapdonut1)
  val found=mapdonut.hashCode()

  println(equalstest+","+ found)

println(s"Key and values from Map ${mapdonut1("Glazed Donut")} , ${mapdonut.values}")
  println("using copy() method to copy values of case class")
  val chocolatevanilladonut = vanilla.copy("Chocolate Vanilla Donut", 2.75,Some(235))
  println(s"Copied Donut object is $chocolatevanilladonut")
}