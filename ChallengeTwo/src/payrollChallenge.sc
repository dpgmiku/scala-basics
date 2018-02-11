object payrollChallenge {
var rate = 10.50                                  //> rate  : Double = 10.5
def earnings(s: String, h: Double): String = {
if (s != "y"){
if (h <= 40)
"Salary is: $" + h*rate


else {"Salary is: $ " + (40*rate+(h-40)*rate*1.5)}
}
else "This is a salaried employee"}               //> earnings: (s: String, h: Double)String

println(earnings("n", 40))                        //> Salary is: $420.0
println(earnings("n", 45))                        //> Salary is: $ 498.75
println(earnings("n", 25))                        //> Salary is: $262.5
println(earnings("y", 0))                         //> This is a salaried employee


}