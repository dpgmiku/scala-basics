

object Average extends App {
  
  val array = Array(1,2,3,4,5,0,7,8,9,10)
  
  def min()= {
  var minimum = array.head
for (n<-array.tail) n < minimum match{
case true => minimum = n
case false => minimum = minimum
}
 minimum 
  }
  
    def max()= {
  var maximum = array.head
for (n<-array.tail) n > maximum match{
case true => maximum = n
case false => maximum = maximum
}
 maximum
  }

 def sum(): Double= {
var sum = array.head
for (n<-array.tail) sum=sum+n
 sum
  }
 
 def average() = {
   
 sum()/array.length  
 }
    
  
 println(min())
 println(max())
 println(sum())
 println(average())
}