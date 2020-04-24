package com.allaboutscala.Exercises_String
import scala.io.StdIn._
object Problem_3 extends App {
  val name=readLine("Enter the Name: ")
  println("Enter the Age")
  val age=readInt()
  println(Console.BOLD)
  print("Name :" )
  print(Console.RESET)
  print(Console.UNDERLINED)
  print(name)
  print(Console.RESET)
  println(Console.BOLD)
  print("Age: ")
  print(Console.RESET)
  print(Console.UNDERLINED)
  print(age)

}
