package com.any.scala
import java.util.Date

/**
  * @author: Mr.ruolin
  * @createBy: 2018-04-01 16:11
  **/
object Demo3 {
  def main(args: Array[String]): Unit = {
    println(func(2))
    println(func1(23,34))
    Demo3.func1(23,12)
    Demo3.func1()

    val date = new Date
    val logWithDateBound = log(date, _ : String)

    logWithDateBound("message1" )
    Thread.sleep(2000)
    logWithDateBound("message2" )
    Thread.sleep(2000)
    logWithDateBound("message3" )
  }
  def func(x: Int): Int = {
    println(x);
    return x;
  }
  def func1(x: Int = 2,y: Int=4): Unit = {
    println(x+y)
    return null
  }
  def log(date: Date, message: String)  = {
    println(date + "----" + message)
  }


}

//final case class Symbol private(var name: String){
//  val str = "defade"
//  println(str)
//  override def toString: String = {"tostring\b"}
//}
