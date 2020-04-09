package com.allaboutscala.chapter.eight.tutorial_5

object Functions_DropWhile extends App {
  println("Step1: Creating a List")
  val list1:List[String]=List("Plain Donut 1","Plain Donut 2","Glazed Donut", "Plain Donut 3","Strawberry Donut")
  println("Step2: Applying Dropwhile function ")
  println(s"Drop while function on the list is ${list1.dropWhile(_.charAt(0)=='P')}")
  // once the 3rd element is encountered the function return false , the evaluation stops and gives result
  println("Step3: Applying drop while using value function method")
  val donutDrop:(String)=>Boolean =(donutname)=>(donutname.charAt(0)=='P')
  println("tip: value function has to accessed from dropWhile and not directly")
  println(donutDrop)
  println(list1.dropWhile(donutDrop))
}
