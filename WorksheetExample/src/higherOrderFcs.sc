object higherOrderFcs {

val double = (i: Int) => i*2                      //> double  : Int => Int = higherOrderFcs$$$Lambda$3/1854731462@4b85612c

def higherOrder(x: Int, y: Int=>Int) = y(x)       //> higherOrder: (x: Int, y: Int => Int)Int


higherOrder(6, double)                            //> res0: Int = 12

var triple = (i: Int) => i*3                      //> triple  : Int => Int = higherOrderFcs$$$Lambda$9/1277181601@27f674d
higherOrder(6, triple)                            //> res1: Int = 18

def sayHello = (name: String) => {"Hello" + " " + name}
                                                  //> sayHello: => String => String

var mes = sayHello("Peggy")                       //> mes  : String = Hello Peggy

var y = 5                                         //> y  : Int = 5
val multiplier = (x:Int) => x*y                   //> multiplier  : Int => Int = higherOrderFcs$$$Lambda$11/509886383@6e8dacdf
multiplier(10)                                    //> res2: Int = 50
}