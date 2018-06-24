package func

object Func01 {

  def main(args: Array[String]): Unit = {
    println(add(1,3))
    println(f0(1,3))
    println(Array(2,3,4,5).map(multi))
    Array(2,3,4,5).map(x => x*3)
    println(call(-1,8,f5,f6))
    println(call(-1,8,fadd _,fsub _))
    println(call(-1,8,fadd,fsub))
  }

  def add(a:Int, b:Int) = a + b

  val f0 = add _

  def multi(n:Int) = n * 2

  val f1 = multi _

  def fadd(a:Int, b:Int) = a+b
  def fsub(a:Int, b:Int) = a-b

  val f5 = fadd _
  val f6 = fsub _

  def call(a:Int,b:Int,f3:(Int,Int)=>Int,f4:(Int,Int)=>Int){
    if(a > 0) {
      f3(a,b)
    }
    if(a < 0) {
      f4(a,b)
    }
  }


  def andy(a:Int,b:Int,f3:(Int,Int)=>Int,f4:(Int,Int)=>Int) : (Int)=>Int = {
    var n = 0
    if(a > 0) {
      n = f3(a,b)
    }
    if(a < 0) {
      n = f4(a,b)
    }
    def multi(x:Int) = n * n;
    multi _
  }


}
