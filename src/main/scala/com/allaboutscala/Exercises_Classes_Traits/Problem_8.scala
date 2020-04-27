package com.allaboutscala.Exercises_Classes_Traits

object Problem_8 extends App {
  abstract class Student(Name:String,Age:Int){
    def printName()
  }
  class PrimaryClass(Name:String,Age:Int) extends Student(Name,Age){
    override def printName(): Unit = println(s"name = $Name, age=$Age")
  }
  class SecondaryClass(Name:String,Age:Int) extends Student(Name,Age){
    override def printName(): Unit = println(s"name = $Name, age=$Age")
  }
  object PrimaryClass{
    def apply(Name: String, Age: Int): PrimaryClass = new PrimaryClass(Name, Age)
  }
  object SecondaryClass{
    def apply(Name: String, Age: Int): PrimaryClass = new PrimaryClass(Name, Age)
  }
  val obj1=new PrimaryClass("Jill",10)
  val obj2=new PrimaryClass("John",8)
  val obj3=new PrimaryClass("Jack",11)
  val obj4=new SecondaryClass("James",13)
  val obj5=new SecondaryClass("Joe",14)
  val objList=List(obj1,obj2,obj3,obj4,obj5)
  objList.foreach(student => student.printName())

}
