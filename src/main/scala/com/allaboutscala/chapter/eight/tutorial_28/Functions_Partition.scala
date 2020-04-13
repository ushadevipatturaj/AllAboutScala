package com.allaboutscala.chapter.eight.tutorial_28

object Functions_Partition extends App {
  println("Step1: Creating a list with string and Double")
  val list1:List[Any]=List("Plain Donut",2.50,"Chocolate Donut",3.75,"Caramel Donut",1.75,"Glazed Donut")
  println(list1)
  println("Step2: Applying Partition gives 2 Lists under a single List")
  val valuesPriceList:(List[Any],List[Any]) = list1.partition{
    case name:String => true
    case price: Double => false }

  println("String List is :"+valuesPriceList._1)
  println("Double Value List is :"+valuesPriceList._2)

  println("Step3: Applying partition gives seperate 2 lists")
  val (namesList,priceList) = list1.partition{
    case name:String => true
    case _ => false  }
  println("String List is :"+namesList)
  println("Double values List is :"+priceList)
}
