package com.allaboutscala.chapter.two.tutorial_7

object RangeinScala extends App {
  val a=1 to 5
  val b= 1 until 5
  val c=1 to 10 by 2
  val d='a' to 'z'
  val e='a' to 'z' by 2
  val f=(1 to 5).toArray
  val g=(1 to 5).toList
  val h=(1 to 5).toSeq
  val i=(1 to 5).toSet

  println("Step1: Creating a numeric range from 1 to 5 inclusively")
  println(s"Range from 1 to 5: ${a.mkString(" ")}")

  println("Step2: Creating a numeric range from 1 to 5 exclusively")
  println(s"Range from 1 until 5:  ${b.mkString(" ")}")

  println("Step3: Creating a numeric range from 1 to 10 but increment by 2")
  println(s"Range from 1 to 10 increment by 2: ${c.mkString(" ")}")

  println("Step4: Creating a alphabetical range from a to z :")
  println(s"Range from a to z: ${d.mkString(" ")}")

  println("Step5: Creating a alphabetical range from a to z but in user specified increment :")
  println(s"Range from a to z with user specified increment:  ${e.mkString(" ")}")

  println("Step6: Converting the Ranges to Scala Collections")
  println("Range to Array:"+f.mkString(" "))
  println("Range to List:"+g.mkString(" "))
  println("Range to Sequence:"+h.mkString(" "))
  println("Range to Set:"+i.mkString(" "))

}
