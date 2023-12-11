// Day 1 Question 1
object Day1 {

    def findFloor(instructions: String): Int = {
      instructions.foldLeft(0) { (floor, char) =>
        char match {
          case '(' => floor + 1
          case ')' => floor - 1
          case _ => floor
        }
      }
    }

    def main(args: Array[String]): Unit = {
      println("Enter the instructions:")
      val instructions = scala.io.StdIn.readLine()
      val finalFloor = findFloor(instructions)
      println(s"To what floor do the instructions take Santa? Santa ends up on floor $finalFloor.")
    }
}