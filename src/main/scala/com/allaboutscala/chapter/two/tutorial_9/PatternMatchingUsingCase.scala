package com.allaboutscala.chapter.two.tutorial_9

object PatternMatchingUsingCase extends App {
val donuttype="Glazed Donut"
println("Step1: Pattern Matching using case ")
  donuttype match{
    case "Glazed Donut" => println("Very Tasty")
    case "Chocolate Donut" => println("Tasty")
  }
  val donuttype2="Plain Donut"
  println("Step2&3: Pattern Matching using default case and writing to a variable")
  val tastelevel=donuttype2 match{
    case "Glazed Donut" => "Very Tasty"
    case "Chocolate Donut" => "Tasty"
    case _ => "Tasty"
  }
  println(s"Tastelevel for $donuttype2 is $tastelevel")

  println("Step4: Pattern Matching using multiple pattern match")
  val donuttype3="Strawberry Donut"
  val tastelevel2=donuttype3 match{
    case "Glazed Donut" | "Strawberry Donut" => "Very Tasty"
    case "Chocolate Donut" => "Tasty"
    case _ => "Tasty"
  }
  println(s"Tastelevel for $donuttype3 is $tastelevel2")

  println("Step5: Pattern Matching using if conditions")
  val tastelevel3=donuttype3 match{
    case x if(donuttype3.contains("Glazed") | donuttype3.contains("Strawberry")) => "Very Tasty" //x is a dummy var in order to compare the pattern
    case "Chocolate Donut" => "Tasty"
    case _ => "Tasty"
  }
  println(s"Tastelevel for $donuttype3 is $tastelevel3")

  println("Step6: Pattern Matching for scala data types")
  val donutprice: Any=2.56
  donutprice match{
    case x :Int => println("Int") //x is a dummy var in order to compare the pattern of donutprice
    case x :Short => println("Short")
    case x :Double => println("Double")
    case x :Float => println("Float")
  }

}
