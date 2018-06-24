package com.andy.demo1

/**
  * @author: Mr.ruoLin
  * @createBy: 2018-04-08 16:07
  **/
class Demo5 (val aa:String,val bb:Int){
  //用this关键字定义辅助构造器
  def this (name:String,age:Int,id:Int){
    this(name,age)
    println("执行辅助构造器")
    this.id = id
  }

  println("构造会执行类中的所有语句")
  var id = 100
  val sex = "man"
  private var name:String = "tom"
  private[this] val age: Int = 34
  println("相当于构造器中的代码")

  try{
    println("读取文件")
    throw new Exception("读取文件异常")
  } catch {
    case e: NullPointerException => println("空指针异常",e.printStackTrace())
    case e: Exception => println("发生异常",e.printStackTrace())
  } finally {
    println("finally 中的代码")
  }


}
object Demo5{
  def main(args: Array[String]): Unit = {
    println()
    println()
    val personb = new Demo5("james",23)
    val person = new Demo5("andy",34,11111)
    println(person.aa)
    println(person.bb)
    println(person.id)
    println(person.sex)
    println(person.name)



  }
}