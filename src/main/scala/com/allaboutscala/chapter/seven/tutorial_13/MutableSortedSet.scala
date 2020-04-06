package com.allaboutscala.chapter.seven.tutorial_13
import scala.collection.mutable.SortedSet
object MutableSortedSet extends App {
  println("Step1: Create/Initialize SortedSet")
  val sortedSet1:SortedSet[String]=SortedSet("Glazed Donut","Vanilla Donut","Plain Donut")
  println(sortedSet1)
  println(s"Is Vanilla Donut available in Sorted Set? ${sortedSet1("Vanilla Donut")}")
  println(s"Is Chocolate Donut available in Sorted Set? ${sortedSet1("Chocolate Donut")}")

  println("Step2: Modifying a SortedSet using +,++ and -")
  sortedSet1+="Chocolate Donut"
  println(sortedSet1)
  sortedSet1++=SortedSet("Strawberry Donut")
  println(sortedSet1)
  sortedSet1-="Plain Donut"
  println(sortedSet1)

  println("Step3: Intersection of 2 sorted sets using &")
  val sortedSet2:SortedSet[String]=SortedSet("Glazed Donut","Vanilla Donut","Plain Donut")
  println(sortedSet1&sortedSet2)

  println("Step4: Difference of 2 Sorted sets using &~")
  println(sortedSet1&~sortedSet2)

  println("Step5: Function to sort the elements of SortedSet")
  object donutorder extends Ordering[String]{
    def compare(x: String, y: String): Int =x.compareTo(y)
  }
  val sortedSet3: SortedSet[String]=SortedSet("Glazed Donut","Vanilla Donut","Plain Donut")(donutorder)
  println(sortedSet3)

  println("Step6: Creating an Empty Sorted Set")
  val sortedSet4:SortedSet[String]=SortedSet.empty
  println(sortedSet4)
}

