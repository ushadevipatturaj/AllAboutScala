package com.allaboutscala.Exercises_Classes_Traits

object Problem_2 extends App {
  case class Shoppingcart(name:String,qty:Int,price:Double)

  def printSnacks(snacks:List[Shoppingcart])={
    snacks.foreach(snack => println(s"${snack.qty} ${snack.name} at $$${snack.price} each"))
  }
  def printVanilla(snacks:List[Shoppingcart])={
    snacks.foreach{snack => if (snack.name=="cupcakes") println("Found Cupcake Item!")
    else println("Found another item!")
    }
  }
  val vanillaIceCream=Shoppingcart("vanilla ice cream",10,2.99)
  val chocolateBiscuits=Shoppingcart("chocolate biscuits",3,3.99)
  val cupCake=Shoppingcart("cupcakes",5,4.99)
  val snackList=List(vanillaIceCream,chocolateBiscuits,cupCake)
  printSnacks(snackList)
  printVanilla(snackList)
}
