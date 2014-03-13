object vko1b extends App {
	println("Anna ensimmäinen vuosi:")
	var vuosi1 = readInt
	println("Anna toinen vuosi:")
	var vuosi2 = readInt
	
	var suunta = 1
	if (vuosi2 < vuosi1) {
	  suunta = -1
	}
	
	for (i <- vuosi1 to vuosi2 by suunta) {
	  def onkoKarkausvuosi(vuosi:Int) : Boolean = {
	    if (vuosi % 400 == 0 && vuosi != 4000)
	      return true
	      
	    if (vuosi % 100 == 0 || vuosi % 4 != 0)
	      return false
	    
	    return true
	  }
	  
	  if (onkoKarkausvuosi(i)) {
	    println(i)
	  }
	}
}