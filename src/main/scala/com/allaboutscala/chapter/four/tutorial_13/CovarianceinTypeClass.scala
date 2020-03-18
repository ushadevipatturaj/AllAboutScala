package com.allaboutscala.chapter.four.tutorial_13

object CovarianceinTypeClass extends App {

    abstract class Donut(name:String){
      def printname:Unit
    }
    println("Creating case sub classes for class Donut")
    case class VanillaDonut (name:String) extends Donut(name){
      override def printname: Unit = {
        println(s"Donut name =$name")
      }
    }

    case class GlazedDonut (name:String) extends Donut(name){
      override def printname: Unit = {
        println(s"Donut name =$name")
      }
    }
    println("Creating objects for the subclasses of Donut")
    val vanilla=VanillaDonut("Vanilla Donut")
    val glazed=GlazedDonut("Glazed Donut")
    vanilla.printname
    glazed.printname

    println("Creating typed classes of type Donut ")
    // the typed class will not allow ay other type apart from Donut, for eg, we cannot create Seq[String]
    class Shoppingcart[+D <: Donut](shoppingcart:Seq[D]){ // Shoppingcart[+D<: Donut] is the covariance to allow creation of vanilla object under donut class
      def printcartitems = shoppingcart.foreach(donut => println(s"Donut name is :$donut"))
    }
    println("creating Seq with Donut objects and call Shopping cart class")
    val donutsequence= Seq[Donut](vanilla,glazed)
    val shoppingcartobj=new Shoppingcart[Donut](donutsequence)
  val shoppingcartobj1:Shoppingcart[Donut]=new Shoppingcart[Donut](donutsequence)
  val shoppingcartobj2:Shoppingcart[VanillaDonut] = new Shoppingcart[VanillaDonut](Seq(vanilla))
  val shoppingcartobj3:Shoppingcart[Donut]=new Shoppingcart[VanillaDonut](Seq(vanilla)) //this will work only when the covariance is enabled Shoppingcart[+D<: Donut]
    shoppingcartobj.printcartitems
  shoppingcartobj1.printcartitems
  shoppingcartobj2.printcartitems
  shoppingcartobj3.printcartitems
}
