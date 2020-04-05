package com.allaboutscala.chapter.seven.tutorial_9
import scala.collection.mutable.Queue
object MutableQueue extends App {
  println("Step1: Create/Initialize a Queue")
  val queue1:Queue[String]=Queue("Glazed Donut","Vanilla Donut","Plain Donut")
  println(queue1)
  println(s"ELements at the index 0 ${queue1(0)}")
  println(s"ELements at the index 1 ${queue1(1)}")

  println("Step2: Enqueue an element to Queue")
  queue1.enqueue("Chocolate Donut")
  println(queue1)
  println("Step3:Enqueue an element using +")
  queue1+="Coconut Donut"
  println(queue1)

  println("Step4: Dequeue an element from a Queue")
  queue1.dequeue()
  println(queue1)

  println("Step5: Creating an Empty Queue")
  val queue2:Queue[String]=Queue.empty
  println(queue2)
}
