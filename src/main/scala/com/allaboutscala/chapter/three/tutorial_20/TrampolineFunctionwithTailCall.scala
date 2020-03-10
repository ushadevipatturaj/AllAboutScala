package com.allaboutscala.chapter.three.tutorial_20

import scala.util.control.TailCalls._

object TrampolineFunctionwithTailCall extends App {
println("creating Trampoline function and scala.util.control.Tailcall")

  def notsweetdonut(donutlist: List[String]):TailRec[Boolean] ={
    println(s"Donutlist is $donutlist")
    if (donutlist.isEmpty) {
      println("The donutlist is empty")
      done(false)
    }else{
      println(s"Nosweetdonut function : ${donutlist.head} is not very tasty donut , calling sweet donut function")
      tailcall(sweetdonut(donutlist.tail))
    }
  }

  def sweetdonut(donutlist :List[String]):TailRec[Boolean]={
    println(s"Donutlist is $donutlist")
    if (donutlist.isEmpty){
      println("The donut list is empty")
      done(false)
    }else if (Set(donutlist.head).subsetOf(Set("Strawberry Donut","Glazed Donut"))){
println(s"sweetdonut function : ${donutlist.head} is a very tasty donut")
      done(true)
    }else{
      println(s"Sweet donut function : ${donutlist.head} is not a sweet donut, calling notsweetdonut function ")
      tailcall(notsweetdonut(donutlist))
    }
  }

  println("Calling Trampoline functions with tailcall")
  val listdonut =List("Plain Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")
  val sweetnotsweet=tailcall(sweetdonut(listdonut)).result
  println(s"Found very Sweet Donut ${sweetnotsweet}")
}
