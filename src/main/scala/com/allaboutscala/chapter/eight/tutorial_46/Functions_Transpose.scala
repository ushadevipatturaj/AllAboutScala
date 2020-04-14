package com.allaboutscala.chapter.eight.tutorial_46

object Functions_Transpose extends App {
  println("Step1: Creating a List")
  val list1: List[String]=List("Plain Donut","Chocolate Donut","Plain Donut","Caramel Donut","Glazed Donut")
  println(list1)
  val list2: List[Double]=List(3.00,2.50,0.01,1.25,7.77)
  println(s"List1 mad 2 are $list1 $list2")
  println("Step2: Applying Transpose to two list")
  val twoList:List[List[Any]]=List(list1,list2)
  println(twoList)
  println(twoList.transpose)
  val arrayNew:Array[Array[Int]]=Array.ofDim(2,2)
  arrayNew(0)(0)=1
  arrayNew(0)(1)=2
  arrayNew(1)(0)=3
  arrayNew(1)(1)=4
  for{x <- 0 to 1
      y <- 0 to 1}{
    print(arrayNew(x)(y) +"\t")
  }
  println()
  val arrayTranspose=arrayNew.transpose
  for{x <- 0 to 1
      y <- 0 to 1}{
    print(arrayTranspose(x)(y) +"\t")
  }
}
