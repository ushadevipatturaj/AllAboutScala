package com.allaboutscala.chapter.seven.tutorial_7
import scala.collection.mutable.ListMap
object MutableListMap extends App {
  println("Step1: Create/Initialize Mutable LisMap using tuples")
  val listMap1:ListMap[String,String]=ListMap(("GD","Glazed Donut"),("VD","Vanilla Donut"),("PD","Plain Donut"))
  println(listMap1)
  println("Step2: Create/Initialize ListMap using ->")
  val listMap2:ListMap[String,String]=ListMap(("GD"->"Glazed Donut"),("VD"->"Vanilla Donut"),("PD"->"Plain Donut"))
  println(listMap2)

  println("Step3: Modifying the ListMap using +, ++ and -")
  listMap1+=("GD"->"Glazed Donut")
  println(s"ListMap after applying + $listMap1")
  listMap1++=ListMap("CD"->"Coconut Donut")
  println(s"ListMap after applying ++ $listMap1")
  listMap1-="PD"
  println(s"ListMap after applying - $listMap1")

  println("Step4: Fetching Elements using Keys")
  println(s"Element of the key VD is ${listMap1("VD")}")
  println(s"Element of the key GD is ${listMap1("GD")}")

  println("Step5: Creating an empty ListMap")
  val listMap3:ListMap[String,String]=ListMap.empty
  println(listMap3)
}
