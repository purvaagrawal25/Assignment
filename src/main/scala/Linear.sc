class Linear {
  def input() {
    var a: Array[Int] = Array(23, 45, 3, 88, 5, 1, 30, 100, 19, 66)
    var index=search(a,40)
    if(index == -1) {
      println("element not found")
    }
      else
      println("element found at index"+index)

  }

  def search(arr: Array[Int], x: Int): Int = {
    var n = arr.length
    for (i <- 0 until n) {
      if (arr(i) == x)
        return i
    }
    return -1
  }
}
var obj=new Linear()
obj.input()