package com.allaboutscala.Exercises_Classes_Traits

object Problem_13 extends App {
  abstract class Student(Name:String,Age:Int){
    def studentId()
  }
  case class PrimarySchoolStudent(Name:String,Age:Int) extends Student(Name:String,Age:Int){
    override def studentId(): Unit = println(s"[${this.getClass.getSimpleName}] name: $Name - age: $Age")
  }
  case class SecondarySchoolStudent(Name:String,Age:Int) extends Student(Name:String,Age:Int){
    override def studentId(): Unit = println(s"[${this.getClass.getSimpleName}] name: $Name - age: $Age")
  }
  class School[+S<:Student](students:List[S]){
    def printStudent(): Unit ={
      students.foreach(_.studentId())
    }
  }

  val Joe=PrimarySchoolStudent("Joe",7)
  val Jack=SecondarySchoolStudent("Jack",15)
  val James=SecondarySchoolStudent("James",10)
  val John=SecondarySchoolStudent("John",11)
  val StudentList=List(Joe,Jack,James,John)
  val primarySchool=new School(StudentList)
  primarySchool.printStudent()

}
