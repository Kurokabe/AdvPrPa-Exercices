abstract class IntSet() {
  def add(x: Int): IntSet
  def contains(x: Int):Boolean
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

  override def toString: String = "(" + left + "|" + elem + "|" + right + ")"

}

object Empty extends IntSet{
  def contains(x: Int) : Boolean = false
  def add(x: Int) : IntSet = new NonEmpty(x, Empty, Empty)

  override def toString: String = "_"
}

println(Empty)
println(Empty.add(3))
println(Empty.add(3).add(2))

