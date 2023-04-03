import scala.io.StdIn._

object StrInt_CMD_program {

  def main(args: Array[String]): Unit = {
    val name = readLine("Name: ")
    val age = readLine("Age: ").toInt
    println("Hi, " + name + ".\nI see you are " + age + " years old. I will always be 1 year elder. My current age is: " + {age+1} )

  }
}
