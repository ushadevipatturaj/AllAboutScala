package com.allaboutscala.chapter.ten
import com.allaboutscala.chapter.ten.tutorial_1.Functions_Test
import org.scalatest._
class Tutorial_1_DonutTest extends FlatSpec with Matchers{
  behavior of "Functions_Test"
}

class Tutorial_2_DonutTest extends FlatSpec with Matchers{
  behavior of "Functions_Test"
  "donutprice" should "match 5.00" in {
    val Functions_Test = new Functions_Test()

    Functions_Test.donutprice(2) shouldEqual(5.00)
    Functions_Test.donutprice(2)  == 5.00
    Functions_Test.donutprice(quantity =2) should not be(4.00)
    Functions_Test.donutprice(2) should not equal(4)
    Functions_Test.donutprice(2) != 4.00

  }
}

class Tutorial_3_DonutTest extends FlatSpec with Matchers{
  "Length of donutsequence" should "match 3" in {
    val donut =new Functions_Test()
    donut.donuts().length == 3
    donut.donuts().size shouldEqual( 3)
  }
}
