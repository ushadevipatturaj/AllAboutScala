package com.allaboutscala.chapter.one.tutorial_4

object HelloWorldWithArgumentsDebug extends App {

  println("Hello World Program with Run time Arguments!")
  println("The command line arguments are :")
  println(args.mkString(", "))
}