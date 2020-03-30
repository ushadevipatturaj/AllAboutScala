package com.allaboutscala.chapter.five.tutorial_4

object TraitDependencyInjection_Tutorial extends App {


  println("Step 1: Create a trait which knows how to do create, read, update and delete operations CRUD to a given database")
  trait DonutDatabase[A] {

    def addOrUpdate(donut: A): Long

    def query(donut: A): A

    def delete(donut: A): Boolean
  }


  println("\nStep 2: Create a class which extends trait DonutDatabase and knows how to perform CRUD operations with Apache Cassandra as storage layer")
  class CassandraDonutStore[A] extends DonutDatabase[A] {

    override def addOrUpdate(donut: A): Long = {
      println(s"CassandraDonutDatabase-> addOrUpdate method -> donut: $donut")
      1
    }

    override def query(donut: A): A = {
      println(s"CassandraDonutDatabase-> query method -> donut: $donut")
      donut
    }

    override def delete(donut: A): Boolean = {
      println(s"CassandraDonutDatabase-> delete method -> donut: $donut")
      true
    }
  }


  println("\nStep 3: Create a trait which will define the methods for a data access layer and will require dependency injection for DonutDatabase")
  trait DonutShoppingCartDao[A] {

    val donutDatabase: DonutDatabase[A] // dependency injection

    def add(donut: A): Long = {
      println(s"DonutShoppingCartDao-> add method -> donut: $donut")
      donutDatabase.addOrUpdate(donut)
    }

    def update(donut: A): Boolean = {
      println(s"DonutShoppingCartDao-> update method -> donut: $donut")
      donutDatabase.addOrUpdate(donut)
      true
    }

    def search(donut: A): A = {
      println(s"DonutShoppingCartDao-> search method -> donut: $donut")
      donutDatabase.query(donut)
    }

    def delete(donut: A): Boolean = {
      println(s"DonutShoppingCartDao-> delete method -> donut: $donut")
      donutDatabase.delete(donut)
    }

  }



  println("\nStep 4: Create a trait which will define the methods for checking donut inventory and will require dependency injection for DonutDatabase")
  trait DonutInventoryService[A] {

    val donutDatabase: DonutDatabase[A]  // dependency injection

    def checkStockQuantity(donut: A): Int = {
      println(s"DonutInventoryService-> checkStockQuantity method -> donut: $donut")
      donutDatabase.query(donut)
      1
    }

  }



  println("\nStep 5: Create a trait which will act as a facade which extends multiple traits namely trait DonutShoppingCartDao and trait DonutInventoryService. It also inject the correct DonutDatabase implementation - a CassandraDonutStore")
  trait DonutShoppingCartServices[A] extends DonutShoppingCartDao[A] with DonutInventoryService[A] {
    override val donutDatabase: DonutDatabase[A] = new CassandraDonutStore[A]()
  }



  println("\nStep 6: Create a DonutShoppingCart class which extends a single facade named DonutShoppingCartServices to expose all the underlying features required by a DonutShoppingCart")
  class DonutShoppingCart[A] extends DonutShoppingCartServices[A] {

  }


  println("\nStep 7: Create an instance of DonutShoppingCart and call the add, update, search and delete methods")
  val donutShoppingCart: DonutShoppingCart[String] = new DonutShoppingCart[String]()
  donutShoppingCart.add("Vanilla Donut")
  donutShoppingCart.update("Vanilla Donut")
  donutShoppingCart.search("Vanilla Donut")
  donutShoppingCart.delete("Vanilla Donut")


  println("\nStep 8: Call the checkStockQuantity method")
  donutShoppingCart.checkStockQuantity("Vanilla Donut")
}
