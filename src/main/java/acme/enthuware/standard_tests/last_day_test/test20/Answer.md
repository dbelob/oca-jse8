# Explanation

A.

Here, we have four overloaded probe methods but there is no probe method that takes a double parameter. However, a double will be boxed into a Double and class Double extends Number. Therefore, a Double can be passed to the method that takes Number. A Double can also be passed to a method that takes Object, but Number is more specific than Object therefore probe(Number ) will be called.

We advise you to run this program and try out various combinations. The exam has questions on this pattern.
