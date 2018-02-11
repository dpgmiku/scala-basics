object variables {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(56); 
var greetings, message: String = null;System.out.println("""greetings  : String = """ + $show(greetings ));System.out.println("""message  : String = """ + $show(message ));$skip(26); 


val list1 = List(1,2,3);System.out.println("""list1  : List[Int] = """ + $show(list1 ));$skip(26); 
val list2 = List(1,2,3.0);System.out.println("""list2  : List[Double] = """ + $show(list2 ));$skip(28); 
val list3 = List(1,2, true);System.out.println("""list3  : List[AnyVal] = """ + $show(list3 ));$skip(36); 
val list4 = List(1,2,true, "Peggy");System.out.println("""list4  : List[Any] = """ + $show(list4 ));$skip(23); 

var a = 10.toString();System.out.println("""a  : String = """ + $show(a ));$skip(18); 
var b = 10.to(20);System.out.println("""b  : scala.collection.immutable.Range.Inclusive = """ + $show(b ));$skip(18); 

var c = 10.+(11);System.out.println("""c  : Int = """ + $show(c ));$skip(17); 
var d = 10 to 20;System.out.println("""d  : scala.collection.immutable.Range.Inclusive = """ + $show(d ));$skip(17); 

var e = 10 + 11;System.out.println("""e  : Int = """ + $show(e ));$skip(18); 
var f = 97.toChar;System.out.println("""f  : Char = """ + $show(f ));$skip(20); 
var g = 85.97.toInt;System.out.println("""g  : Int = """ + $show(g ));$skip(13); 

a += " ten";$skip(11); 
println(a)}

}
