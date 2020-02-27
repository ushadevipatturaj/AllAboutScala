package com.allaboutscala.chapter.two.tutorial_4

object ScalatypesandTypeconversion extends App {

  val shortval=1
  val intval=250
  val longval=100000000L
  val floatval=2.567f
  val charval='a'
  val stringval="Test types"
  val byteval=0x1a
  val unitval= ()
  println("Type Inference")
  println(s"{${shortval.getClass()} ${intval.getClass()} ${longval.getClass()}  ${floatval.getClass()} ${charval.getClass()} ${stringval.getClass()} ${byteval.getClass()} ${unitval.getClass()}}")
  println("Type Conversion")
  val a:Short=1
  val b:Int=a
  val c:String=b.toString() //cannot type cast from Int to String directly
  println(a+" "+a.getClass()+" "+b+" "+ b.getClass()+" "+c +" "+ c.getClass())
}
