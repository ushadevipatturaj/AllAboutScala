package com.allaboutscala.chapter.seven.tutorial_10

import scala.collection.mutable.PriorityQueue

object MutablePriorityQueue extends App {
  println("Step1: Creating an Donut Case class and priority order definition")
  case class Donut(donutname:String,price:Double)
  def donutpriority(d:Donut)=d.price
  println("Step2: Create/Initialize PriorityQueue")
  val priorityQueue1:PriorityQueue[Donut]=PriorityQueue(
    Donut("Glazed Donut",2.5),
    Donut("Vanilla Donut",1.75),
    Donut("Plain Donut",2.00))(Ordering.by(donutpriority))
  println(s"Elements of priorityQueue1 = $priorityQueue1")

  println("Step3: Enqueue an element ")
  priorityQueue1+=Donut("Chocolate Donut",2.75)
  println(priorityQueue1)
  priorityQueue1.enqueue(Donut("Strawberry Donut",2.25))
  println(priorityQueue1)

  println("Step4:Dequeue an element")
  priorityQueue1.dequeue()
  println(priorityQueue1)

  println("Step5: Create an empty Priority Queue")
  val priorityQueue2:PriorityQueue[String]=PriorityQueue.empty
  println(priorityQueue2)
}
