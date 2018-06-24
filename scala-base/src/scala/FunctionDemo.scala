package com.andy.scala

import scala.collection.mutable.ArrayBuffer

/**
  * @author: Mr.ruolin
  * @createBy: 2018-04-01 10:20
  **/
object FunctionDemo {

  val func = (x: Int) => {x*10}

  //声明一个方法
  def m1 (f: Int => Int) : Int = {
   //在方法体中调用函数
//    val f0 = f
//    f(3)
    f(3)
  }

  def m2 (name: String): Unit = {
    println(name)
  }

  def main(args: Array[String]) {
    val r = m1(func)

    println(r)
    val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val r1 = arr.map(x => x*5)
    val r2 = arr.map(x => x-1)

    println(r1.toBuffer)
    println(r2.toBuffer)
    println(arr.toBuffer)
    m2("laowang")




    val arr1 = new Array[Int](8)
    println(arr1.toBuffer)

    val ab = new ArrayBuffer[Int](1)
    ab += 1
    ab += 2
    ab += (4,5,6)
    ab ++= arr1
    ab.insert(11,22,33)
    println(ab.toBuffer)
    println(ab)

    ab.map(print)
    println()

    for(a <- arr) yield a*10
    val arr3 = arr.filter((x: Int) => x % 2 == 0)
    println(arr3.toBuffer)

  }


}
