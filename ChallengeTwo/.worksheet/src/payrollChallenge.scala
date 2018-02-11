object payrollChallenge {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(42); 
var rate = 10.50;System.out.println("""rate  : Double = """ + $show(rate ));$skip(190); 
def earnings(s: String, h: Double): String = {
if (s != "y"){
if (h <= 40)
"Salary is: $" + h*rate


else {"Salary is: $ " + (40*rate+(h-40)*rate*1.5)}
}
else "This is a salaried employee"};System.out.println("""earnings: (s: String, h: Double)String""");$skip(28); 

println(earnings("n", 40));$skip(27); 
println(earnings("n", 45));$skip(27); 
println(earnings("n", 25));$skip(26); 
println(earnings("y", 0))}


}
