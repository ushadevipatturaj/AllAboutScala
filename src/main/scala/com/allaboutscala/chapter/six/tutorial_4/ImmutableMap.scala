package com.allaboutscala.chapter.six.tutorial_4

object ImmutableMap extends App {

  println("Step1: Creating/Initializing Map")
  val map1:Map[String,String] =Map(("PD"->"Plain Donut"),("SD"->"Strawberry Donut"),
                                  ("CD","Coconut Donut"),("GD"->"Glazed Donut"))
  println("Printing Map Keys and Values:")
  println(s"Keys : ${map1.keys} Values : ${map1.values}")
  println(s"Map Key Value pair : $map1")

  println("Step2: Creating Map with + +++ and -")
  val map2:Map[String,String] =map1+("VD"->"Vanilla Donut")
  val map3:Map[String,String]=map1++map2
  val map4:Map[String,String]=map3-"PD"
  println(map2)
  println(map3)
  println(map4)

  println("Step3: Creating empty Map")
  val map5:Map[Any,Any]=Map.empty
  println(s"Empty Map $map5")
}
