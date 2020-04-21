package com.allaboutscala.chapter.ten
import com.allaboutscala.chapter.ten.tutorial_1.Functions_Test
import org.scalatest._

import scala.util.control
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

class Tutorial_3_DonutTest extends FlatSpec with Matchers {
  "Length of donutsequence" should "match 3" in {
    val donut = new Functions_Test()
    donut.donuts().length == 3
    donut.donuts().size shouldEqual (3)
  }
}

  class Tutorial_4_DonutTest extends FlatSpec with Matchers {
    "Boolean test of donutsequence" should "be valid" in {
      val donut = new Functions_Test()
      donut.donuts() contains ("plain donut")
      donut.donuts() shouldNot contain("Strawberry Donut")
      donut.donuts().contains("Strawberry Donut") == false
      donut.donuts() should not be empty
      donut.donuts().isEmpty shouldEqual true
    }
  }
    class Tutorial_5_DonutTest extends FlatSpec with Matchers{
      "Collection test" should "be valid" in {
        val donut = new Functions_Test()
        donut.donuts() contains ("plain donut")
        donut.donuts() shouldNot contain("Strawberry Donut")
        donut.donuts().contains("Strawberry Donut") == false
        donut shouldEqual  Seq("vanilla donut", "plain donut", "glazed donut")
      }
  }
class Tutorial_6_DonutTest extends FlatSpec with Matchers{
  "type test" should "be valid" in {
    val donut = new Functions_Test()
    donut shouldBe a [Functions_Test]
    donut.donutprice(5) shouldBe a [String]
    donut.donuts() shouldBe a [Seq[String]]
  }
  }

class Tutorial_7_DonutTest extends FlatSpec with Matchers{
  "Exception Test" should  "throw IllegalStateException" in {
    val donut = new Functions_Test()
    //intercede function is used to get the exception from the printname method
    intercept[java.lang.Exception] (donut.printName())
  }
  "Exception thrownby Test" should  "match IllegalStateException" in {
    val donut = new Functions_Test()
    //intercede function is used to get the exception from the printname method
    val exception = the [java.lang.IllegalStateException] thrownBy( donut.printName())

    exception.getMessage should include("Printing Error!")
    exception.getClass shouldEqual classOf[ java.lang.IllegalStateException]
  }

  "Exception message" should "match Printing Error!" in {
    val donut = new Functions_Test()
    the[java.lang.IllegalStateException] thrownBy(donut.printName()) should have message("Printing Error!")
  }
  "Only one Exception Test" should "throw a single Exception" in  {
    val donut =new Functions_Test()
    an[java.lang.IllegalStateException] should be thrownBy(donut.printName())
  }
}
