#!bin/sh
# WAP to exchange the values of 2 numbers.
echo Enter value for a:
read a
echo Enter value for b:
read b
clear
echo Values of variables before swaping
echo A=$a
echo B=$b
echo Values of variables after swaping
a=`expr $a + $b`
b=`expr $a - $b`
a=`expr $a - $b`
echo A=$a
echo B=$b
