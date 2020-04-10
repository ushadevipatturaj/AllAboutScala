package com.allaboutscala.chapter.eight.tutorial_9

object Functions_FlatMap extends App {
  println("Step1: Create two Sets ")
  val set1:Set[String]=Set("Plain Donut","Vanilla Donut","Glazed Donut")
  val set2: Set[String]=Set("Strawberry Donut","Chocolate Donut")
  val set3:List[Set[String]]=List(set1,set2)
  println(set3)
  println("Step2: Flatten the Lists of 2 Sets using flatmap")
  println(set3.flatMap(Set => Set))
}
