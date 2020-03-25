import scala.annotation.tailrec

// a)
def product(f: Int => Double) (a: Int) (b: Int) = {
  @tailrec
  def iter(a: Int, acc: Double): Double = {
    if (a > b) acc
    else iter(a + 1, acc * f(a))
  }
  iter(a, 1)
}

product(x => x) (1) (4)

// b)
def fact(max: Int) = {
  product(x => x)(1) (max)
}

fact(5)
