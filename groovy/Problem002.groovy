def fib 
fib = {n -> n > 1 ? fib(n - 1) + fib(n - 2) : n}.memoize()
def sum = 0
for (int n in 1..100) {
	int t = fib(n)
	if (t > 4000000) { 
		break
	}
	sum += (t % 2 == 0 ? t : 0)
}
println sum