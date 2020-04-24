package com.allaboutscala.Exercises_Numbers

object Problem_2 extends App{
  val numList=((100 until 150) by(10)).toList
  println("Elements of Vector from 100 to 150, excluding the 150 number literal =",numList)
  println(numList.foldLeft(0)(_+_))

}
