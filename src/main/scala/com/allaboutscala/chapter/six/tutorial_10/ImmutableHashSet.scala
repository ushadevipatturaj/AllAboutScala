package com.allaboutscala.chapter.six.tutorial_10

import scala.collection.immutable.HashSet

object ImmutableHashSet extends App {
  println("Step1: Create/Initialize a HashSet")
  val hashset1:HashSet[String]=HashSet("Glazed Donut","Vanilla Donut","Plain Donut")
  println(s"Printing the Hashset:\n$hashset1")

  println("Step2: Checking the elements present in Hashset")
  println(s"Element Plain DOnut Available in HashSet? :${hashset1("Plain Donut")}")

  println("Step3: Modifying the Sets Using +,++,-")
  val hashset2:HashSet[String]=hashset1+"Coconut Donut"
  val hashset3:HashSet[String]=hashset2++hashset1
  val hashset4:HashSet[String]=hashset3-"Glazed Donut"
  println(s"Elements after applying +: $hashset2")
  println(s"Elements after applying ++: $hashset3")
  println(s"Elements after applying -: $hashset4")

  println("Step4: Intersection of 2 HashSets using &")
  val hashset5:HashSet[String]=hashset4&hashset2
  println(hashset5)

  println("Step5: Difference of 2 HashSets")
  val hashset6:HashSet[String]=hashset3&~hashset5
  println(hashset6)

  println("Creating a empty HashSet")
  val hashset7:HashSet[String]=HashSet.empty
  println(hashset7)

}
