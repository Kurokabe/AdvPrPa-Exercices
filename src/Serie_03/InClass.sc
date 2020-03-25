class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator can't be 0")
  val num = n / g
  val denom = d / g

  def gcd(x: Int, y: Int): Int =
    if (y == 0) x else gcd(y, x % y)

  private val g = gcd(n, d)

  def +(that: Rational) = {
    new Rational(num * that.denom + that.num * denom,
      denom * that.denom)
  }
  def -(that: Rational) = {
    new Rational(num * that.denom - that.num * denom,
      denom * that.denom)
  }
  def *(that: Rational) = {
    new Rational(num * that.num, denom * that.denom)
  }
  def /(that: Rational) = {
    new Rational(num * that.denom, denom * that.num)
  }
  def ==(that: Rational) = {
    num * that.denom == denom * that.num
  }

  def unary_-() = {
    new Rational(-num, denom)
  }

  def <(that: Rational) = {
    num * that.denom < denom * that.num
  }

  def max(that: Rational) = {
    if (this.<(that)) that else this
  }

  override def toString() = num + "/" + denom
}

val a = new Rational(1, 2)
val b = new Rational(1, 3)

a.max(b)



