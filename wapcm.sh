#!/bin/bash
#WAP to add, subtract and multiply 2 given numbers passed as command line arguments.
a= $1
b= $2

sum =` expr $a + $b `
sub =` expr $a - $b `
mul =` expr $a *\ $b `
echo the sum of two number is = $sum
echo the sub of two number is = $sub
echo the multiplication of two number is = $mul
