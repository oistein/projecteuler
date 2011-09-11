def sieve = { max->
	def	primes = (0..max).toList()
	def p = 2
	while (p < max) {
		(2*p..<max).step(p).each { primes[it] = null}
		p = primes.max { it > p }
	}
	primes.retainAll { it > 1 && it < max }
	primes
}
def answer = sieve(10000).findAll { 600851475143 % it == 0  }.max()
println answer