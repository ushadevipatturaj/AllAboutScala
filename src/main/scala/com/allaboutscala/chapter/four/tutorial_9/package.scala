package com.allaboutscala.chapter.four

package object tutorial_9 {

  case class Donut(donutname :String,price:Double,productname:Option[Int]=None){
    def print: Unit ={
      println(s"Donut name = $donutname , price = $price and product code =${productname.getOrElse(0)}")
    }
  }
type datetime = org.joda.time.DateTime
}
