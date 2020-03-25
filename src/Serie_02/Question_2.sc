import scala.annotation.tailrec

def sum(f: Int => Double, a: Int, b: Int) = {
  @tailrec
  def iter(a: Int, acc: Double): Double = {
    if (a > b) acc
    else iter(a + 1, acc + f(a))
  }
  iter(a, 0)
}

sum(x => x * x, 1, 3)