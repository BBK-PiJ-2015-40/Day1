/* 12 Number piramids
Write a program that output a number piramid like the one below.
1
22
333
4444
55555
666666
7777777
\ldots */

int num
int count =1

for(num=1; num<=7; num++) {
if(num==1) {println num}
while (count<num) 
{
print num
count ++
if(num==count) {println num}
}
count = 1
}

