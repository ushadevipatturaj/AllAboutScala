package com.allaboutscala.chapter.two.tutorial_10

object TuplesinScala extends App {

  val donuttuple=Tuple2("Glazed Donut","Very Tatsy")
  println(s"Step1: Tuple with 2 data points $donuttuple")
  println(s"Step2: Access each elements in the tuple")
  println(s"Donut type= $donuttuple._1 and tastelevel is $donuttuple._2")
  val donuttuple3=Tuple3("Strawberry Donut","Very Tatsy",2.50)
  println(s"Step3: Tuple with 3 data points $donuttuple3")
  println("Step4: Pattern Matching with Tuple for each loop")

  val strawberry=Tuple3("Strawberry Donut","Very Tatsy",2.50)
  val plain=Tuple3("Plain Donut","Tatsy",1.50)
  val chocolate=Tuple3("Chocolate Donut","Very Tatsy",3.50)
  val glazed=Tuple3("Glazed Donut","Very Tatsy",2.50)
  val tuplelist= List(strawberry,plain,chocolate,glazed)
  val price = tuplelist.foreach { str =>
  str match {
    case x if(x._1=="Glazed Donut") => println(s"Price for ${x._1} is ${x._3}")
    case y if(y._1=="Plain Donut") => println(s"Price for ${y._1} is ${y._3}")
    case z if(z._1=="Chocolate Donut") => println(s"Price for ${z._1} is ${z._3}")
    case a if(a._1=="Strawberry Donut") => println(s"Price for ${a._1} is ${a._3}")
  }
  }

}
