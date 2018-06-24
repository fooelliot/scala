package com.andy.scala

/**
  * @author: Mr.ruolin
  * @createBy: 2018-03-22 21:52
  **/
object HelloScala {

  val a = 1

  val b = 20


  def main(args: Array[String]) {

    val aa = 12

    val bb = 20

    val str: String = "hello world"

    print(aa,bb,str)

    for (i <- 1.to(10)) yield i * 10

    1.to(10).map(_*10)

    val r = me_one(13, 13)
    print(r)

  }

//  def me_one(a: Int, b: Int): Int = a*b
  def me_one(a: Int, b: Int) = a*b //等同上面代码

  //函数
  (x: Int, y: Int) => {x * y}





}
