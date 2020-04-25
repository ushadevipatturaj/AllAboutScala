package com.allaboutscala.Exercises_Classes_Traits

object Problem_3 extends App {
  def printNum(num:Int)={
    println(s"$num as String literal = ${num.toString}")
  }
  def printNumFormatted(num:Int*)={
    val stringLiteral=num.mkString("::")
    println(s"$num as String Literals= $stringLiteral")
  }
  printNum(10)
  printNumFormatted(10,11,12)
}
