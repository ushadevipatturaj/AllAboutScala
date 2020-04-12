package com.allaboutscala.chapter.eight.tutorial_22

object Functions_MaxBy extends App {
  println("Step1: Creating case class of Donut")
  case class Donut(name:String,price:Double)

  val list1:List[Donut]=List(Donut("Plain Donut",2.50),Donut("Chocolate Donut",1.75),Donut("Caramel Donut",2.00))
  val list2:Map[String,Double]=Map(("Plain Donut",2.50),("Chocolate Donut",1.75),("Caramel Donut",2.00))
  println(list1)
  println("Step2: Applying Maxby")
  println(list1.maxBy(donut => donut.price))
  println("Step3: Applying MaxBy using ValueFunction")
  val donutmaxby:(Donut)=> Double = donut=> (donut.price)
  println(list1.maxBy(donutmaxby))
  println("Step4: Applying Maxby on Map")
  println(list2.maxBy(donut => donut._1))
}
