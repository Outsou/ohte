object vko1_2a extends App {
	val koneenLuku = (10*math.random).toInt
	
	println(koneenLuku)
	
	println("Anna eka luku:")
	val luku1 = readInt
	println("Anna toka luku:")
	val luku2 = readInt
	println("Anna kolmas luku:")
	val luku3 = readInt
	
	var tulos = 0
	
	if (luku1 == koneenLuku) tulos += 400
	if (luku2 == koneenLuku) tulos += 200
	if (luku3 == koneenLuku) tulos += 100
	if (tulos == 0) tulos = -100
	
	println("Tulos: " + tulos)
}