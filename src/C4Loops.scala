object C4Loops extends App{
  var i = 10
  while (i > 0) {
    // curly braces option for if in case of a single statement
    if(i == 10) println("Here we go")
    println("Hello World " + i)
    i -= 1
  }

  // Do note, we haven't really used semicolons till now.
  // Although they can be used, they're not needed most of the times
  println("Bang Bang");
  println();

  // Above is an imperative style loop. We have some neat tricks here
  val list = List(1,2,3)
  // We're passing a function as a parameter to the foreach
  list.foreach(number => println("Hello World " + number))

  // Scala infers the type of number variable,
  // but it can be specified explicitly (providing wrong type will not compile)
  list.foreach((number: Int) => println("Again " + number))

  // If a function literal consists of one statement that takes a single argument,
  // you need not explicitly name and specify the argument
  list.foreach(println)

  // Imperative for loop. number variable will always be a val and not a var so we don't need to specify val number.
  // This also means you cannot reassign number inside the loop
  for(number <- list) {
    println(number)
  }
}
