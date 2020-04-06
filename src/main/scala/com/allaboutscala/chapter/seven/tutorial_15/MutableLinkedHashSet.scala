package com.allaboutscala.chapter.seven.tutorial_15
import scala.collection.mutable.LinkedHashSet
object MutableLinkedHashSet extends App {
  println("Step1: Create/Initialize Linked HashSet")
  val linkedHashSet1:LinkedHashSet[String]=LinkedHashSet("Glazed Donut","Vanilla Donut","Plain Donut")
  println(linkedHashSet1)
  println(s"Is Element Vanilla Donut available in linkedHashSet? ${linkedHashSet1("Vanilla Donut")}")
  println(s"Is Element Chocolate Donut available in LinkedHashSet? ${linkedHashSet1("Chocolate Donut")}")

  println("Step2: Modifying the LinkedHashSet suing +, ++ and -")
  linkedHashSet1+="Chocolate Donut"
  println(linkedHashSet1)
  linkedHashSet1++=LinkedHashSet("Strawberry Donut")
  println(linkedHashSet1)
  linkedHashSet1-="Plain Donut"
  println(linkedHashSet1)

  println("Step3: Intersection of 2 LinkedHashSets using &")
  val linkedHashSet2: LinkedHashSet[String]=LinkedHashSet("Glazed Donut","Vanilla Donut","Plain Donut")
  println(linkedHashSet1&linkedHashSet2)

  println("Step4: Difference of 2 LinkedHashSets using &~")
  println(linkedHashSet2&~linkedHashSet1)

  println("Step4: Creating an empty LinkedHashSet")
  val linkedHashSet3:LinkedHashSet[String]=LinkedHashSet.empty
  println(linkedHashSet3)

  println("Step6: Reading elements using for each")
  linkedHashSet1.foreach( x=> println(s"Element is $x"))
}
