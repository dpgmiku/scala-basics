object operatorExample {
var x = 3                                         //> x  : Int = 3
var y = 9                                         //> y  : Int = 9

var sum = x+y                                     //> sum  : Int = 12

var b1 =x&y                                       //> b1  : Int = 1
var b2 =x|y                                       //> b2  : Int = 11
var b3 = x^y                                      //> b3  : Int = 10

11                                                //> res0: Int(11) = 11
var b4 = x<<2                                     //> b4  : Int = 12

val nums = 1::3::5::Nil                           //> nums  : List[Int] = List(1, 3, 5)

if(x>0 || y	>0) "Both Variables are positive" //> res1: Any = Both Variables are positive
}