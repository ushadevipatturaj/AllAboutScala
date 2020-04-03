package com.allaboutscala.chapter.seven.tutorial_4

import scala.collection.mutable.ListBuffer

object MutableListBuffer extends App {
  println("Step1: Create/Initialize an ListBuffer")
  val listBuffer1:ListBuffer[String]=ListBuffer("Glazed Donut","Vanilla Donut","Plain Donut")
  println(listBuffer1)
  println("Step2: Modifying the ListBuffer Using +,++ and -")
  listBuffer1+="Strawberry Donut"
  println(s"List Buffer after applying + $listBuffer1")
  listBuffer1++=ListBuffer("Coconut Donut","Krispy Kreme Donut")
  println(s"ListBuffer after applying ++ $listBuffer1")
  listBuffer1-="Plain Donut"
  println(s"ListBuffer after applying - $listBuffer1")

  println("Step3: Creating an empty ListBuffer")
  val listBuffer2=ListBuffer.empty
  println(listBuffer2)

}
