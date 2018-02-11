object mapExamples {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(94); 
var groceries = Map(1 -> "milk", 2 -> "bread", 3 -> "juice", 4 -> "eggs");System.out.println("""groceries  : scala.collection.immutable.Map[Int,String] = """ + $show(groceries ));$skip(43); 
groceries = groceries +(5 -> "hashbrowns");$skip(17); val res$0 = 
groceries.get(3);System.out.println("""res0: Option[String] = """ + $show(res$0));$skip(13); val res$1 = 
groceries(3);System.out.println("""res1: String = """ + $show(res$1));$skip(35); val res$2 = 
groceries.getOrElse(6, "no match");System.out.println("""res2: String = """ + $show(res$2));$skip(39); 
for (v <- groceries.values) println(v);$skip(46); 
var z = for ((k,v) <- groceries) yield (v, k);System.out.println("""z  : scala.collection.immutable.Map[String,Int] = """ + $show(z ));$skip(27); 
groceries.foreach(println)}
}
