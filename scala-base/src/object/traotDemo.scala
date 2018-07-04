
import java.util.{ArrayList,Map,Set}
//import java.util.{Random => _,_}
import java.util.{Random}
import java.io._

//  * Scala Trait（特征）：
//  * 相当于Java的接口，但比接口功能强大，它还可以定义属性和方法的实现。
//  * 一般情况下Scala的类只能单继承，但特征可以实现多重继承。
// 定义特征
trait Equal{
  def isEqual(x: Any): Boolean                // 未实现的方法
  def isNotEqual(x: Any): Boolean = !isEqual(x) // 实现了的方法
}

class Point(xc: Int, yc: Int) extends Equal{
  var x: Int = xc
  var y: Int = yc

  override def isEqual(obj: Any): Boolean =
    obj.isInstanceOf[Point] &&
    obj.asInstanceOf[Point].x == x
}

object Test{
  def main(args: Array[String]): Unit = {
    val p1 = new Point(2, 3)
    val p2 = new Point(2, 4)
    val p3 = new Point(3, 3)
    println(p1.isNotEqual(p2))
    println(p1.isNotEqual(p3))
    println(p1.isNotEqual(2))
  }
}

/**
  * 特征构造顺序：
  * 构造器的执行顺序：
  * 1、调用超类的构造器
  * 2、特征构造器在超类构造器之后、类构造器之前执行
  * 3、特征由左到右被构造
  * 4、每个特征当中，父特征先被构造
  * 5、如果多个特征共有一个父特征，父特征不会被重复构造
  * 6、所有特征被构造完毕，子类被构造
  */

/**
  * Scala模式匹配：
  * 选择器 match {备选项}
  */
/*object Test{
  def main(args: Array[String]): Unit = {
    println(matchTest("two"))
    println(matchTest("test"))
    println(matchTest(1))
    println(matchTest(6))
  }
  def matchTest(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "scala.Int"  // 对应类型匹配
    case _ => "many"  // 默认全匹配选项
  }
}*/
/**
  * 使用样例类：
  * 使用case关键字的类定义就是样例类，样例类是种特殊的类，经过优化以用于模式匹配。
  */
/*object Test{
  def main(args: Array[String]): Unit = {
    val alice = new Person("Alice", 25)
    val bob = new Person("Bob", 32)
    val charlie = new Person("Charlie", 27)
    for(person <- List(alice, bob, charlie)){
      person match{
        case Person("Alice", 25) => println("Hi Alice!")
        case Person("Bob", 32) => println("Hi Bob!")
        case Person(name, age) => println("Age: " + age + " year,name: " + name +"?")
      }
    }
  }
  // 样例类
  case class Person(name: String, age: Int)
}*/

/**
  * Scala正则表达式：
  * 和Java差不多，在用的时候查一下就行了。
  */

/**
  * Scala异常处理：
  * 和Java类似。在Scala中借用了模式匹配的方法来在catch语句块中来进行异常匹配。
  */
/*import java.io.{FileNotFoundException, FileReader, IOException}
object Test{
  def main(args: Array[String]): Unit = {
    try {
      val f = new FileReader("input.txt")
    }catch {
      case ex: FileNotFoundException => {
        println("Missing file exception")
      }
      case ex: IOException => {
        println("IO Exception")
      }
    }finally {
      println("Exiting finally...")
    }
  }
}*/

/**
  * Scala提取器（Extractor）:
  * apply方法：无需new操作就可创建对象。
  * unapply方法：是apply方法的反向操作，接受一个对象，然后从对象中提取值，提取的值通常是用来构造对象的值。
  */
/*object Test {
  def main(args: Array[String]) {

    println ("Apply 方法 : " + apply("Zara", "gmail.com")); // 也可直接Test("Zara", "gmail.com")来创建Zara@gmail.com
    println ("Unapply 方法 : " + unapply("Zara@gmail.com"));
    println ("Unapply 方法 : " + unapply("Zara Ali"));

  }
  // 注入方法 (可选)
  def apply(user: String, domain: String) = {
    user +"@"+ domain
  }

  // 提取方法（必选）
  def unapply(str: String): Option[(String, String)] = {
    val parts = str split "@"
    if (parts.length == 2){
      Some(parts(0), parts(1))
    }else{
      None
    }
  }
}*/
/**
  * 提取器使用模式匹配：
  * 在我们实例化一个类的时，可以带上0个或者多个的参数，编译器在实例化的时会调用 apply 方法。
  */
/*object Test {
  def main(args: Array[String]) {

    val x = Test(5)
    println(x)

    x match
    {
      case Test(num) => println(x + " 是 " + num + " 的两倍！")  //2：10是5的两倍！
      //unapply 被调用
      case _ => println("无法计算")
    }

  }
  def apply(x: Int) = x*2 //1：10
  def unapply(z: Int): Option[Int] = if (z%2==0) Some(z/2) else None
}*/

/**
  * Scala文件I/O:
  *
  */
/*// 文件写操作
import java.io._
object Test {
  def main(args: Array[String]) {
    val writer = new PrintWriter(new File("test.txt" ))

    writer.write("Scala语言")
    writer.close()
  }
}*/
// 从屏幕上读取用户输入
/*object Test {
  def main(args: Array[String]) {
    print("请输入菜鸟教程官网 : " )
    val line = Console.readLine // 在控制台手动输入

    println("谢谢，你输入的是: " + line)
  }
}*/
// 从文件上读取内容
/*import scala.io.Source
object Test {
  def main(args: Array[String]) {
    println("文件内容为:" )

    Source.fromFile("test.txt" ).foreach{
      print
    }
  }
}*/

package com.andy.test{}
package com.andy.demo{}