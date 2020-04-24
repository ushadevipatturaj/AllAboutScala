package com.allaboutscala.Exercises_String

object Problem_8 extends App {
  val str="Vanilla Donut 10 2.25"
  val splitString=str.split(" ")
  println(
    s"""
       |Donut Name: ${splitString(0)} ${splitString(1)}
       |Quantity : ${splitString(2).toInt}
       |Price : ${splitString(3).toDouble}
       |""".stripMargin)

}
