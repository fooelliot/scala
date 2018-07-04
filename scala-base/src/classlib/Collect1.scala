import scala.collection.mutable._
/*
 @Author: Mr.lyon
 @CreateBy: 2018-06-16 10:48
*/
object Collect1 {
  def main(args: Array[String]): Unit = {

//    val list = LinkedList(1,2,3,4);
//    var tmp = list
//    while(tmp.next != Nil) {
//      tmp = tmp.next
//      println(tmp)
//    }
//
//    val set = Set(1,2,3)
//    set.add(2)
//    set.add(3)
//    set.add(5)
//    for(e <- set) {
//      println(e)
//    }

    val x = '9'
    x match{
      case '+' => println("+++")
      case '-' => println("---")
      case _ if Character.isDigit(x) => print("is number")
      case _ => println("...")
    }

//    val y = "12"
//    y match{
//      case e:Int => print("is Int")
//      case c:String => print("is String")
//      case _ => println("is Int")
//    }


  }
}
