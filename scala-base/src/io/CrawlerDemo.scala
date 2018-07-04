package file

import java.io.FileOutputStream
import java.net.URL
import java.util.regex.Pattern

import scala.io.Source

object CrawlerDemo {
  def main(args: Array[String]): Unit = {

//    val url = new URL("http://www.ivsky.com/bizhi/may_2018_v48613/pic_766723.html");
//    val in = url.openStream()
//    val out = new FileOutputStream("d:\\tmp\\1.html")
//    var len = 0
////    val buf = new Array[Byte](in.available())
//    val buf = new Array[Byte](1024)
//    while((len = in.read(buf)) != -1) {
//      out.write(buf,0,len)
//    }
//    out.close()
//    in.close()

    val str = Source.fromFile("d:\\tmp\\1.html").mkString
    val p = Pattern.compile("<a\\s*href=\"[\u0000-\uffff&&[^\u005c\u0022]]*\"]")
    val m = p.matcher(str)
    while (m.find()) {
      var s = m.group(0);
      println(s)
    }



  }
}
