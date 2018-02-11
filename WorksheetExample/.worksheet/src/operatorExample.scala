object operatorExample {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(34); 
var x = 3;System.out.println("""x  : Int = """ + $show(x ));$skip(10); 
var y = 9;System.out.println("""y  : Int = """ + $show(y ));$skip(15); 

var sum = x+y;System.out.println("""sum  : Int = """ + $show(sum ));$skip(13); 

var b1 =x&y;System.out.println("""b1  : Int = """ + $show(b1 ));$skip(12); 
var b2 =x|y;System.out.println("""b2  : Int = """ + $show(b2 ));$skip(13); 
var b3 = x^y;System.out.println("""b3  : Int = """ + $show(b3 ));$skip(4); val res$0 = 

11;System.out.println("""res0: Int(11) = """ + $show(res$0));$skip(14); 
var b4 = x<<2;System.out.println("""b4  : Int = """ + $show(b4 ));$skip(25); 

val nums = 1::3::5::Nil;System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(47); val res$1 = 

if(x>0 || y	>0) "Both Variables are positive";System.out.println("""res1: Any = """ + $show(res$1))}
}
