/*16 Rock, Paper, Scissors (*)
Write a program that reads 2 characters from either the keyboard or a file. 
The characters are either PP, PR, PS, RP,RR, RS, SP, SR, or SS. 
They correspond to the selections made by 2 players playing the game of rock-paper-scissors.
Make the program accept inputs until one player’s score is more than 3 points ahead of the other.
Hint: remember that you can use .substring() to get the elements of a String.*/

print "Enter First Element:"
String first = System.console().readLine()

print "Enter Second Element:"
String second = System.console().readLine()

String Match = " "
Match = first+second
if (Match==PP) { print "Winner is First Player"}

