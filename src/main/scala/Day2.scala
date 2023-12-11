// Day 2 Question 1
object Day2 {

  def findFloor(instructions: String): Int = {
    instructions.zipWithIndex.foldLeft(0) { case (floor, (char, position)) =>
      char match {
        case '(' => floor + 1
        case ')' => floor - 1
        case _   => floor
      }
    } match {
      case f if f == -1 => instructions.length + 1
      case _            => -1
    }
  }

  def main(args: Array[String]): Unit = {
    println("Enter the instructions:")
    val instructions = scala.io.StdIn.readLine()
    val finalFloor = findFloor(instructions)
    println(s"Santa ends up on floor $finalFloor.")
  }
}