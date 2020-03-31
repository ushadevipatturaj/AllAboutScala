package com.allaboutscala.chapter.six.tutorial_11

import scala.collection.immutable.TreeSet

object ImmutableTreeSet extends App{
  println("Step1: Create/Initialize a TreeSet")
  val treeset1:TreeSet[String]=TreeSet("Glazed Donut","Vanilla Donut","Plain Donut")
  println(s"Printing the Elements of TreeSet:\n$treeset1")
  println("Step2:Checking the elements is present")
  println(s"Is Element Vanilla Donut available?: ${treeset1("Vanilla Donut")}")
  println(s"Is Element Chocolate Donut available?: ${treeset1("Chocolate Donut")}")

  println("Step3: Adding an Element to TreeSet using +")
  val treeset2:TreeSet[String]=treeset1+"Chocolate Donut"
  println(treeset2)

  println("Step4: Merging 2 TreeSets using ++")
  val treeset3:TreeSet[String]=treeset2++TreeSet("Strawberry Donut","Coconut Donut")
  println(treeset3)

  println("Step5: Deleting an Element using - ")
  val treeset4:TreeSet[String]=treeset2-"Glazed Donut"

  println("Step6: Intersection of 2 TreeSets using  &")
  println(treeset2&treeset3)

  println("Step7: Difference of 2 TreeSets using &~")
  println(treeset3&~treeset2)

  println("Step8: Ordering TreeSet using Ordering Parent class")

  object treeSetOrdering extends Ordering[String]{
    def compare(x: String, y: String): Int = x.compareTo(y)
  }
  val treeset5:TreeSet[String]=TreeSet("Strawberry Donut","Coconut Donut","Plain Donut")(treeSetOrdering)
  println(treeset5)

  println("Step9: Creating an Empty TreeSet")
  val treeset6:TreeSet[String]=TreeSet.empty
  println(treeset6)
}

