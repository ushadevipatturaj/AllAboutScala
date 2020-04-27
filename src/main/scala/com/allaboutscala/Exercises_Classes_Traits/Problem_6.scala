package com.allaboutscala.Exercises_Classes_Traits

object Problem_6 extends App {
  def toUpper(name:String):String={
    name.toUpperCase()
  }
  def toLower(name:String):String={
    name.toLowerCase()
  }
  def formatNames(name:String)(func:String=>String):String={
    func(name)
  }
  println(formatNames("Bob")(toUpper(_)))
  println(formatNames("Joe")(toLower(_)))
  println(formatNames("Jack")(toUpper(_)))
}
