object higherOrderFcs {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(53); 

val double = (i: Int) => i*2;System.out.println("""double  : Int => Int = """ + $show(double ));$skip(45); 

def higherOrder(x: Int, y: Int=>Int) = y(x);System.out.println("""higherOrder: (x: Int, y: Int => Int)Int""");$skip(25); val res$0 = 


higherOrder(6, double);System.out.println("""res0: Int = """ + $show(res$0));$skip(30); 

var triple = (i: Int) => i*3;System.out.println("""triple  : Int => Int = """ + $show(triple ));$skip(23); val res$1 = 
higherOrder(6, triple);System.out.println("""res1: Int = """ + $show(res$1));$skip(57); 

def sayHello = (name: String) => {"Hello" + " " + name};System.out.println("""sayHello: => String => String""");$skip(29); 

var mes = sayHello("Peggy");System.out.println("""mes  : String = """ + $show(mes ));$skip(11); 

var y = 5;System.out.println("""y  : Int = """ + $show(y ));$skip(32); 
val multiplier = (x:Int) => x*y;System.out.println("""multiplier  : Int => Int = """ + $show(multiplier ));$skip(15); val res$2 = 
multiplier(10);System.out.println("""res2: Int = """ + $show(res$2))}
}
