package com.andy.demo1
import scala.collection.mutable.Map
/**
  * @author: Mr.ruoLin
  * @createBy: 2018-04-08 15:23
  **/
class Demo3 {


}
object Demo3{
  def main(args: Array[String]): Unit = {

    val m1 = Map("ccc"->12,"bbb"->23,"aaa"->21)
    println(m1)
    println(m1("aaa"))
    m1("aaa") = 233
    println(m1("aaa"))
    println(m1.getOrElse("aa",0))
    val t = ("tom",12,23.1)
    println(t)
    println(t._1)
    println(t._2)
    println(t._3)

    val arr = Array(("andy",12),("james",'c'),("tom","124"))
    println(arr.toMap)

    val arr1 = Array("aa","bb","cc")
    val names = Array("tom","jerry","andy","lyons")
    val ns = names.zip(arr1)
    println(ns.toBuffer)
    println("------------------")
    //创建一个不可变的集合
    val list1 = List(1,2,3)
    //将0插入到lst1的前面生成一个新的List
    val list2 = 0 :: list1
    println(list2)
    val list3 = list2.::(9)
    println(list3)
    val list4 = 0+:list3
    println(list4)
    val list5 = list4.+:(7)
    println(list5)

  }


}
