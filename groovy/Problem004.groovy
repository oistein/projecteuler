def cands = []
for (int a in 999..111)
  for (int b in 999..111) {
	  if ((a*b).toString().reverse() == (a*b).toString()) {
		  cands << a*b
	  }
  }
  
println cands.max()