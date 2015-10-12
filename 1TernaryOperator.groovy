/* 1. Ternary Operator */
int currentYear = 2012
print "Where were you born?"
String str = System.console().readLine();
int birthYear = Integer.parseInt(str);
int ageAprox = currentYear - birthYear;
String result = (ageAprox > 17) ? " " : "not"
println "It seems you are" + " " + result + "an adult."


