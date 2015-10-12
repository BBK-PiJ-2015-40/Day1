/* 10 You said high, I said low. . .
Modify your former program so that it outputs ”Yes” when the numbers are consecutive, 
regardless of whether they
go up or down. 
For example, both ”2,3,4,5,6,-1” and ”10,9,8,7,-1” should now result in ”Yes”.
 */

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
	{if((number-1 == PrevNumber) || (number == PrevNumber-1)) {
            PrevNumber = number;
        }  else{ seq = false}
    } 
    else {
        cont = false;  
    }
}

if (seq == true) {println ("Yes")} else {println ("No")}
