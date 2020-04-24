package com.allaboutscala.Exercises_Numbers

object Problem_4 extends App {
  val numSet1:Set[Int]=Set( 1, 3, 5, 10, 20)
  val numSet2:Set[Int]=Set(20, 17, 18, 99, 0)
  println(s"Number literals in set one but not in set two = ${numSet1 diff numSet2}")
  println(s"Number literals in set two but not in set one = ${numSet2 diff numSet1}")

}
