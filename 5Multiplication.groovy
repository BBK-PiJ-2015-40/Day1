print "Enter First Number:"
int number1 = Integer.parseInt(System.console().readLine())
print "Enter Second Number:"
int number2 = Integer.parseInt(System.console().readLine())
int result = 0
int counter = 0
while(counter < number1)
{
	counter = counter +1
	result = result + number2
}
println "Result: " + result