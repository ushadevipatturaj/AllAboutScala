package com.allaboutscala.chapter.six.tutorial_9

object ImmutableSet extends App {
  println("Step1: Create/Initialize Immutable Set")
  val set1:Set[String]=Set("Glazed Donut","Vanilla Donut","Plain Donut")
  println(s"Printing Set :\n$set1")
  println("Checking whether the values available")
  println(s"Is Vanilla Donut available in the Set? :${set1("Vanilla Donut")} ")
  println("Step2: Adding Values to the Set using +")
  val set2:Set[String]=set1+"Coconut Donut"+"Plain Donut"
  println(s"Printing Set elements :$set2")
  println("Step3: Create a Set with ++")
  val set3:Set[String]=set1++set2
  println(s"Printing the elements :$set3")

  println("Step4: Finding Intersection of Sets using &")
  println(set1&set2)
  println("Step5: Finding Difference of two Sets using ")
  println(set3 &~set1)

  println("Step5: Creating empty Set ")
  val set4:Set[String]=Set.empty
  println(set4)
}
