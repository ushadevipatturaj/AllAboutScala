package com.allaboutscala.chapter.six.tutorial_6

import scala.collection.immutable.TreeMap

object ImmutableTreeMap extends App{
  println("Step1: Create/Initialize Tree Map using Tuples")
  val treemap1:TreeMap[String,String]=TreeMap(("PD","Plain Donut"),("SD","Strawberry Donut"),("GD","Glazed Donut"))
  println("Printing the Keys, Values Pair")
  println(s"Keys are ${treemap1.keys}")
  println(s"Values are ${treemap1.values}")

  println("To check whether the Key available in the TreeMap")
  println(s"Element for Key PD is : ${treemap1{"PD"}}")
  println(s"Element for Key SD is : ${treemap1{"SD"}}")

  println("Step2: Create/Initialize TreeMap using ->")
  val treemap2:TreeMap[String,String]=TreeMap(("PD"->"Plain Donut"),("VD"->"Vanilla Donut"),("CD","Coconut Donut"))

  println("Step3: Create TreeMaps using + and ++")
  val treemap3:TreeMap[String,String]=treemap1+("KD"->"Krispy Kreme Donut")
  val treemap4:TreeMap[String,String]=treemap1++treemap2
  println(treemap3)
  println(treemap4)

  println("Step4: Create TreeMap using -")
  val treemap5:TreeMap[String,String]=treemap3-"PD"
  println(treemap5)

  println("Make the Treemap Descending")
  object TreemapOrder extends Ordering[String]{
  def compare(Key1:String,Key2:String) =     Key2.compareTo(Key1)
  }

  val treemap6:TreeMap[String,String]=TreeMap(("PD"->"Plain Donut"),("VD"->"Vanilla Donut"),("CD","Coconut Donut"))(TreemapOrder)
  println(treemap6)

  println("Step7: Create Empty TreeMap ")
  val treemap7:TreeMap[String,String]=TreeMap.empty
  println(s"Empty Tree Map is $treemap7")
}
