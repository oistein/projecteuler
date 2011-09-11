def answer = (3..1001).step(2).inject(1) { sum, n -> sum += 4*n**2 - 6*n + 6 }
println answer