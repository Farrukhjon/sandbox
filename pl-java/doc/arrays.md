# Arrays in Java

<!-- TOC -->
* [Arrays in Java](#arrays-in-java)
  * [Literature and Resources](#literature-and-resources)
  * [Array](#array)
    * [Length/size](#lengthsize)
    * [Elements](#elements)
    * [Indices](#indices)
    * [Creating an array](#creating-an-array)
      * [Declaration of an array](#declaration-of-an-array)
      * [Declaration and memory allocation of an array](#declaration-and-memory-allocation-of-an-array)
    * [Initializing an array](#initializing-an-array)
    * [Create and initialize an array](#create-and-initialize-an-array)
    * [Accessing an array](#accessing-an-array)
    * [Creating multidimensional array](#creating-multidimensional-array)
    * [Copying arrays](#copying-arrays)
    * [Other Operations on array](#other-operations-on-array)
      * [Iterating an array (forward and backward)](#iterating-an-array-forward-and-backward)
      * [Searching an element in an array](#searching-an-element-in-an-array)
      * [Sorting elements of an array](#sorting-elements-of-an-array)
      * [Comparing two arrays](#comparing-two-arrays)
      * [Filling an array](#filling-an-array)
      * [Converting an array to a string](#converting-an-array-to-a-string)
    * [Exceptions thrown on working on arrays](#exceptions-thrown-on-working-on-arrays)
      * [IndexOutOfBoundsException](#indexoutofboundsexception)
      * [ArrayStoreException](#arraystoreexception)
<!-- TOC -->

## Literature and Resources

- [The Java Tutorials. Arrays](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)
- [JavaSE 8 API/System](https://docs.oracle.com/javase/8/docs/api/java/lang/System.html)
- [JavaSE 8 API/Array](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Array.html)
- [JavaSE 8 API/Arrays](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html)

## Array

    An array is a container object that holds a fixed number of values of a single type.    

### Length/size

     - The length of an array is established when the array is created.
     - After creation, its length is fixed.

### Elements

    Each item in an array is called an element.

### Indices

     - Each element is accessed by its numerical index.
     - Numbering of the indecies begins with 0.
     - An Nth element would be accessed at Nth - 1 index.

### Creating an array

#### Declaration of an array

    <type>[] variable (e.g: int[] intArray)

#### Declaration and memory allocation of an array

    <type>[] variable = new <type>[size] (e.g.: int[] intArray = new int[10])

### Initializing an array

    variable[index] = value (e.g.: intArray[0] = 100)

### Create and initialize an array
    <type>[] varibale  = {val1, val2, valN}
    E.G: int[] intArray = {100, 101, 102}; //The length of the array is determined by the number of values provided between braces.

### Accessing an array

    int anItem100 = intArray[0]; // 100
    int anItem102 = intArray[2]; // 102

### Creating multidimensional array

    int[][] matrix;
    int[][] matrix = {
        {100, 200, 300},
        {101, 201, 301}
    };
    int[] row0 = matrix[0]; // int[3] row0 = {100, 200, 300}
    int[] row1 = matrix[1]; // int[3] row1 = {101, 201, 301}

### Copying arrays

    void System.arraycopy(srcArray, srcStartPos, destArray, destStartPos, numberOfArrayElementsToCopy)

    [] Arrays.copyOf(originalArrayToCopy, newLength) // Copies the originalArrayToCopy array, truncating or padding with zeros/null (if necessary) so the retruned copy array has the newLength length.

### Other Operations on array

- Iterating an array (forward and backward)
- Searching an element in an array
- Sorting elements of an array
- Comparing two arrays
- Filling an array
- Converting an array to a string

#### Iterating an array (forward and backward)

#### Searching an element in an array

#### Sorting elements of an array

    Arrays.sort()

#### Comparing two arrays

#### Filling an array

#### Converting an array to a string

    Arrays.toString(char [] a)

### Exceptions thrown on working on arrays

#### IndexOutOfBoundsException

    Thrown for example, if copying operaton/method would cause access of data outside array bounds.

#### ArrayStoreException

    Thrown for example, on coping array, if an element in the src array could not be stored into the dest array because of a type mismatch.
