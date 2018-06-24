package com.andy.demo1

import scala.collection.mutable
import scala.collection.mutable.HashSet

/**
  * @author: Mr.ruoLin
  * @createBy: 2018-04-08 15:23
  **/
class Demo4 {


}
object Demo4{

  def main(args: Array[String]): Unit = {
    val set1 = new HashSet[Int]()
    println(set1)
    val set2 = set1 + 3
    println(set2)
    val set3 = set1 ++ Set(23,43,5)
    println(set3)
    val set4 = Set(3,1,5)++set3
    println(set4)
    println(set4.getClass)
    //可变的set
    val seta = mutable.HashSet[Int]()
    println(seta)
    val setb = seta += 12
    println(setb)
    //add 方法返回的是truefalse
    val setc = setb.add(23)
    println(setb)
    val setd = setb ++= mutable.Set(12,3,6)
    println(setd)

    val mapa = new mutable.HashMap[String,Int]()
    mapa("aa") = 1
    mapa("bb") = 3
    println(mapa)
    mapa += (("cc",4))
    println(mapa)
    mapa.put("dd",34)
    println(mapa)
    mapa.remove("dd")
    println(mapa)
    mapa -= "cc"
    println(mapa)




  }

}



