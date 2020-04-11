package com.allaboutscala.chapter.eight.tutorial_11

object Functions_Fold extends App {
  val set1:Set[Double]=Set(1.00,2.75,1.25)
  val set2:Set[(String,Double)]=Set(("Plain Donut",5.00),("Glazed Donut",2.75))
  println("Step2: Applying fold function directly")
  println(set1.fold(0.0)(_+_))
  println("Step3: Applying Fold function directly with implicit function")
  println(set1.fold(0.00)((starter,setvalue) => starter+setvalue))
  println("Step3: Applying Fold function with Value function")
  val foldResult: (Double,Double)=>(Double)=(starter,setValue)=> starter+setValue
  println(set1.fold(0.00)(foldResult))

  println("Step3: Applying Fold function for the subSet of the Set")
  val result=set2.fold(0.0){case (starter:Double,setValue:(String,Double))=> (foldResult(starter,setValue._2))}
  println(result)
}
