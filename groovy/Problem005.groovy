 gcd = {m, n -> (m%n == 0) ? n : gcd(n,m%n)}
lcm = {m, n -> ((m*n)/gcd(m,n)) as int }
def a = (1..<20).inject(1) { sum, n-> lcm(sum, n) }
println a