abstract class IntSet() {
  def add(x: Int): IntSet
  def contains(x: Int):Boolean
}

object Empty extends IntSet{
  def contains(x: Int) : Boolean = false
  def add(x: Int) : IntSet = new NonEmpty(x, Empty, Empty)
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet{
  def add(x: Int): IntSet = {
    if (x < elem) new NonEmpty(elem, left add x, right)
    else if (x > elem) new NonEmpty(elem, left, right add x)
    else this
  }

  def contains(x: Int): Boolean = {
    if(x < elem) left contains x
    else if (x > elem) right contains x
    else true
  }
}