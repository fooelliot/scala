package com.andy.demo1

import scala.collection.mutable.ArrayBuffer

/**
  * @author: Mr.ruoLin
  * @createBy: 2018-04-08 14:51
  **/
class Demo2 {

}
object Demo2{

  def main(args: Array[String]): Unit = {
    val arr1 = new Array[Int](3)
    println(arr1.toBuffer)
    val arr2 = Array("aa","bb","cc","dd")
    println(arr2.toBuffer)

    val arr3 = new ArrayBuffer[Byte]()
    println(arr3.toBuffer)
    arr3 += 12
    arr3 += 23
    arr3 += (23,1,127)
    arr3 ++= Array[Byte](1,3,4)
    arr3 ++= ArrayBuffer[Byte](23,12)
    arr3.insert(0,-1,0,1,2)
    println(arr3.toBuffer)
    arr3.remove(1,1)
    println(arr3)
    arr3.remove(2,2)
    println(arr3)
    print(0 until 10)

    println("---------------------------")
    for(i <- (0 until arr3.length).reverse) {
      println(arr3(i))
    }
    println("---------------------")
    val arr5 = Array(1,2,3,4,5,6,7,9,8,10)
    val arr6 = for (i <- arr5 if i % 2==0) yield i + 3
    println(arr6.toBuffer)
    val arr7 = arr5.filter(_%2==0).map(_+3)
    println(arr7.toBuffer)

    println(arr5.sum)
    println(arr5.max)
    println(arr5.min)
    println(arr5.sorted.toBuffer)
  }


}