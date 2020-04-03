package com.allaboutscala.chapter.seven.tutorial_3

import scala.collection.mutable.ArrayStack

object MutableArrayStack extends App{
  println("Step1: Create an Array Stack")
  val arrayStack1:ArrayStack[String]=ArrayStack("Glazed Donut","Vanilla Donut","Plain Donut")
  println(arrayStack1)

  println("Step2: Adding elements using + and ++")
  arrayStack1+="Strawberry Donut"
  println(arrayStack1)
  arrayStack1++=ArrayStack("Krispy Kreme Donut")
  println(arrayStack1)
  arrayStack1-="Plain Donut"
  println(arrayStack1)

  println("Step3: deleting an element using Pop")
  println(arrayStack1.pop())
  println(arrayStack1)

  println("Step4: Pushing an element")
  arrayStack1.push("Plain Donut")
  println(arrayStack1)

  println("Step5: Creating an empty ArrayStack")
  val arrayStack2=ArrayStack.empty
  println(arrayStack2)
}
