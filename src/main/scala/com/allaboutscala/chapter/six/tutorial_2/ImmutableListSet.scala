package com.allaboutscala.chapter.six.tutorial_2

import scala.collection.immutable.ListSet

object ImmutableListSet extends App {
println("Step1: Creating /Initializing a ListSet")
  val listset1:ListSet[String]= ListSet("Plain Donut","Strawberry Donut","Coconut Donut")
  println(s"Printing the Listset values $listset1")
  println("Checking whether the values are available in the Listset")
  println(s"Is Plain Donut Available in Listset1? : ${listset1("Plain Donut")}")
  println(s"Is Vanilla Donut Available in Listset1? : ${listset1("Vanilla Donut")}")
  println(s"Is Coconut Donut Available in Listset1? : ${listset1("Coconut Donut")}")

  println("Step2: Creating another Listset by using + and ++")
  val listset2:ListSet[String]=listset1+"Vanilla Donut"
  val listset3:ListSet[String]=listset1++listset2
  println(s"ListSet2 values are $listset2")
  println(s"ListSet3 values are $listset3")

  println("Step3: Creating another Listset by using -")
  val listset4:ListSet[String]=listset3-"Vanilla Donut"
  println(s"ListSet after removing a value using - keyword $listset4")


  println("Step4: Creating Empty Listset")
  val listset5:ListSet[Any]=ListSet.empty[Any]
  println(s"Empty ListSet is $listset5")
}
