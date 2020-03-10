package com.allaboutscala.chapter.three.tutorial_18

object TailrecursionwithTailrecAnnotation extends App {

  val arraydonuts = Array("Glazed Donut","Plain Donut","Vanilla Donut","Coconut Donut")
@annotation.tailrec
  def search (donutname :String, donuts :Array[String],index:Int):Option[Boolean]={
    if (donuts.length==index) {
      Some(true)
    }
    else if (donuts(index)== donutname) {
        None
    }
    else
      search(donutname,donuts,index+1)
  }
  println("Creating a tail recursion function with @annotation.tailrec ")
  println(s"calling a tail rec function ${search("Glazed Donut", arraydonuts,0)}" )
  println(s"calling a tail rec function ${search("Chocolate Donut", arraydonuts,0)}" )
  }
