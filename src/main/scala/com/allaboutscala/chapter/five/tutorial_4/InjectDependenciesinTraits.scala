package com.allaboutscala.chapter.five.tutorial_4

object InjectDependenciesinTraits extends App {
println("Creating DonutDatabase trait")
  trait DonutDatabase[A]{
    def addOrUpdate(donut:A):Long
    def delete(donut:A):Boolean
    def query(donut:A):A
  }
  println("Creating a class CassandraDonutStore to extend DonutDatabase trait ")
  class CassandraDonutStore[A] extends DonutDatabase[A]{
    override def addOrUpdate(donut: A): Long = {
      println(s"Add or Update Donut : -> Completed")
      1
    }

    override def delete(donut: A): Boolean = {
      println(s"Deleting a Donut : -> Completed")
      true
    }

    override def query(donut: A): A = {
      println(s"Searching for donut $donut : -> Completed")
      donut
    }
  }
  println("Creating DonutSHoppingCartDao trait")
  trait DonutShoppingCartDao[A]{
    val donutDatabase:DonutDatabase[A] // Inject Dependency
  def add(donut:A): Long ={
    println(s"Adding Donut : -> Completed")
    donutDatabase.addOrUpdate(donut)
    1  }
    def delete(donut:A):Boolean={
      println(s"Deleting Donut : -> Completed")
      donutDatabase.delete(donut)
      true}
    def search(donut:A)={
      println("Searching Donut : -> Completed")
      donutDatabase.query(donut)
    donut}
    def update(donut:A):Long={
      println("Updating donut: -> Completed")
      donutDatabase.addOrUpdate(donut)
    }
  }

  println("Creating a Donut Inventory Trait")
  trait DonutInventory[A]{
    val donutdatabase:DonutDatabase[A]
    def checkInventory(donut:A):A={
      println("Checking the inventory:-> Completed")
      donutdatabase.query(donut)
      donut}
  }
  println("Creating Donut Services Trait which extends multiple traits")
  trait DonutServices[A] extends DonutShoppingCartDao[A] with DonutInventory[A]{
    override val donutDatabase: DonutDatabase[A] = new CassandraDonutStore[A]
  }
  println("Creating a class which makes use of DonutServices trait")
//  class DonutCartServices[A] extends DonutServices[A]{
//  }
//  println("Creating instances to call DonutCartServices class")
//  val donutserviceobj=new DonutCartServices[String]
//  donutserviceobj.add("Vanilla Donut")
//  donutserviceobj.search("Vanilla Donut")
//  donutserviceobj.update("Vanilla Donut")
//  donutserviceobj.checkInventory("Vanilla Donut")
//  donutserviceobj.delete("Vanilla Donut")
}
