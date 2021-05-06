import scala.collection.mutable.ListBuffer
import scala.collection.mutable.ArrayBuffer

trait genQueue[A] {
  var newQ : ArrayBuffer[A] =_

  //generic put
  def put(x:A): Unit = {
    println("=> Enqueue : " +x+ " in Queue")
    newQ +=x
    showQElements
  }

  //generic get
  def get: A = {
    val res = newQ.remove(0)
    println("=> Dequeue : first element of Queue : "+ res)
    showQElements
    res
  }

  //generic show
  def showQElements: Unit = {
    println("=> showing Q elements : ")
    newQ.foreach(e => print(e+" "))
    println()
  }
}

class exercise1_GenericQ_String(newList: ArrayBuffer[String]) extends genQueue[String] {
  newQ = newList
  showQElements
  override def put(x: String): Unit = super.put(x)
  override def get: String = super.get
  override def showQElements: Unit = super.showQElements

}

class exercise1_GenericQ_Int(newList: ArrayBuffer[Int]) extends genQueue[Int] {
  newQ = newList
  showQElements
  override def put(x: Int): Unit = super.put(x)
  override def get: Int = super.get
  override def showQElements: Unit = super.showQElements

}
//object exercise12 {
//  var c1 = new exercise1(ListBuffer("1","2","3","4","5"))
//}


