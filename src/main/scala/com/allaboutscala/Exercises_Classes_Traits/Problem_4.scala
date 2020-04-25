package com.allaboutscala.Exercises_Classes_Traits

object Problem_4 extends App {

  class BasketValidate(){
    def validate(item:Any)={
      item match {
        case i:String => println(s"Found the valid item $i")
        case i:Int => println(s"Item $i of type Int is not valid")
        case i:Double => println(s"Item $i of type Double is not valid")
        case _ => println(s"Item $item should be removed from the basket.")
      }
    }
  }
  object BasketValidate{
    def apply(): BasketValidate = new BasketValidate()
  }
  val cartValue=List("Cupcake", 2.99, 100L, 7, "Ice Cream")
  cartValue.foreach(item=>BasketValidate().validate(item))

}
