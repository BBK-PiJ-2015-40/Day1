/*Prime Numbers*/
print "Enter Number"
String str = System.console().readLine()
int i = Integer.parseInt(str)
if (i==1 || i==2) {System.out.println("Number is a not Prime Number");}
else if (i%2==0) { System.out.println("Number is a not Prime Number");}
else {System.out.println("Number is a Prime Number");}