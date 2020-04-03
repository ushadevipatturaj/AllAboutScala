package com.allaboutscala.chapter.seven.tutorial_5
import scala.collection.mutable.Map

object MutableMap extends App {
  println("Step1: Create/Initialize a Mutable Map using ->")
  val map1:Map[String,String]=Map(("GD"->"Glazed Donut"),("VD"->"Vanilla Donut"),("PD"->"Plain Donut"))
  println(s"Map1 Keys and Values are $map1")

  println("Step2: Create/Initialize a Mutable Map using tuples")
  val map2:Map[String,String]=Map(("GD","Glazed Donut"),("VD","Vanilla Donut"),("PD","Plain Donut"))
  println(s"Map2 keys and values are $map2")
  println(s"Keys are :${map1.keys}")
  println(s"Values are : ${map1.values}")
  println(s"Element for the key PD is ${map1("PD")}")
  println(s"Element for the key VD is ${map1("VD")}")

  println("Step2: Modifying the Map using +,++ and -")
  map1 +=("CD"->"Coconut Donut")
  println(map1)
  map1++=Map(("CHD"->"Chocolate Donut"),("KD"->"Krispy Kreme Donut"))
  println(map1)
  map1-="PD"
  println(map1)

  println("Step3: Creating an Empty Map")
  val map3:Map[String,String]=Map.empty
  println(map3)

}
