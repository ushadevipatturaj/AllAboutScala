package com.allaboutscala.Exercises_Classes_Traits

object Problem_5 extends App{
  val nameIsJohn:PartialFunction[String,Boolean]={
    case "John" => true
  }
  val nameIsJoe:PartialFunction[String,Boolean]={
    case "Joe" => true
  }
  val nameIsJackOrJill:PartialFunction[String,Boolean]={
    case "Jack" |"Jill" =>true
  }
  val invalidName:PartialFunction[String,Boolean]={
    case _ => false
  }
  val nameValidator=nameIsJohn orElse nameIsJoe orElse nameIsJackOrJill orElse invalidName
  println(s"Name John is valid =${nameValidator("John")}")
  println(s"Name Joe is valid =${nameValidator("Joe")}")
  println(s"Name Jack is valid =${nameValidator("Jack")}")
  println(s"Name Lilly is valid =${nameValidator("Lilly")}")
}
