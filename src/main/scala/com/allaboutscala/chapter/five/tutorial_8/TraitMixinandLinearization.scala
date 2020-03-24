package com.allaboutscala.chapter.five.tutorial_8

object TraitMixinandLinearization extends App {
case class Donut(name:String)

  trait ShoppingCart[T]{
    def printItems(item:Seq[T]): Unit
  }

  class DonutShoppingCart[T] extends ShoppingCart[T]{
    override def printItems(item: Seq[T]): Unit = {
      item.foreach(println(_))
    }
  }
  //Mixing the traits with trait inheritance
  trait PrettyPrintUpperCase[T] extends ShoppingCart[T]{
    override def printItems(item: Seq[T]): Unit = item.foreach(i =>println(i.toString.toUpperCase))
  }

  trait PrettyPrintLowerCase[T] extends ShoppingCart[T]{
    override def printItems(item: Seq[T]): Unit = item.foreach(i =>println(i.toString.toLowerCase()))
  }
  val donuts = Seq (Donut("Vanilla Donut"),Donut("Plain Donut"))
  val shoppingCartobj= new DonutShoppingCart[Donut]
  shoppingCartobj.printItems(donuts)
  //Linearization with multiple traits
  val shoppingCartobj1=new PrettyPrintUpperCase[Donut] with ShoppingCart[Donut]
  shoppingCartobj1.printItems(donuts)
  val shoppingCartobj2 = new PrettyPrintLowerCase[Donut] with ShoppingCart[Donut]
  shoppingCartobj2.printItems(donuts)

}
