class BinarySearch {
  def input(){
    var index:Int = search(Array(10,20,30,40,50,60,70,80,90,100), 24)
    if (index == -1)
      println("Element not found")
    else
      println("Element found at Index " + index)
  }
  def search(arr:Array[Int],x:Int): Int ={
    var low=0
    var high=arr.length-1
    while(low<=high)
      {
        var middle = (low + high)/ 2
        // If element found in the middle index
        if (arr(middle) == x)
          return middle
        // Searching in the first half
        else if (arr(middle) > x)
          high = middle - 1
        // Searching in the second half
        else
          low = middle + 1
      }
    // If value not found
    return -1
      }
}
var obj=new BinarySearch()
obj.input()