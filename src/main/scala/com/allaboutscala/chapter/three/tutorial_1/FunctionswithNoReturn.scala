package com.allaboutscala.chapter.three.tutorial_1

object FunctionswithNoReturn extends App{

  def favouritedonut():String ={
  "Glazed Donut"
  }
println("Step1: Creating function with no parameters and with return type")
  println(s"favorite donut name is : ${favouritedonut()}")

  def leastfavouritedonut="Plain Donut" // if there is no side effects, there will be no need for brackets and parenthesis

  println("Step2: Creating function with no parenthesis")
  println(s"least favorite donut name is : ${leastfavouritedonut}")

  def printdonutreport():Unit ={
    println("Printing Donut reports... Done!")
  }
  println("Step3: Creating function with no parameters and with return type")
printdonutreport()
}
