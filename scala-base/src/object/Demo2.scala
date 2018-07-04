package com.andy.scala

/**
  * @author: Mr.ruolin
  * @createBy: 2018-04-01 15:12
  **/
object Demo2 {

  def main(args: Array[String]): Unit = {
    var pt = new Point(10, 20)
    pt.move(10,20)
    pt.name = "james"
    println(pt.toString)

    val spt = new Location(10,20,30)
    spt.name="spt"
    spt.salary=2300
    spt.move(10,20,30)
    println(spt)

  }

}

/**
  * Scala类和对象：
  * 类是对象的抽象，对象是类的具体实例。
  * 类是抽象的，不占用内存；对象是类的具体实例，占用存储空间。
  *
  */
/*import java.io._
class Point(xc: Int, yc: Int){
  var x: Int = xc
  var y: Int = yc
  def move(dx: Int, dy: Int): Unit ={
    x = x + dx
    y = y + dy
    println("x点的坐标是：" + x)
    println("y点的坐标是：" + y)
  }
}
object Test{
  def main(args: Array[String]): Unit = {
    val pt = new Point(10, 20)
    // 移到一个新的位置
    pt.move(10, 10)
  }
}*/

class Point(val xc:Int, val yc:Int){
  var x: Int = xc
  var y: Int = yc

  def move(dx:Int, dy:Int): Unit = {
    x = x + dx
    y = y + dy
    println("x点的坐标是："+x)
    println("y点的坐标是："+y)
  }
  var name = "andy"
  //重写了toString方法
  override def toString = getClass.getName + "[name=" + name + "]"
}

class Location(override val xc: Int, override val yc: Int,
               val zc: Int) extends Point(xc, yc){        // 继承   重写了父类的字段
  var z: Int = zc
  def move(dx: Int, dy: Int, dz: Int){
    x = x + dx
    y = y + dy
    z = z + dz
    println("x点的坐标是：" + x)
    println("y点的坐标是：" + y)
    println("z点的坐标是：" + z)
  }
  //---------------------------------------
  var salary = 0.0
  override def toString = super.toString + "[salary=" + salary + "]"
}

