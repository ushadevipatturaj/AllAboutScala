package com.allaboutscala.chapter.two.tutorial_8

object WhileandDoWhileLoops extends App {
  var donutstobebaked=6

  println("Testing While Loop")
  while(donutstobebaked>0){
    println(s"Donuts to be baked: $donutstobebaked")
    donutstobebaked-=1
  }

  println("Testing Do-While Loop")
  var completedbaking=1
  do{
    println(s"We have completed backing donuts: $completedbaking")
    completedbaking+=1
  }while(completedbaking<10)
}
