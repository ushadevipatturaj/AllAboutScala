package com.allaboutscala.chapter.ten.tutorial_2

import scala.io.Source

object ReadFile extends App {
  println("Reading a file")
  def readFile(file:String)={
    Source.fromInputStream(getClass.getResourceAsStream(file)).getLines().mkString("\n")
  }

  readFile("D:\\Usha_Docs\\scala_scripts\\test_txt.txt")
}
