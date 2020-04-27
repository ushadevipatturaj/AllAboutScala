package com.allaboutscala.Exercises_Classes_Traits

import java.lang.annotation.Annotation

object Problem_7 extends App {
  case class Student(Name:String,Age:Int)
  val John=Student("John",7)
  val Jack=Student("Jack",13)
  val Joe=Student("Joe",15)
  val Jill=Student("Jill",15)
  val James=Student("James",11)

  val students=Vector(John,Jack,Joe,Jill,James)
  @annotation.tailrec
  def validateAge(student: Student,students:Vector[Student],index:Int):Boolean={
    if (students.size==index) false
    else if (students(index).Age==student.Age) true
    else validateAge(student,students,index+1)
  }
  val result=validateAge(Student("",15),students,0)
  println("Is there a student who is 15 years old ="+result)

}
