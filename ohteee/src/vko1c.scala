object vk1c extends App {
	def sort(xs: Array[String]): Array[String] =
	  if (xs.length <= 1) xs
	  else {
	    val pivot = xs(xs.length / 2)
	    Array.concat(
	      sort(xs filter (pivot >)),
	      xs filter (pivot ==),
	      sort(xs filter (pivot <))
	    )
	}
	
	var sorted = sort(args)
	sorted.foreach(println)
}

