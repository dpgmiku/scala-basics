object decisions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(41); 

var today = "tuesday";System.out.println("""today  : String = """ + $show(today ));$skip(103); 

if (today == "Monday") println("It might rain")
else println("It is not monday, so it will not rain");$skip(11); 

var b = 3;System.out.println("""b  : Int = """ + $show(b ));$skip(28); 
var a = if(b < 0) -1 else 1;System.out.println("""a  : Int = """ + $show(a ));$skip(11); 
println(a);$skip(49); 
println(if(b<0) "-" else if (b==0) "0" else "+");$skip(18); 

var rate = 10.50;System.out.println("""rate  : Double = """ + $show(rate ));$skip(190); 
def earnings(s: String, h: Double): String = {
if (s != "y"){
if (h <= 40)
"Salary is: $" + h*rate


else {"Salary is: $ " + (40*rate+(h-40)*rate*1.5)}
}
else "This is a salaried employee"};System.out.println("""earnings: (s: String, h: Double)String""");$skip(28); 

println(earnings("n", 30));$skip(27); 
println(earnings("n", 45));$skip(27); 
println(earnings("y", 40))}

	}
