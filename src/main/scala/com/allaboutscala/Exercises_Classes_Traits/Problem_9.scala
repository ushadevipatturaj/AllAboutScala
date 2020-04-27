package com.allaboutscala.Exercises_Classes_Traits

object Problem_9 extends App {
  case class Student(Name:String,Age:Int,favouriteSnack:Option[String])

  val Jack=Student("Jack",15,Some("cupcake"))
  val Jill=Student("Jill",10,Some("ice cream"))
  val Joe=Student("Joe",7,None)
  val James=Student("James",10,Some("chocolate"))
  val John=Student("John",11,None)

  val JoeUpdated=Joe.copy(favouriteSnack = Some("cup cake"))
  val listStudents=List(Jack,Jill,James,John,JoeUpdated)
  listStudents.foreach(student => println(s"name = ${student.Name} is ${student.Age} years old. Favorite snack is ${student.favouriteSnack.getOrElse("nothing!")}"))
}
