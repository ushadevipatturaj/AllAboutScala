package com.allaboutscala.chapter.three.tutorial_19

import scala.util.control.TailCalls._

object TailRecursionswithTailCalls extends App {
val arraydonuts = Array("Glazed Donut","Plain Donut","Vanilla Donut","Coconut Donut")

  def search(donutname :String, donuts :Array[String],index:Int):TailRec[Option[Boolean]]={
    if (donuts.length==index){
      done(None)
    }else if (donuts(index)==donutname){
      done(Some(true))
    }else {
      val nextIndex =index+1
      tailcall(search(donutname, donuts, nextIndex))
    }
  }
  println("Creating a tail recursion function with @annotation.tailrec ")
  val found= tailcall(search("Glazed Donut", arraydonuts,0)) //the values returned are wrapped as Tailrec Object
  val notfound= tailcall(search("Chocolate Donut", arraydonuts,0))
  println(s"calling a tail rec function ${found.result}" ) //the tailrec object results can be read with result keyword
  println(s"calling a tail rec function ${notfound.result}" )
}
