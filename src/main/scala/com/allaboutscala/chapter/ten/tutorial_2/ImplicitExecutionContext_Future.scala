package com.allaboutscala.chapter.ten.tutorial_2

import scala.concurrent.Future

object ImplicitExecutionContext_Future extends App {
  import scala.concurrent.ExecutionContext.Implicits.global

  val future: Future[Int] = Future {
    // some long running operation
    1
  }

}
