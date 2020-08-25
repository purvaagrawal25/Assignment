import scala.annotation.tailrec

  def fibonacci(n: Int): Int = {
    @tailrec
    def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int = {
      println(nextToLast)
      if (i >= n) last
      else fiboTailrec(i + 1, last + nextToLast, last)
    }

    if (n <= 2) 1
    else fiboTailrec(2, 1, 1)
  }
 println(fibonacci(9))
