/*13 All the primes up to 1,000 (*)
Write a program that prints all on screen all prime numbers up to 1,000. */

boolean Prime = true

 for(int i=2; i<1000; i++) {
	for(int j=2; j<i; j++) 
	{ if(i%j==0) {
				 Prime = false
				 break} 
    } 
	if(Prime ==true) {println i} else {Prime = true}  } 
	
 
 