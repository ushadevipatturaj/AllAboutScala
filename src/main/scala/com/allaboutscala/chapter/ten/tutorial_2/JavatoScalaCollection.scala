package com.allaboutscala.chapter.ten.tutorial_2

import scala.collection.JavaConverters._
import java.util
import scala.collection.mutable.Map

object JavatoScalaCollection extends App {
  println("Creating a java Map")
  val javaCollection:java.util.HashMap[String,Double] =new util.HashMap[String,Double]()
  javaCollection.put("Vanilla Donut",2.50)
  javaCollection.put("Plain Donut",1.75)
  println("Converting the java collection to Scala collection using asScala")
  val scalaCollection:Map[String,Double] = javaCollection.asScala
  println(scalaCollection)
}
