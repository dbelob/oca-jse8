# Explanation

A, B, C.

All the wrapper objects are immutable. When you do i++, what actually happens is something like this:

    i = Integer.valueOf( i.intValue()  + 1);  As you can see, a different Integer object is assigned back to i.
    
However, to save on memory, Java 'reuses' all the wrapper objects whose values fall in the following ranges:
* All Boolean values (true and false)
* All Byte values
* All Character values from \u0000 to \u007f (i.e. 0 to 127 in decimal)
* All Short and Integer values from -128 to 127
So ==  will always return true when their primitive values are the same and belong to the above list of values.

Once catch, however, is that when you create a primitive wrapper using the new keyword, a new object is created and a cached object, even if available, is not used. For example:

    Integer i = 10; //Wrapper created without using the new keyword and is, therefore, cached.
    Integer j = 10; //Cached object is reused. No new object created.
    Integer k = new Integer(10); //New object is created. Cached object is not reused.

This implies that i == j is true but i == k is false.

Note that the following will not compile though:

    Byte b = 1; Integer i = 1;
    b == i; //Invalid because both operands are of different class.
