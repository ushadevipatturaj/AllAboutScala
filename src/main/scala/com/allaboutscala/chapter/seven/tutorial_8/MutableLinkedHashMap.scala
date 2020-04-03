package com.allaboutscala.chapter.seven.tutorial_8

import scala.collection.mutable.LinkedHashMap

object MutableLinkedHashMap extends App {
  println("Step1: Create/Initialize a LinkedHashMap using Tuples")
  val linkedHashMap1:LinkedHashMap[String,String]=LinkedHashMap(("GD","Glazed Donut"),("VD","Vanilla Donut"),("PD","Plain Donut"))
  println(linkedHashMap1)
  println("Step2: Create/Initialize LinkedHashMap using ->")
  val linkedHashMap2:LinkedHashMap[String,String]=LinkedHashMap(("GD"->"Glazed Donut"),("VD"->"Vanilla Donut"),("PD"->"Plain Donut"))
  println(linkedHashMap2)

  println("Step3: Printing the Elements using Keys")
  println(s"Element of key VD is ${linkedHashMap1("PD")}")

  println("Step4: Modifying linked HashMap using +, ++ and -")
  linkedHashMap1+=("CD"->"Coconut Donut")
  println(s"Linked HashMap after applying + $linkedHashMap1")
  linkedHashMap1++=LinkedHashMap("KD"->"Krispy Kreme Donut")
  println(s"Linked HashMap after applying ++ $linkedHashMap1")
  linkedHashMap1-="PD"
  println(s"Linked HashMap after applying + $linkedHashMap1")

  println("Step5: Creating an empty Linked HashMap")
  val linkedHashMap3=LinkedHashMap.empty
  println(linkedHashMap3)
}
