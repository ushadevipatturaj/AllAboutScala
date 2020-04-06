package com.allaboutscala.chapter.seven.tutorial_12
import scala.collection.mutable.HashSet
object MutableHashSet extends App {
  println("Step1: Create/Initialize a HashSet ")
  val hashSet1:HashSet[String]=HashSet("Glazed Donut","Vanilla Donut","Plain Donut")
  println(hashSet1)
  println(s"Is Element Vanilla Donut available in HashSet1? ${hashSet1("Vanilla Donut")}")
  println(s"Is Element Coconut Donut available in HashSet1? ${hashSet1("Coconut Donut")}")

  println("Step2: Modifying a HashSet using +, ++ and -")
  hashSet1+="Coconut Donut"
  println(hashSet1)
  hashSet1++=HashSet("Strawberry Donut")
  println(hashSet1)
  hashSet1-="Plain Donut"
  println(hashSet1)

  println("Step3: Intersection of 2 HashSets using &")
  val hashSet2:HashSet[String]=HashSet("Glazed Donut","Vanilla Donut","Plain Donut")
  println(hashSet1&hashSet2)

  println("Step4: Difference of 2 HashSets using &~")
  println(hashSet1&~hashSet2)
  println("Step5: Creating an Empty HashSet")
  val hashSet3:HashSet[String]=HashSet.empty
  println(hashSet3)
}
