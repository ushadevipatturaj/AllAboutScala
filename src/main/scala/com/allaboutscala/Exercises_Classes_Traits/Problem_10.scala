package com.allaboutscala.Exercises_Classes_Traits

object Problem_10 extends App {
  case class Car(Name:String,price:Double)
  type CarStock=Tuple2[Car,Int]
  val vmPassat=Car("vw passat",10000)
  val vwGolf=Car("vw golf",12000)
  val bmw3=Car("bmw 3",20000)
  val bmw5=Car("bmw 5",50000)
  val mazda=Car("mazda",15000)

  val vmPassatstock=new CarStock(vmPassat,100)
  val vwGolfstock=new CarStock(vwGolf,50)
  val bmw3stock=new CarStock(bmw3,200)
  val bmw5stock=new CarStock(bmw5,75)
  val mazdastock=new CarStock(mazda,49)

  val carList=List(vmPassatstock,vwGolfstock,bmw3stock,bmw5stock,mazdastock)
  def orderByLowestStock(CarList: List[CarStock])={
    val sortedList=CarList.sortBy(car => car._2)
    sortedList
  }
  val sortedList=orderByLowestStock(carList)
  println("Cars sorted by lowest stock:")
  sortedList.foreach(car => println(s"a ${(car._1).Name} stock =${car._2} "))
}

