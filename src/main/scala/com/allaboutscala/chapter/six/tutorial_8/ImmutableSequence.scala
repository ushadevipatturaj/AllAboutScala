package com.allaboutscala.chapter.six.tutorial_8

object ImmutableSequence extends App {
  println("Step1: Create/Initialize Sequence")
  val seq1:Seq[String]=Seq("Plain Donut","Vanilla Donut","Strawberry Donut","Coconut Donut")
  println(s"Element in index 0 ${seq1(0)}")
  println(s"Element in index 1 ${seq1(1)}")
  println(s"Element in index 2 ${seq1(2)}")
  println(s"Element in index 3 ${seq1(3)}")

  println("Step2: Creating Seq using :+ and ++")
  val seq2:Seq[String]=seq1:+"Glazed Donut"
  val seq3:Seq[String]=seq2++Seq("Plain Donut","Krispy Kreme Donut")
  println(s"$seq2 \n$seq3")

  println("Step3: Creating Empty Seq")
  val seq4:Seq[String]=Seq.empty
  println(s"Empty Seq: $seq4")
}
