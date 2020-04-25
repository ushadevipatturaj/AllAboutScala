package com.allaboutscala.Exercises_Classes_Traits

object Problem_1 extends App {
  val tupleVal:(String,Int,Double)=("Pocket Rice",5,10.99)
  case class shoppingCartItem(name:String,qty:Int,price:Double)
  val cartValue=shoppingCartItem("Pocket Rice",5,10.99)
  println(s"A ${tupleVal._1} is currently priced at $$${tupleVal._3}, and the customer bought ${tupleVal._2}.")
  println(s"A ${cartValue.name} is currently priced at $$${cartValue.price}, and the customer bought ${cartValue.qty}.")

}
