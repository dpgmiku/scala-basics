object listExamples {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(45); 
var l = List(3.0,5,'a');System.out.println("""l  : List[Double] = """ + $show(l ));$skip(28); 
var l2 = 1::2::3::5::6::Nil;System.out.println("""l2  : List[Int] = """ + $show(l2 ));$skip(27); 
var l3 = List.range(10,20);System.out.println("""l3  : List[Int] = """ + $show(l3 ));$skip(15); 
var l4 = l::l2;System.out.println("""l4  : List[Any] = """ + $show(l4 ));$skip(13); 

var sum = 0;System.out.println("""sum  : Int = """ + $show(sum ));$skip(19); 
l3.foreach(sum+=_);$skip(13); 
println(sum);$skip(35); 
var list = List((1,2),(3,4),(5,6));System.out.println("""list  : List[(Int, Int)] = """ + $show(list ));$skip(30); val res$0 = 
for ((a,b) <- list) yield a+b;System.out.println("""res0: List[Int] = """ + $show(res$0))}
}
