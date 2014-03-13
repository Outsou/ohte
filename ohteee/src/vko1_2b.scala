object vko1_2b extends App {
	if (args.length == 0) {
	  println("Komentoriviparametri puuttui.")
	  sys.exit
	}
	
	val file = new java.io.File(args(0))
	val filename = file.getName()
	println("Mit‰ merkkijonoa etsit‰‰n tiedostosta " + filename + "?")
	val merkkijono = readLine
	if (merkkijono.length() < 1) {
	  println("Tyhj‰ merkkijono")
	  sys.exit
	}
	
	import scala.io.Source  
	var rivinumero = 0
	for(line <- Source.fromFile(args(0)).getLines()) {
		rivinumero += 1
		if (line.contains(merkkijono))
			println(rivinumero + ": " +line)
	}
}