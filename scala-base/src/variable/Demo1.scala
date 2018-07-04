package com.andy.demo1

//Scala 定义了两种类型的变量 val 和 var，val 类似于 Java 中的 final 变量，一旦初始化之后，不可以重新复制（我们可以称它为常变量）。
// 而 var 类似于一般的非 final 变量。可以任意重新赋值。
class Demo1 {

}

object Demo1 {
  def main(args: Array[String]): Unit = {
    var a = 10
    val b = 20

    a = 30
//    b = 40
    println(a)
    println(b)
  }
}
