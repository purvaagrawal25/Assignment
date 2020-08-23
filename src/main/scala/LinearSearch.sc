class LinearSearch {
  def input(){
    var index:Int = search(Array(10,20,30,40,50,60,70,80,90,100), 40)
    if (index == -1)
      println("Element not found")
    else
      println("Element found at Index " + index)
  }
  def search(arr:Array[Int],x:Int): Int ={
    for(i<- arr.indices) {
      if (x == arr(i)) {
        return i
      }
    }
  return -1
  }
}
var obj=new LinearSearch()
obj.input()