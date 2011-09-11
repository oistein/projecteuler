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
    
    primes.findAll { it > 0 }
}
def primes = sieve(100)
primes.inject(1) { p, n ->  }
