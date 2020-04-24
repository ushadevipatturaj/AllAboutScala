package com.allaboutscala.Exercises_String

object Problem_13 extends App {
  val tupleList:List[(String,String,Double)] = List(
    ("T-Shirt", "Medium", 10.99),
    ("Polo-Shirt", "Large", 4.99),
    ("Vest", "Small", 5.99),
    ("T-Shirt", "Small", 4.99),
    ("T-Shirt", "Small", 4.99)
  )
  tupleList.foreach{
    case str if str._1 =="T-Shirt" => println(s"${str._1.toUpperCase} is price at $$${str._3} for the ${str._2} size.")
    case str => println(s"${str._1.toLowerCase()} is price at $$${str._3} for the ${str._2} size.")
  }
}
