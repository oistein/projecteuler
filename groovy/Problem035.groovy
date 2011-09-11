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
	primes.toList()
}

def primes = sieve(999999)

def isCircular = { int n ->
	if (!n || n == 1) return false
	if (n < 11) return true
	String str = n.toString()
	for (int i in 1..str.length()) {
		str = str[1..-1] + str[0]
		if (primes[str as int] == 0)
			return false
			
	}
	true
} 

def answer = primes.count { p-> 
	isCircular(p)
}

println answer
