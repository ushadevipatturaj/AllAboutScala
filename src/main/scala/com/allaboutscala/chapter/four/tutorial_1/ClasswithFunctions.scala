package com.allaboutscala.chapter.four.tutorial_1

import com.allaboutscala.chapter.four.tutorial_1.ClasswithFunctions.vanilladonut

object ClasswithFunctions extends App {
  println("creating instantiation of ClasswithFunctions and call the method")
    val vanilladonut=new ClasswithFunctions("Vanilla Donut",111)
    val glazeddonut=new ClasswithFunctions("Glazed Donut",222)
    vanilladonut.printvalues()
    glazeddonut.printvalues()

}
class ClasswithFunctions(donutname:String, productcode:Int) {
  def printvalues() = {
    println(s"Donut Name is $donutname and the product code is $productcode")
  }
}