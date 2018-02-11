
import io.Source._
object readFromFiles extends App {
  val fileName = "src/rainbow.txt"
  
  for( line <- fromFile(fileName).getLines()) {
    
    println(line.toUpperCase())
  }
  
  val rainbowLines = fromFile("src/rainbow.txt").getLines().toList
  rainbowLines.foreach(println)
}