/* Going up!
Read an arbitrarily long sequence of positive numbers from the user, until -1 is entered. 
At that point, print ”Yes”
if the numbers were consecutive and increasing and ”No” otherwise. 
Sequences ”1,2,3,4,-1” and ”5,6,7,8,9,10,11,-1”should output ”Yes”, 
but ”2,3,5,6,7,-1”, ”10,9,8,7,-1”, and ”1,1,2,3,4,5,-1” should output ”No”. */

String str = ""
int number = 0
int PrevNumber = 0
boolean cont = true
boolean seq = true

while (cont == true) {
    str = System.console().readLine()
    number = Integer.parseInt(str)

    if ((number != -1) && (PrevNumber ==0)) {
		PrevNumber = number;
		}
    else if(number != -1)
	{if(number-1 == PrevNumber) {
            PrevNumber = number;
        }  else{ seq = false}
    } 
    else {
        cont = false;  
    }
}

if (seq == true) {println ("Yes")} else {println ("No")}
