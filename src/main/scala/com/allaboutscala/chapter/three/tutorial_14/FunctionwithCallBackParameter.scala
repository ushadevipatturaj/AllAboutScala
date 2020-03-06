package com.allaboutscala.chapter.three.tutorial_14

object FunctionwithCallBackParameter extends App {
 println("Step1: Creating a function which calls a function")
  def printreport(mailreport: ()=> Unit){
  println("Printing report...In Progress")
    println("Mailing reports starts now!")
    mailreport()
  }

  println(s"Step2: calling the call back method through manual pass through")
  printreport(()=>{
    println("Mailing the reports has been completed")
  })
println("Creating a function which uses option callback")
  def printreportcallback(mailreportcallback:Option[ ()=> Unit]=None){
    println("Printing report...In Progress")
    println("Mailing reports starts now!")
    mailreportcallback.map(callback=> callback())
  }

  println(s"Step3: calling the call back function with Some value")
  printreportcallback(Some(() =>{
    println("Mailing the reports has been completed")
  })
  )
  println(s"Step4: calling the call back function with None")
  printreportcallback()
}
