package com.andy.scala

import scala.io.Source

/**
  * @author: Mr.ruoLin
  * @createBy: 2018-04-02 20:46
  **/
class People(val id: Int, var name: String, val age: Int) {

  try {
    val context = Source.fromFile("F://HelloScala.scala").mkString
    println(context)
  } catch {
    case e: Exception => e.printStackTrace()

    case e: RuntimeException => e.printStackTrace()
  } finally {
      println("finally")
  }

  def sayHi():Unit={
    println("say Hi")
  }

}

object People{
  def main(args: Array[String]): Unit = {
    val people = new People(12, "andy", 18)
    println(people.id)
    println(people.name)
    people.name = "james"
    println(people.name)






  }
}
