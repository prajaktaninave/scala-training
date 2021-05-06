// Exercise 1. Use a trait to define a generic queue of strings with 'put' and 'get' methods,
// and create a class that implements it using an array. Include tests.

trait immQTrait[A] {
  def put(x:A): MyQ[A]
  def get: (A, MyQ[A])
  def showQElements: Unit
  def toSeqence : Seq[A]
}

class MyQ[A](newEle: Seq[A]) extends immQTrait[A] {

  private val Q:Seq[A] = newEle

  override def put(x: A): MyQ[A] =  new MyQ(Q :+ x)

  override def get: (A, MyQ[A]) = (Q(0),new MyQ(Q.drop(1)))

  override def toSeqence: Seq[A] = Q.toSeq

  override def showQElements: Unit = {
    print("=> Elements in Q : ")
    this.Q.foreach(e => print(e + ", "))
    println()
  }
}


