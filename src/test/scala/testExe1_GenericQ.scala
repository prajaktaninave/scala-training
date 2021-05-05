import org.scalatest.funsuite.AnyFunSuite

import scala.collection.mutable.ArrayBuffer

class testExe1_GenericQ extends AnyFunSuite {

  val newList1 = ArrayBuffer("Hi","Hello","abc","test1","test2")
  val newList2 = ArrayBuffer(1,2,3,4,5)
  var c1 : exercise1_GenericQ_String =_
  var c2 : exercise1_GenericQ_Int =_

  test("Test0 : Create new class") {

    println(":: Test 0.1 : Create new class with String Array ::")
    c1 = new exercise1_GenericQ_String(newList1)
    println(assertResult(ArrayBuffer("Hi","Hello","abc","test1","test2"))(c1.newQ))
    println()
    println(":: Test 0.2 : Create new class with Integer Array ::")
    c2 = new exercise1_GenericQ_Int(newList2)
    println(assertResult(ArrayBuffer("Hi","Hello","abc","test1","test2"))(c1.newQ))
    println()
  }

  test("Test1 : put in Queue") {
    println(":: Test 1.1 : put String in Queue ::")
    c1.put("newString")
    println(assertResult(ArrayBuffer("Hi","Hello","abc","test1","test2", "newString"))(c1.newQ))
    println()

    println(":: Test 1.2 : put Integer in Queue ::")
    c2.put(6)
    println(assertResult(ArrayBuffer(1,2,3,4,5,6))(c2.newQ))
    println()
  }

  test("Test2 : get from Queue") {

    println(":: Test 2.1 : get first String  from Queue ::")
    val res1 = c1.get
    println(assertResult(ArrayBuffer("Hello","abc","test1","test2", "newString"))(c1.newQ))
    println(assertResult("Hi")(res1))
    println()

    println(":: Test 2.2 : get first Integer  from Queue ::")
    val res2 = c2.get
    println(assertResult(ArrayBuffer(2,3,4,5,6))(c2.newQ))
    println(assertResult(1)(res2))
    println()
  }

//  test("Invoking head on an empty Set should produce NoSuchElementException") {
//    assertThrows[NoSuchElementException] {
//      Set.empty.head
//    }
//  }
}