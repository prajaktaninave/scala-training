import org.scalatest.funsuite.AnyFunSuite
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.ArrayBuffer

class testDemo1 extends AnyFunSuite {

  val newList = ArrayBuffer("Hi","Hello","abc")
  var c1 : exercise1 =_

  test("Test0 : Create new class") {
    println(":: Create new class ::")
    c1 = new exercise1(newList)
    println(assertResult(ArrayBuffer("Hi","Hello","abc"))(c1.q1))
    println()
  }

  test("Test1 : put in Queue") {
    println(":: put in Queue ::")
    c1.put("test1")
    println(assertResult(ArrayBuffer("Hi","Hello","abc","test1"))(c1.q1))
    println()
    c1.put("test2")
    println(assertResult(ArrayBuffer("Hi","Hello","abc","test1","test2"))(c1.q1))
    println()
  }

  test("Test2 : get from Queue") {
    println(":: get from Queue ::")
    val res1 = c1.get
    println(assertResult(ArrayBuffer("Hello","abc","test1","test2"))(c1.q1))
    println(assertResult("Hi")(res1))
    println()
    val res2 = c1.get
    println(assertResult(ArrayBuffer("abc","test1","test2"))(c1.q1))
    println(assertResult("Hello")(res2))
    println()
  }

//  test("Invoking head on an empty Set should produce NoSuchElementException") {
//    assertThrows[NoSuchElementException] {
//      Set.empty.head
//    }
//  }
}