package com.allaboutscala.chapter.ten.tutorial_1

class Functions_Test {
    def donutprice(quantity:Int):Double = {
      println("calculating the price of the donuts bought..." +
        s"Quantities bought =$quantity")

      2.50*quantity
    }

}
