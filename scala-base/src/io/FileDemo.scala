package file

import scala.io.Source

object FileDemo {
  def main(args: Array[String]): Unit = {
    val s = Source.fromFile("D:\\tmp\\data.dta", "UTF-8")
    val lines = s.getLines();
    for (line <- lines) {
      println(line)
    }

    val str = Source.fromFile("D:\\tmp\\data.dta", "UTF-8").mkString
    val it = str.split("\n")
    for (i <- it) {
      println(i)
    }



  }
}
