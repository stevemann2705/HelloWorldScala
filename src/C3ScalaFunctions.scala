object C3ScalaFunctions extends App{
  def max(x: Int, y: Int): Int = {
    if(x > y) x else y
  }

  println(max(3, 5))

  // can usually omit function return type when it can be inferred
  def max2(x: Int, y: Int) = {
    if(x > y) x else y
  }

  println(max2(5, 20))

  // if function is single line, we can omit curly braces as well
  def max3(x: Int, y: Int) = if(x > y) x else y

  println(max3(4, 2))

  // this function returns "Unit" which means it returns nothing. Defining return type is option here (see the code above)
  def printHello() = println("Hello world using function")

  printHello()
}
