package com.allaboutscala.chapter.six.tutorial_1

object ImmutableLists extends App {
println("Step1: Creating a list list1")
  val list1:List[String] = List("Glazed Donut","Plain Donut","Coconut Donut")
  println("Printing List1")
  println(s"List1 values are $list1")
  println("Printing each elements of the list1")
  list1.foreach(println(_))

  println("Step2: Creating new Lists by concatenating the list1 with some string value")
  val list2:List[String] = list1:+"Vanilla Donut"
  val list3:List[String]="Strawberry Donut"+:list1
  println("Printing the concatenated Lists")
  println(s"List2 values are $list2")
  println(s"List3 values are $list3")

  println("Step3: Creating lists by copying the 2 lists")
  val list4:List[Any]=list2::list3
  val list5:List[Any]=list2:::list3
  println(s"List4 values are $list4")
  println(s"List5 values are $list5")

  println("Step4: Creating an empty list")
  val list6 = List.empty
  println(s"Empty list is $list6")
}
