class Binary {
  def input() {
    var a: Array[Int] = Array(23, 45, 3, 88, 5, 1, 30, 100, 19, 66)
    var index=search(a,2)
    if(index == -1) {
      println("element not found")
    }
    else
      println("element found at index "+index)

  }

  def search(arr: Array[Int], x: Int): Int = {
    var low =0
    var high = arr.length - 1
    while (low <= high) {

      var middle =(low + high) / 2
      if (arr(middle) == x)
        return middle
      else if (arr(middle) > x)
        high = middle - 1

      // Searching in the second half
      else
        low = middle + 1
    }
    return -1
  }
}
var obj=new Binary()
obj.input()