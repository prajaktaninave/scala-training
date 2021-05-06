import org.scalatest.funsuite.AnyFunSuite
import scala.collection.immutable.Seq
import org.scalatest._
import matchers.should._

class testExe1_immutableQ extends AnyFunSuite with Matchers {

  val newList1 = Seq("Hi","Hello","abc")
  val newList2 = Seq(1,2,3)

  test("Create new MyQ class for String") {
    println(":: Test 1.1 : Create new Q class with String elements ::")
    val Q : MyQ[String] = new MyQ[String](newList1)
    Q.showQElements
    Q.toSeqence shouldEqual newList1

    println(":: Test 1.2 : put String in Queue ::")

    val newQ1 : MyQ[String]  = Q.put("test1")
    newQ1.showQElements
    newQ1.toSeqence shouldEqual newList1 :+ "test1"

    val newQ2 : MyQ[String] = newQ1.put("test2")
    newQ2.showQElements
    newQ2.toSeqence shouldEqual newList1 :+ "test1" :+ "test2"

    println(":: Test 1.3 : get first Element  from Queue ::")
    val (dropEle, newQ3: MyQ[String]) = newQ2.get
    println("Dropped element : "+dropEle)
    newQ3.showQElements
    dropEle shouldEqual(newList1(0))

  }

  test("Create new MyQ class for Integer") {

    println(":: Test 2.1 : Create new Q class with Int elements ::")
    val Q : MyQ[Int] = new MyQ[Int](newList2)
    Q.showQElements
    Q.toSeqence shouldEqual newList2

    println(":: Test 2.2 : put String in Queue ::")

    val newQ1 : MyQ[Int]  = Q.put(4)
    newQ1.showQElements
    newQ1.toSeqence shouldEqual newList2 :+ 4

    val newQ2 : MyQ[Int] = newQ1.put(5)
    newQ2.showQElements
    newQ2.toSeqence shouldEqual newList2 :+ 4 :+ 5

    println(":: Test 2.3 : get first Element  from Queue ::")
    val (dropEle, newQ3: MyQ[Int]) = newQ2.get
    println("Dropped element : "+dropEle)
    newQ3.showQElements
    dropEle shouldEqual(newList2(0))

  }
}