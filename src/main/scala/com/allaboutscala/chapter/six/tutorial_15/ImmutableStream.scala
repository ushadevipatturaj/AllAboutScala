package com.allaboutscala.chapter.six.tutorial_15
import scala.collection.immutable.Stream.cons

object ImmutableStream extends App {
  println("Step1: Creating Stream using Stream()")
  val stream1:Stream[Int]=1 #::2 #:: 3 #:: Stream.empty
  println(stream1)
  val stream2:Stream[Int]= cons(1,cons(2,cons(3,Stream.empty)))
  println(stream2)
  //Stream is Lazy List, and will validate the elements upon its access request
  stream2.take(2).print
  println()
  stream2.take(10).print

  println("\nStep3: Creating infinite Stream using Stream cons")
  def infiniteStreamCreate(number:Int):Stream[Int]={
    cons(number,infiniteStreamCreate(number+1))}

  val stream3:Stream[Int]=infiniteStreamCreate(1)
  stream3.take(25).print

  println("\nStep4: Creating a Stream using from keyword")
  val stream4:Stream[Int]=Stream.from(1)
  stream4.take(30).print

  println("\nStep5: Creating an empty Stream")
  val stream5:Stream[Int]=Stream.empty
  println(stream5)
}
