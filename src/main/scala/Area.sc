val rectangle = (x: Double, y: Double) => x * y
val rhombus = (x: Double, y: Double) => 0.5 * x * y
val parallelogram = (x: Double, y: Double) => x * y
def addition(f: ( Double, Double) => Double,a: Double, b:Double): Double = f(a,b)

val areaOfRectangle = addition(rectangle,13, 2)
val areaOfRhombus = addition(rhombus, 2.4, 2)
val areaOfParallelogram = addition(parallelogram, 1.5, 1.5)
