package com.allaboutscala.chapter.six.tutorial_12

import scala.collection.immutable.SortedSet

object ImmutableSortedSet extends App {
  println("Step1: Create/Initialize a Sorted Set")
  val sortedset1:SortedSet[String]=SortedSet("Glazed Donut","Vanilla Donut","Plain Donut")
  println(sortedset1)

  println("Step2: Validating whether the element is available?")
  println(s"Is Vanilla Donut available in the Sorted Set?: ${sortedset1("Vanilla Donut")}")
  println(s"Is Chocolate Donut available in the Sorted Set?: ${sortedset1("Chocolate Donut")}")

  println("Step3: Creating new SortedSet using +, ++ and -")
  val sortedset2:SortedSet[String]=sortedset1+"Chocolate Donut"
  val sortedset3:SortedSet[String]=sortedset2++SortedSet("Strawberry Donut")
  val sortedset4:SortedSet[String]=sortedset3-"Plain Donut"
  println(sortedset2 )
  println(sortedset3)
  println(sortedset4)

  println("Step4: Intersection of 2 SortedSets using&")
  println(s"Intersection of Sortedset1 and 2 are :${sortedset1&sortedset2}")

  println("Step5: Difference of 2 Sorted Sets using &~")
  println(s"Difference of Sortedset3 and 4 are ${sortedset3&~sortedset4}")

  object setOrdering extends Ordering[String]{
    def compare(x: String, y: String): Int = x.compareTo(y)
  }
  val sortedset5:SortedSet[String]=SortedSet("Strawberry Donut","Plain Donut","Glazed Donut","Vanilla Donut")
  println(sortedset5)

  println("Step6: Creating an empty Sorted Set")
  val sortedset6:SortedSet[String]=SortedSet.empty
  println(sortedset6)

}
