String str = ""
int number = 0
int highestNumber = 0
boolean cont = true

while (cont == true) {
print "Enter Number:"
    str = System.console().readLine()
    number = Integer.parseInt(str)

    if (number != -1) {
        if (number > highestNumber) {
            highestNumber = number;
        }
    } 
    else {
        cont = false;  
    }
}

println("Highest: " + highestNumber)
