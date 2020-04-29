package com.allaboutscala.Exercises_Classes_Traits

object Problem_12 extends App {
  case class Car(name:String,price:Double)
    object carExtension{
    implicit def uuid(car:Car):String= s"${car.name}-${car.name.hashCode}"
  }

  import carExtension._
  val bmw3: Car =Car("bmw3",20000)
  val bmw5: Car  =Car("bmw5",50000)
  val vwpassat: Car  =Car("vw passat",10000)
  val vwgolf: Car  =Car("vw golf",12000)
  val mazda3: Car  =Car("mazda 3",15000)
  val carList: List[Car] =List(bmw3,bmw5,vwpassat,vwgolf,mazda3)
  carList.foreach(car => println(uuid(car)))


}
