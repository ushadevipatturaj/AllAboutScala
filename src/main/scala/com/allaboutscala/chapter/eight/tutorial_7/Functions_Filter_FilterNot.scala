package com.allaboutscala.chapter.eight.tutorial_7

object Functions_Filter_FilterNot extends App {
  println("Step1: Create a List")
  val list1:List[String]=List("Plain Donut","Vanilla Donut","Glazed Donut","Strawberry Donut")
  println("Step2: Applying Filter and FilterNot directly and Value Function")
  val filterVal=list1.filter{ donutname => donutname.contains("Vanilla") || donutname.contains("Plain")}
  println(s"Filter Plain and Vanilla Donut $filterVal")
  println(s"Filter Plain and Vanilla Donut ${list1.filter{ donutname => donutname.contains("Vanilla") || donutname.contains("Plain")}}")
  val filterNotValue=list1.filterNot(donutname => donutname=="Vanilla Donut")
  println(s"FilterNot Vanilla Donut $filterNotValue")

  println("Step3: Applying Filter and FilterNot using function")
  def filterList(donut:String):Boolean=donut.contains("Plain") || donut.contains("Vanilla")
  println(s"Filter Plain and Vanilla Donut ${list1.filter(filterList(_))}")
  println(s"FilterNot Plain and Vanilla Donut ${list1.filterNot(filterList(_))}")
}
