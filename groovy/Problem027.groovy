def sieve = { int max->
	int[] primes = new int[max]
	(0..<max).each { int i-> primes[i] = i }
	
	int p = 2;
	while (p*p < max) {
	    for (int i = 2*p; i < max; i += p) primes[i] = 0;
	    for (int i=p+1;i<max;i++) {
	        if (primes[i] > p) {
	            p = primes[i];
	            break;
	        }
	    }
	}
	primes
}

def primes = sieve(10000000)
def max = 0
def maxcount = 0
(-999..999).each { a-> 
	(-999..999).each { b-> 
		int count = 0
		for (int n = 0;; n++) {
			if (primes[n*n+a*n+b]) {
				count++	
			} else {
				break
			}
		}
		if (count > maxcount) {
			max = a*b
			maxcount = count	
		}

	}
} 
println max