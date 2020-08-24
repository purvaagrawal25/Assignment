class Selection {
  def input() {
    var arr: Array[Int] = Array(23, 45, 3, 88, 5, 1, 30, 100, 19, 66)
    for ( i <- 0 until arr.length - 1)
    {
      var index = i
      for (j<-i + 1 until arr.length){
      if (arr(j) < arr(index)){
        index = j//searching for lowest index
      }
    }
    var temp = arr(index)
          arr(index) = arr(i)
          arr(i) = temp
        }

    for (i <- 0 to arr.length - 1){
      println(arr(i))
  }
}
}
var obj=new Selection()
obj.input()