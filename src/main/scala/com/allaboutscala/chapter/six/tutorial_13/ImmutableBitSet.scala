package com.allaboutscala.chapter.six.tutorial_13

import scala.collection.immutable.BitSet

object ImmutableBitSet extends App{
  println("Step1: Creating a BitSet")
  val bitset1:BitSet=BitSet(0,2,4,5)
  println(s"Elements in BitSet are: $bitset1")

  println("Step2: Checking whether the given value is available in Set")
  println(s"Is elements 0 available in the BitSet?: ${bitset1(0)}")
  println(s"Is elements 12 available in the BitSet?: ${bitset1(12)}")

  println("Step3: Creating BitSets using +, ++ and -")
  val bitset2:BitSet=bitset1+12+9+7+10+2
  val bitset3:BitSet=bitset1++BitSet(3,8,5,13,0)
  val bitset4:BitSet=bitset3-0
  println(s"Elements after applying +: $bitset2")
  println(s"Elements after applying ++: $bitset3")
  println(s"Elements after applying -: $bitset4")

  println("Step4: Intersection of 2 BitSets using &")
  println(bitset1&bitset2)
  println("Step5: Difference of 2 BitSets using &~")
  println(bitset2&~bitset4)

  println("Step6: Creating empty BitSets")
  val bitset5:BitSet=BitSet.empty
  println(s"Empty BitSet $bitset5")
}
