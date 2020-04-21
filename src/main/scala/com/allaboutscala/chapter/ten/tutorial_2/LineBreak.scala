package com.allaboutscala.chapter.ten.tutorial_2

object LineBreak extends App {
  println("Adding Line Break using linebreak")
  val lineBreak = scala.compat.Platform.EOL
  println(s"First line${lineBreak}Second line")
}
