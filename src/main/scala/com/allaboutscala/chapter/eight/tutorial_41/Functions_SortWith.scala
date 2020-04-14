package com.allaboutscala.chapter.eight.tutorial_41

object Functions_SortWith extends App {
  println("Step1: Creating a List")
  val list1: List[Double]=List(3.00,2.50,0.01,1.25,7.77)
  println(list1)
  println("Step2: Applying SortWith on Double List")
  println(list1.sortWith( (a,b) => (a < b) ))
  case class Donut(name:String,price:Double)
  val list2: List[Donut]=List(Donut("Plain Donut",2.50),Donut("Chocolate Donut",3.25),Donut("Glazed Donut",1.75))
  println("Step3: Applying SortWith on Donut Lists")
  println(list2.sortWith(_.price < _.price))
  println("Step3: Ordering Ascending SortWith on Donut Lists")
  println(list2.sortWith((a,b) => (a.price < b.price)))
  println("Step4: Ordering Descending SortWith on Donut Lists")
  println(list2.sortWith((a,b) => (a.price > b.price)))
}
