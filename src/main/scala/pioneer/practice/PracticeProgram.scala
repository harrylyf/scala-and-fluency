package pioneer.practice

import Practice.square

object PracticeProgram extends App {
  print("Enter a number: ")
  val inputNumber = scala.io.StdIn.readInt()
  val result = square(inputNumber)
  println(s"The square of ${inputNumber} is ${result}.")
}