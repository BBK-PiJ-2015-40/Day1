/*14 Up to 1,000 primes (*)
Modify the program that you wrote for the former exercise so that it writes on screen the first 1,000 primes.
 */

boolean Prime = true
int counter = 0

 for(int i=2; i<10000; i++) {
	
	if(counter==1000) {print "Reached 1000"
					break} else {
	
	for(int j=2; j<i; j++) 
	{ if(i%j==0) {
				 Prime = false
				 break} 
    } 
	if(Prime ==true) 
	{println i
	counter++} else {Prime = true}  } }