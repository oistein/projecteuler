def answer = (1..<1000).sum { n-> (n%3 == 0 || n%5 == 0) ? n : 0 }
println answer

