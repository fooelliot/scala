package com.andy.demo1

/**
  * @author: Mr.ruoLin
  * @createBy: 2018-04-08 14:18
  **/
class Demo1 {


}

object Demo1 {
  def main(args: Array[String]): Unit = {
    val b = 8
    var a = if (b>0) 2 else 0
    println(a)
    val c = {
      if (b<10){2}else if(b<3){5}else{9}
    }
    println(c)

    for (i <- 1 to 10) {
      println(i)
    }
    val arr = Array("aa", "bb", "cc")
    for (a <- arr) {
      println(a)
    }

//    for (i <- 1 to 10 ;j <- 1 to 10 if a == b) {
//      println(i,j)
//    }

    val v = for (i<-1 to 10) yield i*10
    println(v)
    println(a,b)
    println(a+b)
    println(a.+(b))
    println(a.*(b))
    println(a.-(b))
    println(m1())

    println(f1(2,5))

    println(m2(f3)+"hello")

    println(f4(2,6))
  }
  def m1 ():Int ={
    return 2
  }
  val f1 = (x: Int,y: Int) => x+y

  def m2 (f: (Int,Int)=>Int):Int ={f(2,4)}
  val f2 = (a: Int,b: Int)=> a+b
  val f3 = (a: Int,b: Int) => a*b

  def m3(a: Int,b: Int): Int=a*b
  val f4 = m3 _


}
