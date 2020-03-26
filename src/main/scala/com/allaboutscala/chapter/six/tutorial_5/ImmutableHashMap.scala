package com.allaboutscala.chapter.six.tutorial_5

import scala.collection.immutable.HashMap

object ImmutableHashMap extends App {

  println("Step1: Create/Initialize a Hashmap using Tuples")
  val hashmap1:HashMap[String,String]=HashMap(("PD","Plain Donut"),("SD","Strawberry Donut"),("GD","Glazed Donut"))
  println(s"Printing the HashMap $hashmap1")
  println("Step2: Create/Initialize a HashMap using ->")
  val hashmap2:HashMap[String,String]=HashMap(("PD"->"Plain Donut"),("CD","Coconut Donut"),("VD","Vanilla Donut"))
  println(s"Printing the Hashmap $hashmap2")

  println("Step3: Creating new Hashmap using + and ++")
  val hashmap3=hashmap2+("KD"->"Krispy Kreme Donut")
  val hashmap4=hashmap1++hashmap2
  println(s"Hashmaps :\n$hashmap3")
  println(hashmap4)

  println("Step4: Fetching Elements based on Keys")
  println(s"Element for key KD is :${hashmap3{"KD"}}")
  println(s"Element for key PD is :${hashmap3{"PD"}}")

  println("Step5: Creating new Hashmap by using -")
  val hashmap5:HashMap[String,String]=hashmap4-"SD"
  println(hashmap5)

  println("Step6: Creating empty Hashmap")
  val hashmap6:HashMap[String,String]=HashMap.empty
  println(s"Empty Hash Map : $hashmap6")
}
