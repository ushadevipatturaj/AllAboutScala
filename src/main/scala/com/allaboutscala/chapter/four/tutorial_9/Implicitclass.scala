package com.allaboutscala.chapter.four.tutorial_9

import com.allaboutscala.chapter.four.tutorial_9._

object Implicitclass {

  implicit class AugmentedDonut(donut:Donut){
    def uuid():String={
      s"${donut.donutname}-${donut.productname.getOrElse(123)}"
    }
  }
}
