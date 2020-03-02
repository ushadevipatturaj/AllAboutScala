package com.allaboutscala.chapter.two.tutorial_12

object AnyAnyvalAnyrefinScala extends App{
println("Step1:Using Any type")
val name:Any ="Glazed Donut"
  println(s"Donut name using Any type $name")
  println("Step2:Using Anyref type")
  val taste:AnyRef ="VeryTasty"
  println(s"Donut taste using AnyRef type $taste")
  println("Step3:Using AnyVal type")
  val price:AnyVal =2.50
  println(s"Donut price using AnyVal type $price")
}
