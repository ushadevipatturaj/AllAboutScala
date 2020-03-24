package com.allaboutscala.chapter.five.tutorial_9
import scala.language.existentials._ //Importing scala package to support magnet pattern for method overloading
object MagnetPatternforMethodOverloading extends App {
println("Creating a Magnet trait to enable method overloading")
  sealed trait DiscountMagnet{
    type Out

    def apply():Out
  }
  println("Creating Magnet pattern implementation")
  def discount(magnet: DiscountMagnet):magnet.Out=magnet()
  println("Creating companion Object for the magnet trait with the method overloading implementation")
  object DiscountMagnet{
    implicit def discountpricewithString(couponcode:String)
    = new DiscountMagnet{
      override type Out=Unit
      override def apply():Out={
        println(s"Discounted price for coupon $couponcode is 10%")
      }
    }
    implicit def discountpricewithInt(couponcode:Int)=
      new DiscountMagnet {
        override type Out = Double
        override def apply(): Out = {
          println(s"Discount Percentage is $couponcode %")
          10.25
        }
      }
    implicit def discountMagnetwithListofString(discountlist: List[String])=
      new DiscountMagnet {
        override type Out = List[String]

        override def apply(): Out = {
          discountlist.foreach(println(_))
          discountlist
        }
      }
    implicit def discountMagnetwithListofInt(couponlist:List[Int])=
          new DiscountMagnet {
            override type Out = Int

            override def apply(): Out ={
              couponlist.sum
            }
          }

  }

  println("calling the overloaded methods") //We need to call the magnet implementation and not the actual overload code
  discount("COUPON1234")
  discount(23)
  discount(List("Vanilla Donut","Plain Donut","Glazed Donut","Coconut Donut"))
  println(s"${discount(List(2,3,4))}")

}
