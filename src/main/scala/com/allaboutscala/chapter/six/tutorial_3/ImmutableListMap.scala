package com.allaboutscala.chapter.six.tutorial_3

import scala.collection.immutable.ListMap

object ImmutableListMap extends App {

  println("Step1: Create/Initialise ListMap")
  val listmap1:ListMap[String,String] = ListMap("PD"-> "Plain Donut", "CD"->"Coconut Donut", "SD"->"Strawberry Donut")
  println(s"Printing the ListMap Keys ${listmap1.keys}")
  println(s"Printing the ListMap values ${listmap1.values}")
  println(s"Printing the ListMap key->Values $listmap1")

  println("Step2: Creating ListMap using + and ++ ")
  val listmap2:ListMap[String,String]=listmap1+("VD" -> "Vanilla Donut" )
  val listmap3:ListMap[String,String]=listmap1++listmap2
  println(s"ListMap after applying +  $listmap2 ")
  println(s"ListMap after applying ++ $listmap3 ")

  println("Step3: Creating ListMap using -")
  val listmap4:ListMap[String,String]=listmap3-"CD"
  println(s"List Map after minusing the value $listmap4")

  println("Step4: Creating empty ListMap")
  val listmap5=ListMap.empty
  println(s"Empty ListMap $listmap5")
}
