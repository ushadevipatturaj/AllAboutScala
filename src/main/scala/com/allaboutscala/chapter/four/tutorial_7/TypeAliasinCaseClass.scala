package com.allaboutscala.chapter.four.tutorial_7

object  TypeAliasinCaseClass extends App {
println("Creating case class ")
  case class Donut(donutname :String,price :Double, productcode:Option[Int]=None)
  val vanilla =Donut("Vanilla Donut", 2.75, Some(111))
  val glazed = Donut("Glazed Donut",3.25)

  println(s"Printing the Donut class objects $vanilla $glazed")
  println("Creating type aliasing from Tuple2") // Its a meaningful type aliasing -we can use cartitem in place of Tuple2
  type cartitem[Donut,Int]= Tuple2[Donut,Int]
  val shopcartitems= new cartitem(vanilla,7)

  println("reading type alias values")
  println(s"Donut Object values " +
    s"\n Donut Name: ${shopcartitems._1.donutname} ")
  println(s" price : ${shopcartitems._1.price}" +
    s"\n product Code : ${shopcartitems._1.productcode}")

  println("iterating the type alias using foreach")

  def iteratetypeval (cartitems:Seq[cartitem[Donut,Int]]):Unit={
    cartitems.foreach{
      cartitem=> println(s" Object name is ${shopcartitems._1} and the quantity is ${shopcartitems._2}")
    }
  }
  iteratetypeval(Seq(shopcartitems))
}
