package com.allaboutscala.chapter.seven.tutorial_1

object MutableArray extends App{
  println("Step1: Create an Array using Array()")
  val array1:Array[String]=Array("Glazed Donut","Vanilla Donut","Plain Donut")
  println(array1.mkString(","))
  println(s"Element in Index 0: ${array1(0)}")
  println(s"Element in Index 1: ${array1(1)}")

  println("Step2: Create an array by assigning the values directly")
  val array2:Array[String]=new Array(3)
  array2(0)="Coconut Donut"
  array2(1)="Strawberry Donut"
  array2(2)="Plain Donut"
  println(array2.mkString(","))

  println("Step3: Creating an 2D array by applying the values directly")
  val array3:Array[Array[String]]=Array.ofDim(2,2) //:Array[Array[String]] is optional
  array3(0)(0)="Plain Donut"
  array3(0)(1)="Vanilla Donut"
  array3(1)(0)="Chocolate Donut"
  array3(1)(1)="Glazed Donut"
  for {x <- 0 until 2
       y<-0 until 2}
      println(s"array($x)($y) is ${array3(x)(y)}")

  println("Step4: Creating an array by using Tabulate method ")
  val array4:Array[Int]=Array.tabulate(5)(_+1) //creates array from 1 -> 5 denotes 5 values in array
  val array5:Array[Int]=Array.tabulate(5)(_+2) //creates array from 2
  val array6:Array[Int]=Array.tabulate(5)(_*2) //creates array by multiplies of 2
  println(array4.mkString(",") +"\n"+ array5.mkString(",") +"\n"+array6.mkString(","))

  println("Step5: Creating 2D array using tabulate method")
  val row2=2
  val col2=2
  val array7=Array.tabulate(row2,col2)((row2,col2) => row2 + col2)
  for{x<- 0 until row2
      y<-0 until col2}
    println(s"array($x)($y) is ${array7(x)(y)}")

  println("Step6: Creating an 3D array using tabulate method")
  val col3=3
  val row3=3
  val array8=Array.tabulate(row3,col3)((row3,col3)=> row3+col3)
  for{x<- 0 until row3
      y<-0 until col3}
    println(s"array($x)($y) is ${array8(x)(y)}")

  println("Step7: Creating Array using Range")
  val array9:Array[Int]=(1 to 10).toArray
  println(array9.mkString(","))

  println("Step8:Copying an Array ")
  val array10:Array[Int]=new Array[Int](10)
  Array.copy(array9,0,array10,0,10) //copy(srcArray,srcStartPos,destArray,destStartPos,len)
  println(array10.mkString(","))

  println("Step9: Cloning an array")
  val array11:Array[Int]=array10.clone()
  println(array11.mkString(","))
  array11(0)=11
  println(array11.mkString(","))

  println("Step10: Concatenating 2 Arrays")
  val array12=array11.concat(Array(12))
  println(array12.mkString(","))

  println("Step11: Checking whether 2 Arrays are same")
  val array13:Array[String]=Array("Glazed Donut","Plain Donut","Vanilla Donut")
  val array14:Array[String]=Array("Glazed Donut","Plain Donut","Vanilla Donut")
  println(s"Array1: ${array1.mkString(",")}")
  println(s"Array2 is ${array13.mkString(",")}")
  println(s"Comparing using == ${array1==array13}")
  println(s"Comparing using == ${array13==array14}")
  println(s"Comparing two Arrays using SameElements ${array13 sameElements(array14)}")

  }

