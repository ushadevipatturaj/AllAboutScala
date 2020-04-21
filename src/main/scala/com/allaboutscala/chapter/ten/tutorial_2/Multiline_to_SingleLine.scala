package com.allaboutscala.chapter.ten.tutorial_2

object Multiline_to_SingleLine extends App {

  println("Creating implicit class to convert EOL char to\"\" ")
  implicit class StringConversion(str: String){
    def inline():String =str.replace(scala.compat.Platform.EOL," " )
      }
  val multiline="""
                  |FirstLine
                  |SecondLine
                  |ThirdLine
                  |FourthLine
                  |""".stripMargin
  println(s"Multi Line String $multiline")
  println("Converting Multiline to single line")
  println(multiline.inline())
}
