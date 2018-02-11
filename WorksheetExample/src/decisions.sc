object decisions {

var today = "tuesday"                             //> today  : String = tuesday

if (today == "Monday") println("It might rain")
else println("It is not monday, so it will not rain")
                                                  //> It is not monday, so it will not rain

var b = 3                                         //> b  : Int = 3
var a = if(b < 0) -1 else 1                       //> a  : Int = 1
println(a)                                        //> 1
println(if(b<0) "-" else if (b==0) "0" else "+")  //> +

var rate = 10.50                                  //> rate  : Double = 10.5
def earnings(s: String, h: Double): String = {
if (s != "y"){
if (h <= 40)
"Salary is: $" + h*rate


else {"Salary is: $ " + (40*rate+(h-40)*rate*1.5)}
}
else "This is a salaried employee"}               //> earnings: (s: String, h: Double)String

println(earnings("n", 30))                        //> Salary is: $315.0
println(earnings("n", 45))                        //> Salary is: $ 498.75
println(earnings("y", 40))                        //> This is a salaried employee

	}