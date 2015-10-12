String str = "";
print "Enter a number:"
str=System.console().readLine();
n1 = Integer.parseInt(str);

print "Enter another number:"
str=System.console().readLine();
n2 = Integer.parseInt(str);

int result = 0
int remainder = 0;

if (n2 == 0) { println "Cannot divide by 0"}
    else if (n1 == 0) {  println "0" }
    else if (n1 == n2) { println "1"}
    else if (n1 > 0 && n2 > 0 && n1 < n2) { println "0"}
		
    else { while (n1 >= n2) {
                    n1 -= n2;
                    result++; 
					remainder = n1;
					}
                println n1 + "divided by" + n2 + "is" + result + "remainder" + remainder}