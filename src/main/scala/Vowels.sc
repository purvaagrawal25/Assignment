class Question
{var t=0
  def sumOfVowels(): Unit ={
    val str:String="abcde"
    for(i <-0 until str.length()){
      for(j<- i to str.length()){
        for(k<- i until j){
          print(str.charAt(k))
      val c : String=str.substring(i,j)
        }
        isVowel( c ,str.length())
        println()
      }

    }
  }
  val c=0
  def isVowel(s:String,l:Int):Int=
    {
       val st=Character.toLowerCase(st)
      if (st == 'a'|| st=='e'|| st=='i'||st=='o'||st=='u')
        {
          t=t+1
        }
      else isVowel(s,l-1)
      c=c+1

    }
}
var obj=new Question()
obj.sumOfVowels()
obj.isVowel()