package com.allaboutscala.chapter.five.tutorial_2

object ExtendsTraitswithParameter extends App {
  println("Creating a trait")
  trait DonutShoppingCartDao[A]{
    def add(donut:A):Long
    def update(donut:A):Boolean
    def delete(donut:A):Boolean
    def search(donut:A):A
  }

  class DonutShoppingCart[A] extends DonutShoppingCartDao[A] {
    override def add(donut: A): Long = {
      println(s"Adding Donut $donut- > and the productcode is 111")
      111
    }

    override def delete(donut: A): Boolean = {
      println(s"Deleting the Donut $donut ")
      true
    }

    override def search(donut: A): A = {
      println(s"Searching Donut $donut ")
      donut
    }

    override def update(donut: A): Boolean = {
      println(s"Updating Donut $donut")
      true
    }
  }

  val shoppingCartobj:DonutShoppingCart[String] =new DonutShoppingCart[String]()
  shoppingCartobj.add("Glazed Donut")
  shoppingCartobj.delete("Glazed Donut")
  shoppingCartobj.search("Glazed Donut")
  shoppingCartobj.update("Glazed Donut")

  val shoppingcartobj2:DonutShoppingCartDao[String] = new DonutShoppingCart[String]()
  shoppingcartobj2.add("Coconut Donut")
  shoppingCartobj.delete("Coconut Donut")
  shoppingCartobj.search("Coconut Donut")
  shoppingCartobj.update("Coconut Donut")

}
