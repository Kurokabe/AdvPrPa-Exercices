def abs(x: Double) = if (x < 0) -x else x

def isGoodEnough(x: Double, xn: Double) = abs(x - xn * xn) < 0.0001

def improve(x: Double, xn: Double) = xn - (xn * xn - x) / (2 * xn)


def compute(x: Double, xn: Double): Double = if (isGoodEnough(x, xn)) xn else compute(x, improve(x, xn))

def sqrt(x: Double) = compute(x, 10)

sqrt(100)

sqrt(612)