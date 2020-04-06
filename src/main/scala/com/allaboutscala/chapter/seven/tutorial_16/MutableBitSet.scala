package com.allaboutscala.chapter.seven.tutorial_16
import scala.collection.mutable.BitSet
object MutableBitSet extends App {
  println("Step1: Create / Initialize BitSet")
  val bitSet1:BitSet=BitSet(0,1,3,5,7)
  println(bitSet1.foreach(x=> println(x +" , "+x.getClass)))

  println("Step2: Modifying Bitset Using +,++ and -")
  bitSet1+=12
  println(bitSet1)
  bitSet1++=BitSet(2,6,9)
  println(bitSet1)
  bitSet1-=0
  println(bitSet1)

  println("Step3: Intersection of 2 BitSets using &")
  val bitSet2:BitSet=BitSet(0,1,3,5,7)
  println(bitSet1&bitSet2)

  println("Step4: Difference of 2 BitSets using &~")
  println(bitSet2&~bitSet1)

  println("Step5: Creating an empty BitSet")
  val bitSet3:BitSet=BitSet.empty
  println(bitSet3)
}
