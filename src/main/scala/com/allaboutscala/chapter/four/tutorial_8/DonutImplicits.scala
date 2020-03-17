package com.allaboutscala.chapter.four.tutorial_8
import com.allaboutscala.chapter.four.tutorial_8.ImplicitClasses.Donut

object DonutImplicits {
implicit class AugmentedDonut(donut:Donut){
def uuid():String={
  s"${donut.donutname}-${donut.productcode.getOrElse(123)}"
}
}
}
