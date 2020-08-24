class Bubble {
  def input() {
    var arr: Array[Int] = Array(23, 45, 3, 88, 5, 1, 30, 100, 19, 66)
    for (i <- 0 until arr.length - 1) {
      for (j <- 0 until (arr.length - i - 1)) {
        if (arr(j) > arr(j + 1)) {
          var temp = arr(j)
          arr(j) = arr(j + 1)
          arr(j + 1) = temp
        }
      }
    }
    for (i <- 0 to arr.length - 1)
      println(arr(i))
  }
}
var obj=new Bubble()
obj.input()