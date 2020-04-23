package com.allaboutscala.Exercises

object Problem_14 extends App {
  val firstList=List("pencil", "pen", "sharpener")
  val secondList=List("math book", "french book", "english book")
  val mergedList:List[List[String]]=List(firstList,secondList)
  println(mergedList)
  val flattenList=mergedList.flatten
  flattenList.foreach(str => println(s"${str} is required in the classroom."))
}
