package com.allaboutscala.chapter.seven.tutorial_11
import scala.collection.mutable.Set
object MutableSet extends App{
  println("STep1: Create/Initialize a Set ")
  val set1:Set[String]=Set("Glazed Donut","Vanilla Donut","Plain Donut")
  println(set1)
  println(s"Is Set1 has element Vanilla Donut? ${set1("Vanilla Donut")}")
  println(s"Is Set1 has element Coconut Donut? ${set1("Coconut Donut")}")

  println("Step2: Modifying the Set using +,++ and -")
  set1+="Coconut Donut"
  println(set1)
  set1++=Set("Strawberry Donut")
  println(set1)
  set1-="Plain Donut"
  println(set1)

  println("Step3: Intersection of 2 Sets using &")
  val set3:Set[String]=Set("Glazed Donut","Vanilla Donut","Plain Donut")
  println(set1&set3)

  println("Step4: Difference of 2 Sets using &~")
  println(set1&~set3)

  println("Step5: Creating an Empty Set")
  val set2:Set[String]=Set.empty
  println(set2)
}
