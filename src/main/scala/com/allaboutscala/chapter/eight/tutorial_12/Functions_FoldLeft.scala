package com.allaboutscala.chapter.eight.tutorial_12

object Functions_FoldLeft extends App {
  println("Step1: Creating 2 Sets")
  val set1:Set[Double]=Set(1.00,2.75,1.25)
  val set2:Set[(String,Double)]=Set(("Plain Donut",5.00),("Glazed Donut",2.75))
  println("Step2: Applying foldleft ")
  println(set1.foldLeft(0.0)(_+_))
  println("Step3: Applying foldleft using Value function")
  val foldLeftResult:(Double,Double) => Double=(starter,SetValue)=>starter+SetValue
  println(set1.foldLeft(0.0)(foldLeftResult))
  println("Step3: Applying foldleft on Double")
  println(set2.foldLeft(0.0)((starter,setvalue) => foldLeftResult(starter,setvalue._2)))
  println("Step3: Applying foldleft on String")
  println(set2.foldLeft("")((starter,setvalue)=>(starter+setvalue._1+" X ")))
}
