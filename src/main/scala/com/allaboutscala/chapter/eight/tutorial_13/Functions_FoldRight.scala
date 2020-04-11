package com.allaboutscala.chapter.eight.tutorial_13

object Functions_FoldRight extends App {
  println("Step1: Creating 2 Sets")
  val set1:Set[Double]=Set(1.00,2.75,1.25)
  val set2:Set[(String,Double)]=Set(("Plain Donut",5.00),("Glazed Donut",2.75))
  println("Step2: Applying foldRight directly ")
  println(set1.foldRight(0.0)(_+_))
  println("Step3: Applying FoldRight using value Function")
  val valueFunction:(Double,Double)=>Double= (starter,setValue) => (starter+setValue)
  println(set1.foldRight(0.0)(valueFunction))
  //println(set2.foldRight(0.0){case (accumulator,setValue) => (accumulator+ setValue._2)})
}
