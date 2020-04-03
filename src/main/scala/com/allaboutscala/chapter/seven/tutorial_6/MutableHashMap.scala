package com.allaboutscala.chapter.seven.tutorial_6

import scala.collection.mutable.HashMap

object MutableHashMap extends App {
  println("Step1: Create/Initialize HashMap using Tuples")
  val hashMap1:HashMap[String,String]=HashMap(("GD","Glazed Donut"),("VD","Vanilla Donut"),("PD","Plain Donut"))
  println(s"HashMap1 Keys and Values are $hashMap1")

  println("Step2: Create/Initialize a Mutable HashMap using tuples")
  val hashMap2:HashMap[String,String]=HashMap(("GD"->"Glazed Donut"),("VD"->"Vanilla Donut"),("PD"->"Plain Donut"))
  println(s"HashMap2 keys and values are $hashMap2")

  println("Step3: Modify HashMap using +,++ and -")
  hashMap1+=("SD"->"Strawberry Donut")
  println(s"HashMap after + $hashMap1")
  hashMap1++=HashMap(("CD"->"Coconut Donut"),("KD"->"Krispy Kreme Donut"))
  println(s"HashMap after ++ $hashMap1")
  hashMap1-="PD"
  println(s"HashMap after - $hashMap1")

  println("Step4: Creating an Empty Hashmap")
  val hashMap3:HashMap[String,String]=HashMap.empty
  println(hashMap3)
}
