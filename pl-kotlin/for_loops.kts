
    var intArray = arrayOf(10, 20, 30, 40, 50, 60, 70);

    //Index way for-loop iteration:
    println("Index way for-loop demo by .indices:")
    for (i in intArray.indices) {
        println("index = $i, item = ${intArray[i]}")
    }
    
    //Index way for-loop iteration:
    println("Index way for-loop demo by .withIndex():")
    for ((index, value) in intArray.withIndex()) {
        println("index = $index, item = $value")
    }


    //For-each way for-loop iteration:
    println("for-each loop demo:")
    for (i in intArray) {
        println("item = $i")
    }

    //Range way for-loop iteration:
    println("range loop demo:")
    var range = 0..intArray.size - 1
    for (i in range) {
        println("item = ${intArray[i]}")
    }

