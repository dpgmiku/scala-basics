object challengeWorksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 

def add(a: Int, b:Int) = a+b;System.out.println("""add: (a: Int, b: Int)Int""");$skip(29); 
def sub(a: Int, b:Int) = a-b;System.out.println("""sub: (a: Int, b: Int)Int""");$skip(12); val res$0 = 

add(10,20);System.out.println("""res0: Int = """ + $show(res$0));$skip(11); val res$1 = 
sub(10,20);System.out.println("""res1: Int = """ + $show(res$1));$skip(10); val res$2 = 
add(0,10);System.out.println("""res2: Int = """ + $show(res$2));$skip(11); val res$3 = 
add(-5,14);System.out.println("""res3: Int = """ + $show(res$3));$skip(11); val res$4 = 
sub(10,10);System.out.println("""res4: Int = """ + $show(res$4));$skip(12); val res$5 = 
sub(-10,10);System.out.println("""res5: Int = """ + $show(res$5));$skip(19); val res$6 = 
add(add(10,10),10);System.out.println("""res6: Int = """ + $show(res$6))}

}
