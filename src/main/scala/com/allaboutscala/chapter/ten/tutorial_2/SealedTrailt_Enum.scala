package com.allaboutscala.chapter.ten.tutorial_2

object SealedTrailt_Enum extends App {
  println("Creating Sealed Trait Enum of Donut")
  sealed trait Donut
  case object Plain extends Donut
  case object Vanilla extends Donut
  case object Glazed extends Donut

  def isValidDonut(donut: Donut) = {
    donut match {
      case Plain | Vanilla | Glazed => println("Valid donut")
      case _ => println("Unknown donut!")
    }
  }

}