package com.allaboutscala.chapter.eight.tutorial_51

object Functions_WithFilter extends App {
  println("Step1: Creating a List")
  val list1: List[String]=List("Plain Donut","Chocolate Donut","Glazed Donut")
  println(list1.withFilter(_.charAt(0)=='P').foreach(println(_)))
  println(list1.filter(_.charAt(0)=='P').foreach(println(_)))
  //withFilter allows to apply map,foreach ,.etc function upon the filtered list, not creating new list
  //you can lazily apply withFilter to an infinite stream/iterable
  //you can lazily apply another withFilter (and again and again)
  val list2=list1.filter(_.charAt(0)=='P').map(_+" X")
  list1.withFilter(_.charAt(0)=='P').map(_+" X")
  println(list2)
  println(list1)
}
