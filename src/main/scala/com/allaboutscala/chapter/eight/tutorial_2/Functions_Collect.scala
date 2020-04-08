package com.allaboutscala.chapter.eight.tutorial_2
import scala.collection.mutable.Set
object Functions_Collect extends App {
  //Collect function is using a partial function on collection elements and creates new collection which satisfies the partial function
  println("Step1:Creating an Set")
  val mixedSet1:Set[Any]=Set("Glazed Donut",2.50,4,"Vanilla Donut",'D')
  println("Step2: Getting String collection using collect function")
  val stringSet:Set[String]=mixedSet1.collect{case name:String=> name}
  println(stringSet)

  println("Step3: Getting Char collection using collect function")
  val charSet:Set[Char]=mixedSet1.collect{case x:Char => x}
  println(charSet)

  println("Step4: Getting Double collection using for each and match")
  var doubleSet:Set[Double]=Set.empty
  mixedSet1.foreach(x => x match {case x:Double => doubleSet+=x
  case _ => })
  println(doubleSet)

  println("Exercise: to find the required path using collect")
  val pathSet:Set[String] = Set("/mgmt/xyz/etc/dbe", "/mgmt/xyz/etc/ada", "/mgmt/abc/etc/dbe/common", "/mgmt/dbh/bin/abc/dbe")
  val dbeSet:Set[String] = pathSet.collect{ case path if(path.contains("dbe")) => path}
  println(dbeSet)

  val dbeLastSet:Set[String] = pathSet.collect({ case path if(path.endsWith("/dbe")) => path})
  println(dbeLastSet)

  val newpathset:Set[String] = pathSet.collect{case x if (x.split("/")(4) =="ada") => x.replace("ada","dbg")
  case path if((path.split("/"))(4)=="dbe") =>path}
  println(newpathset)

}
