object functionExamples {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 

def abs(x: Int)  = if(x < 0) -x else x;System.out.println("""abs: (x: Int)Int""");$skip(9); val res$0 = 

abs(-5);System.out.println("""res0: Int = """ + $show(res$0));$skip(62); 


def fac(n: Int) = {
var r  = 1
for(i <- 1 to n)
r = r*i
r
};System.out.println("""fac: (n: Int)Int""");$skip(8); val res$1 = 

fac(5);System.out.println("""res1: Int = """ + $show(res$1));$skip(56); 


def fac2(n: Int):Int = if (n<=0) 1 else n * fac2(n-1);System.out.println("""fac2: (n: Int)Int""");$skip(9); val res$2 = 

fac2(5);System.out.println("""res2: Int = """ + $show(res$2));$skip(144); 

def printName(left: String="[", firstName: String, lastName: String, right: String="]") {
println(left + firstName + " " + lastName + right)
};System.out.println("""printName: (left: String, firstName: String, lastName: String, right: String)Unit""");$skip(53); 

printName(lastName = "Fischer", firstName= "Peggy");$skip(124); 
                                              
def sum(args: Int*) ={
var result = 0
for(arg <- args) result +=arg
result
};System.out.println("""sum: (args: Int*)Int""");$skip(17); val res$3 = 


sum(1,2,3,4,5);System.out.println("""res3: Int = """ + $show(res$3))}
}
