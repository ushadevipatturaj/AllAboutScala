package com.allaboutscala.chapter.two.tutorial_6

object ForloopsandMatrix extends App{
println("Step1: Printing through for loop inclusive")
  for (i <- 1 to 5)
    {
      println("Loop :"+i)
    }

  println("Step2: Printing through for loop exclusive")
  for (j <- 1 until 5)
  {
    println("Loop :"+j)
  }

  println("Step3: Printing loop with if conditions")
  val ingredient= List("Flour","Milk","Eggs","Sugar","Butter")
  for (str <- ingredient if (str=="Sugar"))
  {
    println("Sweetening ingredient is :"+str)
  }

  println("Step4: Printing loop with if conditions and using yield keyword")
 val ingredienttobuy= for {str1 <- ingredient if (str1=="Sugar" | str1=="Butter")} yield str1
    println("Ingredient to buy are :"+ingredienttobuy)

  println("Step5: Printing multi dimensional array using for loop")
  val marray= Array.ofDim[String](2,2)
  marray(0)(0)="Flour"
  marray(0)(1)="Milk"
  marray(1)(0)="Sugar"
  marray(0)(0)="Butter"
  for{val1<- 0 until 2
  val2<- 0 until 2}
  {  println("Matrix["+val1,val2+"]:"+marray(val1 )(val2))}
}
