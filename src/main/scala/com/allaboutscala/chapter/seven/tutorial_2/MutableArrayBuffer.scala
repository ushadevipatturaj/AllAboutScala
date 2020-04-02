package com.allaboutscala.chapter.seven.tutorial_2

import scala.collection.mutable.ArrayBuffer

object MutableArrayBuffer extends App {
  println("Step1: Create an ArrayBuffer")
  val arraybuffer1:ArrayBuffer[String]=ArrayBuffer("Glazed Donut","Plain Donut","Vanilla Donut")
  println(arraybuffer1)

  println("Step2: Accessing Elements at specific index")
  println(arraybuffer1(0))
  println(arraybuffer1(1))
  println(arraybuffer1(2))

  println("Step3: Adding/Removing elements to Array Buffer using +,++,- and --")
  arraybuffer1+="Coconut Donut"
  println(s"Printing the Arraybuffer1 after applying + $arraybuffer1")
  arraybuffer1++=ArrayBuffer("Chocolate Donut","Strawberry Donut","Vanilla Donut","Krispy Kreme Donut")
  println(s"Printing the Arraybuffer1 after applying ++ $arraybuffer1")
  arraybuffer1-="Plain Donut"
  println(s"Printing the Arraybuffer1 after applying - $arraybuffer1")
  arraybuffer1--=ArrayBuffer("Glazed Donut","Vanilla Donut")
  println(s"Printing the Arraybuffer1 after applying -- $arraybuffer1")

  println("Step4: Creating an Empty ArrayBuffer")
  val arraybuffer2=ArrayBuffer.empty
  println(arraybuffer2)

}

