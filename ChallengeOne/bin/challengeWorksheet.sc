object challengeWorksheet {

def add(a: Int, b:Int) = a+b                      //> add: (a: Int, b: Int)Int
def sub(a: Int, b:Int) = a-b                      //> sub: (a: Int, b: Int)Int

add(10,20)                                        //> res0: Int = 30
sub(10,20)                                        //> res1: Int = -10
add(0,10)                                         //> res2: Int = 10
add(-5,14)                                        //> res3: Int = 9
sub(10,10)                                        //> res4: Int = 0
sub(-10,10)                                       //> res5: Int = -20
add(add(10,10),10)                                //> res6: Int = 30

}