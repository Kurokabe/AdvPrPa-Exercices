import scala.annotation.tailrec

@tailrec
def factTail(x: Int, s: Int = 0): Int =
  if(x == 0) s else factTail(x-1, s*x)

factTail(4)

def fib(x: Int): Int = if (x == 0 || x == 1) x else fib(x - 1) + fib(x - 2)

fib(6)

@tailrec
def tailFib(x: Int, s: Int, t: Int): Int = if (x == 0) s else if (x == 1) t else tailFib(x - 1, t, s + t)
