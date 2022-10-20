# Basic Java Array Sample Code

## Goals:

<strong>Create an array using two methods:</strong>
1. Create an empty array and determine the length
   2. ex. `String[] array = new String[n]` with n being the length of the array
2. Create an array that has elements instead of a set length
   3. ex. `String[] array2 = new String[]{e1,e2,e3, ..., n}`

<strong>Add elements into the first array separately</strong>
1. For practice purposes, there is no need to fill entire array if there is no need to.
   1. The array starts at 0, so the length will be `array.length -1` at all times.
   2. If there is an empty array
2. There should be no need to add elements to the other array as that was already created.

`import java.util.Arrays` will let us see what is inside the array when we print to the console <br/>
If we do not use this, it will print out the name of the array object rather than the content within </br>
the array. It looks something like this: `[Ljava.lang.String;@4c873330`. 

`Arrays.toString(arrayName)` will convert the array into an array of strings rather than just displaying <br/>
the name of the object.

## Iterating through arrays and printing to console

Now that the arrays are created and show that they can be printed as arrays, we can display
each individual element separately.

For the purpose of practice, we will be using both the for-each and the for loops.

<strong>For-Each</strong><br/>
I have learned that the for-each loop is easy to use for iterating through simple arrays like these two examples.
When writing the loop, we can say to ourselves "<i>For each `element` in `arrayName`, iterate through `arrayName` and display</i>".

The code is written `for(String element : array){ code }`. For an easier time to know what we are referencing, it <br/>
is easy to have element be a singular form of the name of the array or whatever element you are wanting to <br/>
iterate through in the array. For this code, we are going to iterate and display the elements on separate lines. 
<br/>Therefore, we will use `System.out.println()` <em>within</em> the loop or it will be out of scope.

<strong>For Loop</strong></br>
The for loop contains more code than the for-each loop, but operates the same way.<br/>
It is written as `for(int i; i <= array.length -1; i++){ code }`.  As with the for-each loop, the print statement<br/>
needs to be inside of the loop or it will not be in scope.

Important note:
1. if you are using `<` or `>` to compare `i` and `array.length`, do not add `-1 `after` array.length`or will
   <br/> result in it not completely reading the array.
2. if you are using `<=` or `>=` to compare `i` and `array.length`, ensure you are using `array.length -1` or will
   <br/> result in an `ArrayIndexOutOfBoundsException` from trying to read a non-existent index.

## Extra thoughts: Integers

I added an extra section for testing out the for loop with integers for displaying. You can use a for loop to <br/>
solve expressions such as the sum, difference, product, and difference between them. The code looping through </br>
the integer is just showing the entire list of integer.

1. They operate slightly different from Strings
   1. if there is nothing in the index, it will place a 0 instead of null
2. You can use the for loop to find the sum within the array

##

For extra practice, we can find the sum of the integers.
