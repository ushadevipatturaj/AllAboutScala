package com.allaboutscala.chapter.six.tutorial_16

object ImmutableVector extends App {
  println("Step1:Creating a Vector")
  val vector1:Vector[String]=Vector("Glazed Donut","Vanilla Donut","Plain Donut")
  println(vector1) // Vector is nothing but a List, but it addresses the inefficiency of random access within list

  println(s"Element in Index 0: ${vector1(0)}")
  println(s"Element in Index 1: ${vector1(1)}")
  println(s"Element in Index 2: ${vector1(2)}")

  println("Step2: Creating Vectors using +,++ ")
  val vector2:Vector[String]="Chocolate Donut"+:vector1
  val vector3:Vector[String]=vector1++Vector[String]("Strawberry Donut")
  println(vector2)
  println(vector3)

  println("Step3: Creating an empty Vector")
  val vector4:Vector[String]=Vector.empty
  println(vector4)
}
