/*15 Guess my number (*)
Write a program that thinks of a random number between 0 and 1000, and then lets the user try to guess it.
For every guess, the computer says whether the guess is correct, or too low, or too high. When the user finds
the number, the computer will tell how many guesses were needed. The output could be similar to the following
example:
Try to guess my number!
Tell me a number: 2
No! My number is higher.*/

int numberToGuess = Math.abs(1000 * Math.random())

print "Tell me a Number:"
String str = System.console().readLine()
int Number = Integer.parseInt(str)

if (numberToGuess==Number){print "Success"}

else if (numberToGuess<Number) {
print "No! My number is lower."

print "Tell me a Number:"
String abc = System.console().readLine()
int Number2 = Integer.parseInt(abc)}

else {
print "No! My number is higher."
print "Tell me a Number:"
String def = System.console().readLine()
int Number3 = Integer.parseInt(def)
}