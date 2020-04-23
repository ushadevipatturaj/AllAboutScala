package com.allaboutscala.Exercises

import scala.collection.immutable.TreeMap

object Problem_9 extends App {

  object nameOrdering extends Ordering[String]{
    def compare(x: String, y: String): Int =y.compareTo(x)
  }
  val nameAgeMap=TreeMap(("Bill" ->9 ), ("Jonny"-> 8),("Tommy"->11),("Cindy"->13))(nameOrdering)
  println(nameAgeMap.mkString(","))
}
