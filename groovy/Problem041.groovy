
def a = "123456789".toList().permutations().findAll { p ->
	p = p.join() as int
	for (int n in 1..Math.sqrt(p)) 
		if (p % n == 0) return null
	p
}.max()

println a