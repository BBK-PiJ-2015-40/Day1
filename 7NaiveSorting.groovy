String str = "";
print "Enter a number:"
str=System.console().readLine();
n1 = Integer.parseInt(str);

print "Enter another number:"
str=System.console().readLine();
n2 = Integer.parseInt(str);

print "Enter final number:"
str=System.console().readLine();
n3 = Integer.parseInt(str);
println n1 + "," + n2 + "," + n3


if (n1>n2)	{
	if (n1>n3) {
		if(n2>n3) {println n3 + "," + n2 + "," + n1 }
			  else { println n2 + "," + n3 + "," + n1} 
			   } else {println n2 + "," + n1 + "," + n3}
			}
	else {if(n2>n3)	{
				if(n1>n3) {println n3 + "," + n1 + "," + n2}
				else {println n1 + "," + n3 + "," + n2}
					} else {println n1 + "," + n2 + "," + n3}
		 }
	
	
	
	