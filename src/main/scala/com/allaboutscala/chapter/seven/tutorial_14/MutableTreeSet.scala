package com.allaboutscala.chapter.seven.tutorial_14

import scala.collection.mutable.TreeSet

object MutableTreeSet extends App {
  println("Step1: Create/Initialize TreeSet")
  val treeSet1:TreeSet[String]=TreeSet("Glazed Donut","Vanilla Donut","Plain Donut")
  println(treeSet1)

  println(s"Is Vanilla Donut available in Treeset? ${treeSet1("Vanilla Donut")}")
  println(s"Is Chocolate Donut available in Treeset? ${treeSet1("Chocolate Donut")}")

  print("Step2: Modifying the TreeSet using +, ++ and -")
  treeSet1+="Chocolate Donut"
  print(treeSet1)
  treeSet1++=TreeSet("Strawberry Donut")
  print(treeSet1)
  treeSet1-="Plain Donut"
  print(treeSet1)

  println("Step3: Intersection of 2 TreeSets using &")
  val treeSet2:TreeSet[String]=TreeSet("Glazed Donut","Vanilla Donut","Plain Donut")
  println(treeSet1&treeSet2)

  println("Step4: Difference of 2 TreeSets using &~")
  println(treeSet2&~treeSet1)

  println("Step5: Creating Function to order the elements in TreeSet")
  object donutSorting extends Ordering[String]{
    def compare(x:String,y:String)=x.compareTo(y)
  }
  val treeSet3:TreeSet[String]=TreeSet("Glazed Donut","Vanilla Donut","Plain Donut")(donutSorting)
  println(treeSet3)

  println("Step6: Creating an empty TreeSet")
  val treeSet4:TreeSet[String]=TreeSet.empty
  println(treeSet4)

  println("Step7: Printing elements of Treeset using foreach")
  treeSet1.foreach( x=> println(s"Element of TreeSet is $x"))
}
