class VowelOccurence {
  var sum=0
  def sumOfVowels(): Unit = {
    val str: String = "abcde"
    for (i <- 0 until str.length()) {
      for (j <- i to str.length()) {
        for (k <- i until j) {
          if(str.charAt(k)=='a'||str.charAt(k)=='e'||str.charAt(k)=='i'||str.charAt(k)=='o'||str.charAt(k)=='u')
          {
            sum=sum+1
          }
        }
      }

    }
    println(sum)
  }
}
var obj=new VowelOccurence()
obj.sumOfVowels()
