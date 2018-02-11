object typeInference {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(66); 
  println("Welcome to the Scala worksheet");$skip(14); 
  val num = 5;System.out.println("""num  : Int = """ + $show(num ));$skip(24); 
  val decimal = 5.35234;System.out.println("""decimal  : Double = """ + $show(decimal ));$skip(21); 
  var x = 1 + 2 *3.5;System.out.println("""x  : Double = """ + $show(x ));$skip(16); val res$0 = 
  List(1,2,4.5);System.out.println("""res0: List[Double] = """ + $show(res$0));$skip(15); val res$1 = 
  List(1,true);System.out.println("""res1: List[AnyVal] = """ + $show(res$1));$skip(24); val res$2 = 
  List(1,true, "Peggy");System.out.println("""res2: List[Any] = """ + $show(res$2));$skip(28); 
  def addOne(x:Int) = x + 1;System.out.println("""addOne: (x: Int)Int""");$skip(51); 
  def function1(x:Int) = if(x>0) 1 else "negative";System.out.println("""function1: (x: Int)Any""")}
}
