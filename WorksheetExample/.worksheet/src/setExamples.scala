object setExamples {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
val fruit = Set("apple", "orange", "banana");System.out.println("""fruit  : scala.collection.immutable.Set[String] = """ + $show(fruit ));$skip(41); 
val moreFruit = Set("kiwi", "pineapple");System.out.println("""moreFruit  : scala.collection.immutable.Set[String] = """ + $show(moreFruit ));$skip(27); 
var nums = Set(	1,2,3,4,5);System.out.println("""nums  : scala.collection.immutable.Set[Int] = """ + $show(nums ));$skip(28); 
var moreNums = Set(6,7,8,9);System.out.println("""moreNums  : scala.collection.immutable.Set[Int] = """ + $show(moreNums ));$skip(17); val res$0 = 
nums.contains(5);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(8); val res$1 = 
nums(3);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(26); 
var mixed = fruit ++ nums;System.out.println("""mixed  : scala.collection.immutable.Set[Any] = """ + $show(mixed ));$skip(9); 
nums -=5;$skip(14); 
println(nums);$skip(16); val res$2 = 
nums & moreNums;System.out.println("""res2: scala.collection.immutable.Set[Int] = """ + $show(res$2));$skip(15); val res$3 = 
moreFruit.head;System.out.println("""res3: String = """ + $show(res$3));$skip(15); val res$4 = 
moreFruit.tail;System.out.println("""res4: scala.collection.immutable.Set[String] = """ + $show(res$4));$skip(17); val res$5 = 
moreNums.isEmpty;System.out.println("""res5: Boolean = """ + $show(res$5))}
}
