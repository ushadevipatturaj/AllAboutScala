package com.allaboutscala.chapter.six.tutorial_14

object ImmutableStack extends App {
  println("Step1: Creating a Stack")
  println("Immutable Stack is deprecated so, we are using List to achieve Stack like behaviour")
  val stack1:List[String]=List("Vanilla Donut","Glazed Donut","Chocolate Donut")
  println(s"Stack Values are $stack1")

  println("Step2: Pushing a value to Stack")
  val stack2:List[String]="Plain Donut"::stack1
  val stack3:List[String]=stack1:::List("Plain Donut","Coconut Donut")
  println(stack2 +"\n"+ stack3)

  println("Step3: Poping a value from Stack")
  println(stack3.tail)

  println("Step4: Creating an empty Stack")
  val stack4:List[String]=List.empty
  println(stack4)
}
