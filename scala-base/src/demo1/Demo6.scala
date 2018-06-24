package com.andy.demo1

/**
  * @author: Mr.ruoLin
  * @createBy: 2018-04-08 16:38
  **/
class Demo6 private(val name:String,pop:Array[String],private val age: Int = 12) {

  println(pop.size)

  def description = name + " is "+ age +" is years old with" + pop.toBuffer

  override def toString: String = "this is to string method"
}

object Demo6 {
  def main(args: Array[String]): Unit = {
    val a = new Demo6("laowang",Array("aaa","bbb"),20)
    println(a.description)
    println(a.name)
    println(a.age)
    println(a.toString)



  }

}