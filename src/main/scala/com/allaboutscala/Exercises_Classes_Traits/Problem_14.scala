package com.allaboutscala.Exercises_Classes_Traits

object Problem_14 extends App {
  abstract class Vehicle(val publicMake:String)

  case class Bike(override val publicMake:String) extends Vehicle(publicMake)
  case class Car(override val publicMake:String) extends Vehicle(publicMake)

  object VehicleReport{
    def printVehicle[V<:Vehicle](VehicleList:List[V]): Unit ={
      VehicleList.foreach(vehicle => println(vehicle.publicMake))
    }
  }

  val bmw3: Car =Car("bmw 3 series")
  val vwgolf: Car  =Car("vw golf")
  val bmwg310: Bike  =Bike("bmw g 310 r bike")
  val firestorm: Bike  =Bike("fire storm bike")
  val carList: List[Vehicle] =List(bmw3,vwgolf,bmwg310,firestorm)
  VehicleReport.printVehicle(carList)

}
