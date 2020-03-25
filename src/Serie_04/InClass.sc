def patFoo(x: Any) = {
  x match {
    case a: Int if (a % 4 == 0) => true
    case b: Char if (b isUpper) => true
    case c: Boolean => true
    case _ => false
  }
}

def insert(elem: Int, l: List[Int]): List[Int] =
  if (l isEmpty)
    List(elem)
  else if (elem < l.head)
    elem::l
  else
    l.head :: insert(elem, l.tail)

def isort(xs: List[Int]): List[Int] =
  if (xs.isEmpty) Nil
  else insert(xs.head, isort(xs.tail))

isort(List(4, 23, 2, 45, 4))

def insertPM(elem: Int, l : List[Int]) : List[Int] = {
  l match{
    case Nil => List(elem)
    case head :: rest => if(elem < head)
                            elem :: l
                          else
                            head :: insertPM(elem, rest)
  }
}


