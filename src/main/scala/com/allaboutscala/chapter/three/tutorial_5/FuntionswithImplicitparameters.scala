package com.allaboutscala.chapter.three.tutorial_5

object FuntionswithImplicitparameters extends App {
def totalcost(donutname:String, quantity:Int)(implicit discount :Double):Double ={
  println(s"Donut name is $donutname and quantity is $quantity")
  val totalcost =2.50*quantity*(1-discount)
  totalcost
}

  println("Step1: Functions with implicit parameters and automatic pass-through values ")
  implicit val discount=0.2
  println(s"Total cost of the donut is ${totalcost("Glazed Donut",7)}") //implicit variable is being taken care automatically

  def totalcost2(donutname:String, quantity:Int)(implicit discount :Double ,sellername:String):Double ={
    println(s"Donut name is $donutname and quantity is $quantity")
    val totalcost =2.50*quantity*(1-discount)
    totalcost
  }

  println("Step2: Functions with multiple implicit parameters and Manual pass-through over values")
  implicit val sellername="Donut Shop"
  println(s"Total cost of the donut is ${totalcost2("Glazed Donut",7)(0.3,sellername)}") //implicit variable is being taken care automatically


}
