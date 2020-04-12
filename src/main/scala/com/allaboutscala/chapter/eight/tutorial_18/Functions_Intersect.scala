package com.allaboutscala.chapter.eight.tutorial_18

object Functions_Intersect extends App {
  println("Step1: Creating 2 Sets")
  val set1:Set[String]=Set("Plain Donut","Strawberry Donut","Chocolate Donut","Coconut Donut","Caramel Donut","Glazed Donut")
  val set2:Set[String]=Set("Plain Donut","Strawberry Donut","Chocolate Donut")
  println("Step2: Applying Intersect on Sets")
  println(s"Common elements in Set1 and Set2 ${set1 intersect( set2)}")
  println(s"Common elements in Set2 and Set1 ${set2 intersect(set1)}")

  println("Step3: Applying intersect using &")
  println(s"Common elements in set1 and set2 ${set1 & set2}")
  println(s"Common elements in set2 and Set1 using & ${set2 & set1}")
}
