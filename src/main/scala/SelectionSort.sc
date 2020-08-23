class SelectionSort {
  def input() {
    var arr:Array[Int]= Array(23,45,3,88,5,1,30,100,19,66)
    var i:Int = 0
    for (i<-0 until arr.length-1){
      for (j <- i+1 until arr.length) {
        if(arr(j)<arr(i)) {
          val temp = arr(i)
          arr(i) = arr(j)
          arr(j) = temp
        }
      }
    }
    for(i <- 0 to arr.length-1)
      println(arr(i))

  }
}
var obj=new SelectionSort()
obj.input()