import java.util.List

import java.util.{HashMap=>JavaHashMap}
import Array._
/**
  * @author: Mr.ruolin
  * @createBy: 2018-04-01 13:43
  **/

/**
  * scala是一门多范式编程语言，集成了面向对象编程和函数式编程等多种特性。
  * scala运行在虚拟机上，并兼容现有的Java程序。
  * Scala源代码被编译成java字节码，所以运行在JVM上，并可以调用现有的Java类库。
  */
package com.andy.scala{

  import java.util

  object ScalaDemo1 {
    def main(args: Array[String]): Unit = {
      /**
        * 第一个Scala程序
        * Scala和Java最大的区别是：Scala语句末尾的分号（；）是可选的！
        * 编译运行：
        * 先编译：scalac HelloScala.scala   将会生成两个文件：HelloScala$.class和HelloScala.class
        * 在运行：scala HelloScala
        * 输出结果：hello scala!!!
        *
        *   object HelloScala{
        def main(args: Array[String]): Unit = {
          println("hello scala!!!")
        }
      }
        */

      /**
        * Scala基本语法:
        * 区分大小写
        * 类名首字母大写（MyFirstScalaClass）
        * 方法名称第一个字母小写（myMethodName()）
        * 程序文件名应该与对象名称完全匹配
        * def main(args:Array[String]):scala程序从main方法开始处理，程序的入口。
        *
        * Scala注释：分为多行/**/和单行//
        *
        * 换行符：Scala是面向行的语言，语句可以用分号（；）结束或换行符（println()）
        *
        * 定义包有两种方法：
        *   1、package com.ahu
        *      class HelloScala
        *   2、package com.ahu{
        *       class HelloScala
        *     }
        *
        * 引用：import java.awt.Color
        * 如果想要引入包中的几个成员，可以用selector（选取器）:
        *   import java.awt.{Color,Font}
        *   // 重命名成员
        *   import java.util.{HashMap => JavaHashMap}
        *   // 隐藏成员 默认情况下，Scala 总会引入 java.lang._ 、 scala._ 和 Predef._，所以在使用时都是省去scala.的
        *   import java.util.{HashMap => _, _} //引入了util包所有成员，但HashMap被隐藏了
        */

      /**
        * Scala数据类型：
        * Scala与Java有着相同的数据类型，下面列出一些Scala有的数据类型。
        * Unit：表示无值，和其他语言的void一样。
        * Null：null或空引用。
        * Nothing：是Scala的类层级的最低端，是任何其他类型的子类型。
        * Any：是所有其他类的超类。
        * AnyRef：是Scala所有引用类的基类。
        *
        * 多行字符串的表示方法：
      val foo ="""第一行
          第二行
          第三行"""
        */
/*      val str1 = """
             第一
             第二
             第三
            """
      println(str1)*/

      /**
        * Scala变量：
        * 在Scala中，使用关键字“var”声明变量，使用关键字“val”声明常量。
        *   var myVar1 : String = "foo"
        *   var myVar2 : Int
        *   val myVal = "Hello,Scala！"
        * Scala多个变量声明：
        *   val xmax, ymax = 100  // xmax,ymax都声明为100
        */

      /*
      val byteNum: Byte = 1;
      val shortNum: Short = 2;
      val intNum: Int = 4
      val longNum: Long = 8
      val boolean: Boolean = true
      val char: Char = 'a'
      val doubleNum: Double = 1.2D
      val floatNum: Float = 2.3F
      println(byteNum,shortNum,intNum,longNum,doubleNum,floatNum,char,boolean)
      var sum = 12
      sum = 23
      print(sum)*/


      /**
        * Scala访问修饰符：
        * Scala访问修饰符和Java基本一样，分别有private、protected、public。
        * 默认情况下，Scala对象的访问级别是public。
        *
        * 私有成员：用private关键字修饰的成员仅在包含了成员定义的类或对象内部可见。
        *     class Outer{
        *       class Inner{
        *         private def f(){println("f")}
        *         class InnerMost{
        *           f() // 正确
        *         }
        *         (new Inner).f() // 错误
        *       }
        *     }
        *
        * 保护成员：Scala比Java中更严格。只允许保护成员在定义了该成员的类的子类中被访问。
        *     package p{
        *     class Super{
        *       protected def f() {println("f")}
        *     }
        *         class Sub extends Super{
        *           f()
        *         }
        *         class Other{
        *           (new Super).f()  // 错误
        *         }
        *     }
        *
        * 公共成员：默认public，这样的成员在任何地方都可以被访问。
        *   class Outer{
        *     class Inner{
        *       def f(){println("f")}
        *       class InnerMost{
        *         f() // 正确
        *       }
        *     }
        *     (new Inner).f() // 正确
        *   }
        *
        * 作用域保护：Scala中，访问修饰符可以通过使用限定词强调。
        *   private[x] 或者 protected[x]
        *   private[x]：这个成员除了对[...]中的类或[...]中的包中的类及他们的伴生对象可见外，对其他的类都是private。
        */

//        if(false) {
//          print("hello true")
//        } else if (true){
//          print("hello")
//        } else{
//          print("true")
//        }

//      while (true) {
//        println("nihao")
//        Thread.sleep(500)
//      }

      /**
        * Scala函数：用一个例子来说明函数的定义和函数调用。
        * object Test{
        *   def main(args: Array[String]){
        *     println(addInt(1,3)); // 函数调用
        *   }
        *   def addInt(a:Int, b:Int) : Int = {  // 函数定义
        *     var sum:Int = 0
        *     sum = a + b
        *     return sum
        *   }
        * }
        */
//      def addInt(x: Int, y: Int): Int = {x+y}
//      println(addInt(2,4))
      /**
        * Scala闭包：
        * 闭包是一个函数，返回值依赖于声明在函数外部的一个或多个变量。
        * 例子：
        *  object Test{
        *   def main(args: Array[String]){
        *     println("muliplier(1) value = " + muliplier(1))
        *     println("muliplier(2) value = " + muliplier(2))
        *   }
        *   var factor = 3  // 定义在函数外的自由变量
        *   val muliplier = (i:Int) => i * factor  // muliplier函数变量就是一个闭包
        *  }
        *  输出结果：
        *  muliplier(1) value = 3
        *  muliplier(2) value = 6
        */


      /**
        * Scala字符串：
        *
        * Scala中可以创建两中字符串：一种是不可修改的，一种是可以修改的。
        * // 创建不可修改的字符串
        * var greeting:String = "Hello World!";
        * // 创建可以修改的字符串
        * object Test{
        * def main(args: Array[String]){
        * val buf = new StringBuilder;
        * buf += 'a'  // 添加一个字符
        * buf ++= "bcdef" // 添加一个字符串
        * println(buf.toString);  // 输出：abcdef
        * }
        * }
        *
        * 字符串长度：xxx.length()
        *
        * 字符串连接：可以用concat()方法或者用加号
        * object Test {
        * def main(args: Array[String]) {
        * var str1 = "字符串1：";
        * var str2 =  "字符串2";
        * var str3 =  "字符串3：";
        * var str4 =  "字符串4";
        * println( str1 + str2 ); //  字符串1：字符串2
        * println( str3.concat(str4) ); // 字符串3：字符串4
        * }
        * }
        *
        * 创建格式化字符串：
        * String类中可以使用printf()方法来格式化字符串并输出。
        * object Test{
        * def main(args:Array[String]){
        * var floatVar = 12.456
        * var intVar = 2000
        * var stringVar = "字符串变量"
        * var fs = printf("浮点型变量为 " +
        * "%f，整形变量为 %d, 字符串为 " +
        * "%s", floatVar, intVar, stringVar)
        * println(fs) // 浮点型变量为 12.456000, 整型变量为 2000, 字符串为 字符串变量
        * }
        * }
        */

//      val str = "hello world"
//      val s1 = "andy"
//      val intNum = 12
//      val floatNum = 12.3
//      println(str.length)
//      println(str.concat(s1))
//      println(str+s1+"demo")
//
//      printf("整型：%d，小数类型：%f,字符串类型：%s",intNum,floatNum,s1)

      /**
        * Scala数组：
        * 1、声明数组
        * var z:Array[String] = new Array[String](3)  或者  var z = new Array[String]()
        * z(0) = "value1"; z(1) = "value2"; z(2) = "value3"
        *
        * var z = Array("value1", "value2", "value3")
        *
        * 2、处理数组
        * object Test{
        * def main(args: Array[String]){
        * var myList = Array(1.1, 2.2, 3.3, 4.4)
        *
        * // 输出所有数组元素
        * for(x <- myList){
        * println(x)
        * }
        *
        * // 计算数组所有元素的总和
        * var total = 0.0
        * for(i <- 0 to (myList.length - 1)){
        * total += myList(i)
        * }
        * println("总和：" + total)
        *
        * // 查找数组中的最大元素
        * var max = myList(0)
        * for(i <- 1 to (myList.length - 1)){
        * if(myList(i) > max)
        * max = myList(i)
        * }
        * println("最大值：" + max)
        * }
        * }
        *
        * 3、多维数组
        * import Array._
        * object Test{
        * def main(args: Array[String]){
        * // 定义数组
        * var myMatrix = ofDim[Int](3,3)
        * // 创建矩阵
        * for(i <- 0 to 2){
        * for(j <- 0 to 2){
        * myMatrix(i)(j) = j;
        * }
        * }
        * // 打印矩阵
        * for(i <- 0 to 2){
        * for(j <- 0 to 2){
        * print(" " + myMatrix(i)(j));
        * }
        * println();
        * }
        * }
        * }
        *
        * 4、合并数组
        * import Array._
        * object Test{
        * def main(args: Array[String]){
        * var myList1 = Array(1.1, 2.2, 3.3, 4.4)
        * var myList2 = Array(5.5, 6.6, 7.7, 8.8)
        * // 使用concat()合并
        * var myList3 = concat(myList1, myList2)
        * // 输出所有数组元素
        * for(x <- myList3){
        * println(x)
        * }
        * }
        * }
        *
        * 5、创建区间数组:使用range(x,y,z)创建区间数组,数值范围大于等于x,小于y。z表示步长，默认为1。
        * object Test{
        * def main(args: Array[String]){
        * var myList1 = range(10, 20, 2)
        * var myList2 = range(10, 20)
        * for(x <- myList1){
        * print(" " + x)  //输出：10 12 14 16 18
        * }
        * println()
        * for(x <- myList2){
        * print(" " + x)  // 输出：10 11 12 13 14 15 16 17 18 19
        * }
        * }
        * }
        */
//      val a1:Array[String] = new Array[String](2)
//      val a2 = Array[String]("a","b")
//      val a3 = new Array[String](2)
//      println(a1.toBuffer,a2.toBuffer,a3.toBuffer)
//      val myList = Array(1.1, 2.2, 3.3, 4.4)
//      for (ll <- myList) {
//        println(ll)
//      }
//      var total = 0.0
//      for(i <- (0 to myList.length-1)) {
//        total += myList(i)
//      }
//      println(total)
//
//      var max = myList(0)
//      for (i <- myList) {
//        if (i > max) {
//          max = i
//        }
//      }
//      println("最大值："+max)
//
//
//      //多维数组
//      var myMatrix = ofDim[Int](4,3)
//      for (i <- 0 to 3) {
//        for (j <- 0 to 2) {
//          myMatrix(i)(j) = j
//        }
//      }
//
//      for (i <- 0 to 3) {
//        for (j <- 0 to 2) {
//          print(myMatrix(i)(j)+",")
//        }
//        println()
//      }

//      var myList1 = Array(1.1, 2.2, 3.3, 4.4)
//      var myList2 = Array(1.1, 2.2, 3.3, 4.4)
//      var myList3 = concat(myList1,myList2)
//      for (i <- myList3){
//        println(i)
//      }
//      var mylist0 = Array.range(23, 34, 4)
//      var myList1 = range(10, 20, 2)
//      var myList2 = range(10, 20)
//      for (i <- mylist0) {
//        println(i)
//      }

      /**
        * Scala集合：分为可变集合和不可变集合。
        * 可变集合：可以在适当的地方被更新或扩展，也就是可以修改、添加、移除一个集合的元素。
        * 不可变集合：永远不会改变。但可以模拟添加、移除、更新操作，但是这些操作将在每一种情况下都返回一个新的集合，
        *            同时使原来的集合不发生改变。
        * // 定义整形List
        * val x = List(1,2,3,4)
        * // 定义Set
        * var x = Set(1,3,5,7)
        * // 定义Map
        * val x = Map("one" -> 1, "two" -> 2, "three" -> 3)
        * // 创建两个不同类型的元组
        * val x = (10, "Runoob")
        * // 定义Option
        * val x:Option[Int] = Some(5)
        */
//        val l = List(1,2,3,4,5)
//        val s = Set(1.2,3.2,4.2,2.1)
//        val m = Map("one" -> 1,"tow" -> 2,"three" -> 3)
//        val y = (12,"Runoob")
//        val x: Option[Int] = Some(5)


      /**
        * Scala迭代器：
        * 迭代器不是一个集合，而是一个用于访问集合的方法。
        *
        */
      /*object Test{
        def main(args: Array[String]): Unit = {
          val it = Iterator("one", "two", "three", "four")
          while(it.hasNext){  // 检测集合中是否还有元素
            println(it.next())  // 返回迭代器的下一个元素，并更新迭代器的状态
          }

          val ita = Iterator(1, 2, 3, 4, 5)
          val itb = Iterator(11, 22, 33, 44, 55)
          //println(ita.max)  // 查找最大元素
          //println(itb.min)  // 查找最小元素

          println(ita.size) // 获取迭代器的长度
          println(itb.length) // 获取迭代器的长度
        }
      }*/


    }
  }

}


