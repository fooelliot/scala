package com.andy.scala

import scala.util.Random

/**
  * @author: Mr.ruoLin
  * @createBy: 2018-04-06 17:30
  **/
class Chinese extends Human with Animal with Monkey {
  override def run(): Unit = {
    println("人在跑")
  }
}

object Chinese {
  def main(args: Array[String]): Unit = {
    val c = new Chinese
    c.run()

//    val arr = Array("a","b","c")
//    val name = arr(Random.nextInt(arr.length))
//    name match {
//      case "a" => println("this is a")
//      case "b" => println("this is b")
//      case "b" => println("this is c")
//      case _ => println("nothing")
//    }

    val arr = Array(1,23.2,"some")
    val name = arr(Random.nextInt(arr.length))
    name match {
      case x: Int => println("this is int"+x)
      case y: Double if(y >= 0) => println("this is Double")
      case z: String => println("this is Stromg"+z)
      case _: Int => println("nothing")
    }
  }
}
