package com.allaboutscala.chapter.two.tutorial_3

object EscapeCharsandMultilinePrinting extends App {

  println("Step1: Using backslash to escape quotes")
  println("{\"favoritedonut\"=Glazed Donut \"price\"=2.50 \"tastelevel\"=Very Tasty}")
  println("Step2: Using triple quotes to escape quotes")
  println("""{"favoritedonut"=Glazed Donut "price"=2.50 "tastelevel"=Very Tasty}""")

  println("Step3: creating multi line using default stripMargin")
  println(
    """
      |{
      |
      |"favoritedonut"=Glazed Donut
      |"price"=2.50
      |"tastelevel"=Very Tasty
      |
      |}""".stripMargin)

  println("Step4: creating multi line using stripMargin #")
  println(
    """
      #{
      #
      #"favoritedonut"=Glazed Donut
      #"price"=2.50
      #"tastelevel"=Very Tasty
      #
      #}""".stripMargin('#'))
}
