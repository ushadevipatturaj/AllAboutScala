package com.allaboutscala.chapter.eight.tutorial_3

object Functions_DIff extends App {
  println("Step1: Creating 2 Set")
  val set1:Set[String]=Set("Glazed Donut","Vanilla Donut","Plain Donut")
  val set2:Set[String]=Set("Vanilla Donut","Strawberry Donut")

  println(s"Difference of 2 Sets are ${set1 diff set2}")
  println(s"Difference of 2 Sets are ${set2 diff set1}")

  val list1:List[String]=List("Glazed Donut","Vanilla Donut","Plain Donut")
  val list2:List[String]=List("Vanilla Donut","Strawberry Donut")
  println(s"Difference of 2 Lists are ${list1 diff list2}")
  println(s"Difference of 2 List are ${list2 diff list1}")
}
