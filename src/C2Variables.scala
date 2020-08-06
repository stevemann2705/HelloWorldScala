object C2Variables extends App{
  // using var to store a message in a variable and print it
  var message = "Hello again, world!"
  println(message)

  // giving variable type
  var message2 : String = "Hello world yet again"
  println(message2)

  // var variables can be reassigned
  message = "Corrected Hello World"
  println(message)

  val immutableMessage = "Immutable Hello World"
  println(immutableMessage)

//  immutableMessage = "Trying to change immutable variable (val) will not compile, hence this line is commented"
}
