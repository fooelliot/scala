package com.andy.scala

/**
  * @author: Mr.ruoLin
  * @createBy: 2018-04-02 20:12
  **/
private [andy] class Person private {

  val id = "0978"

  var name = "安迪"

  private [this] var pop: String = _

  private [andy] def printPop(): Unit ={
    println(pop)
  }

}

object Person {

  def main(args: Array[String]): Unit = {
    val p = new Person
    println(p.id)


//    p.id = "aa" //常量无法修改
    p.name = "james"
    println(p.name)
    println(p.printPop())

  }

}
