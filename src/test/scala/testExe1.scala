import org.scalatest.funsuite.AnyFunSuite
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.ArrayBuffer

class testExe1 extends AnyFunSuite {

  val newList = ArrayBuffer("Hi","Hello","abc","test1","test2")
  var c1 : exercise1 =_

  test("Test0 : Create new class") {
    println(":: Create new class ::")
    c1 = new exercise1(newList)
    println(assertResult(ArrayBuffer("Hi","Hello","abc","test1","test2"))(c1.q1))
    println()
  }

  test("Test1 : put in Queue") {
    println(":: put in Queue ::")
    c1.put("newString")
    println(assertResult(ArrayBuffer("Hi","Hello","abc","test1","test2", "newString"))(c1.q1))
    println()
  }

  test("Test2 : get from Queue") {
    println(":: get from Queue ::")
    val res = c1.get
    println(assertResult(ArrayBuffer("Hello","abc","test1","test2", "newString"))(c1.q1))
    println(assertResult("Hi")(res))
    println()
  }

//  test("Invoking head on an empty Set should produce NoSuchElementException") {
//    assertThrows[NoSuchElementException] {
//      Set.empty.head
//    }
//  }
}