package com.allaboutscala.chapter.five.tutorial_1

object ExtendTraits extends App {
println("Creating a trait")
  trait DonutShoppingCartDao{
    def add(donut:String):Long
    def update(donut:String):Boolean
    def delete(donut:String):Boolean
    def search(donut:String):String
  }

  class DonutShoppingCart extends DonutShoppingCartDao {
    override def add(donut: String): Long = {
      println(s"Adding Donut $donut- > and the productcode is 111")
      111
    }

    override def delete(donut: String): Boolean = {
      println(s"Deleting the Donut $donut ")
      true
    }

    override def search(donut: String): String = {
      println(s"Searching Donut $donut ")
      donut
    }

    override def update(donut: String): Boolean = {
      println(s"Updating Donut $donut")
      true
    }
  }

  val shoppingCartobj:DonutShoppingCart =new DonutShoppingCart()
  shoppingCartobj.add("Glazed Donut")
  shoppingCartobj.delete("Glazed Donut")
  shoppingCartobj.search("Glazed Donut")
  shoppingCartobj.update("Glazed Donut")

  val shoppingcartobj2:DonutShoppingCartDao = new DonutShoppingCart()
  shoppingcartobj2.add("Coconut Donut")
  shoppingCartobj.delete("Coconut Donut")
  shoppingCartobj.search("Coconut Donut")
  shoppingCartobj.update("Coconut Donut")

}
