package com.allaboutscala.Exercises_String
import scala.io.StdIn._
object Problem_6 extends App {
  val favouriteMovie=readLine("Enter the favourite movie: ")
  println(s"""
      |"$favouriteMovie" is awesome!
      |""".stripMargin)

}
