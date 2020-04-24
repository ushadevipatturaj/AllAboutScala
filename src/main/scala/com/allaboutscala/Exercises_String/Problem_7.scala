package com.allaboutscala.Exercises_String
import scala.io.StdIn._
object Problem_7 extends App {
  val name=readLine("Enter the Name: ")
  println("Enter the Age: ")
  val age=readInt()
  val movie=readLine("Enter the favourite movie: ")
  println(
    s"""
      |First Name: $name
      |Age : $age
      |Favourite Movie : $movie
      |""".stripMargin)


}
