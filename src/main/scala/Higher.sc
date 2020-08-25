
 val squareSum = (x: Int, y: Int) => x * x + y * y
 val cubeSum = (x: Int, y: Int) => x * x * x + y * y * y
 val intSum = (x: Int, y: Int) => x + y

 def addition(f: (Int, Int) => Int,a: Int, b:Int): Int = f(a,b)
  val squaredSum = addition(squareSum,1, 2)
  val cubedSum = addition(cubeSum, 1, 2)
  val normalSum = addition(intSum, 1, 2)
