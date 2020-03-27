package com.allaboutscala.chapter.six.tutorial_7

import scala.collection.immutable.Queue

object ImmutableQueue extends App {
  println("Step1: Create Immutable Queue")
  val queue1:Queue[String]=Queue("Plain Donut","Glazed Donut","Strawberry Donut")
  println(s"Element at index 0 ${queue1(0)}")
  println(s"Element at index 1 ${queue1(1)}")
  println(s"Element at index 2 ${queue1(2)}")

  println("Step2: Create Queue using :+ and ++")
  val queue2:Queue[String]=queue1:+("Coconut Donut")
  val queue3:Queue[String]=queue1++Queue("Krispy Kreme Donut","Plain Donut")
  println(queue2 +"\n"+queue3)

  println("Step3: Enqueue a Queue")
  val queue4:Queue[String]=queue1.enqueue("Vanilla Donut")
  println(s"Queue after Enqueue :$queue4")

  println("Step4: Dequeue a Queue")
  val queue5=queue3.dequeue
  println("Dequeue results a tuple with first element and a queue: \nFirst Element: "+queue5._1)
  println("The remaining Queue: "+queue5._2)

  println("Step5: Create Empty Queue")
  val queue6=Queue.empty
  println(s"Empty Queue is $queue6")

}
