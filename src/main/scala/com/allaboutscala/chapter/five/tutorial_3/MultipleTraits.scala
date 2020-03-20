package com.allaboutscala.chapter.five.tutorial_3

object MultipleTraits extends App {
  println("Creating two traits")
  trait DonutShoppingCartDao[A]{
    def add(donut:A):Long
    def update(donut:A):Boolean
    def delete(donut:A):Boolean
    def search(donut:A):A
  }

  trait DonutInventory[A]{
    def checkinventory(donut:A):Int
  }

  class DonutShoppingCart[A] extends DonutShoppingCartDao [A] with DonutInventory [A]{
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

    override def checkinventory(donut: A): Int = {
      println(s"Checking the inventory for the donut $donut")
      10
    }
  }

  val shoppingCartobj:DonutShoppingCart[String] =new DonutShoppingCart[String]()
  shoppingCartobj.add("Glazed Donut")
  shoppingCartobj.delete("Glazed Donut")
  shoppingCartobj.search("Glazed Donut")
  shoppingCartobj.update("Glazed Donut")
  shoppingCartobj.checkinventory("Glazed Donut")

}
