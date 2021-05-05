import scala.collection.mutable.ListBuffer
import scala.collection.mutable.ArrayBuffer

trait Queue[A] {
  def put(x : A)
  def get : A
  def showQElements
}

class exercise1(newList: ArrayBuffer[String]) extends Queue[String] {

  var q1 = newList
  showQElements

  def put(x:String): Unit = {
    println("=> Enqueue : " +x+ " in Queue")
    q1+=x
    //or => q1.addOne(x)
    showQElements
  }
  def get: String = {
    val res = q1.remove(0)
    println("=> Dequeue : first element of Queue : "+ res)
    showQElements
    res
  }
  def showQElements: Unit = {
    println("=> showing Q elements : ")
    q1.foreach(e => print(e+" "))
    println()
  }
}

//object exercise12 {
//  var c1 = new exercise1(ListBuffer("1","2","3","4","5"))
//}


