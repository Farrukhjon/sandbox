# Java Exceptions

## Three categories of exceptions:

- Runtime exceptions, a.k.a unchecked exceptions (normally shouldn't try to catch);
- Errors;
- Checked exceptions (must try to catch).
  Where exception come forom:
- JVM exceptions (java.lang.RuntimeException);
- Programmatic exception.

  								 					java.lang.Object
  								 							|
  								 							|
  								 					java.lang.Throwable
  								 							|
  								 							|
  								 				-------------------------
  								 				|						|
  								 				|						|
  							 			java.lang.Error			java.lang.Exception
  								 										|
  								 										|
  								 							java.lang.RuntimeException


- Unchecked exceptions do not need to be declared in a method or constructor's throws
- Errors can’t be directly controlled by code.

What is a runtime exception?

- A runtime exception is a representation of a programming error. These occur
  from inappropriate use of another piece of code. For example, NullPointer-
  Exception is a runtime exception that occurs when a piece of code tries to execute
  some code on a variable that hasn’t been assigned an object and points to
  null. Another example is ArrayIndexOutOfBoundsException, which is thrown
  when a piece of code tries to access an array list element at a nonexistent position.
- A runtime exception is a subclass of java.lang.RuntimeException. Throws checked exception FileNotFoundException
- A runtime exception may not be a part of the method signature, even if a method may throw it.

For examle for runtime exception ClassCastException is thrown when an object fails an IS-A test with the class type to
which it’s being cast

Checked exceptions:

- A checked exception is an unacceptable condition foreseen by the author of a
  method, but outside the immediate control of the code.
- FileNotFoundException is a checked exception. This exception is thrown if the
  file that the code is trying to access can’t be found.
- All checked exceptions are a subclass of the java.lang.Exception class, not a
  subclass of java.lang.RuntimeException. It’s interesting to note, however,
  that the class java.lang.RuntimeException itself is a subclass of the class
  java.lang.Exception.
- If a method calls another method that may throw a checked exception, either it
  must be enclosed within a try-catch block or the method should declare this
  exception to be thrown in its method signature.
  Runtime exceptions:
- Runtime exceptions represent programming errors. These occur from inappropriate
  use of another piece of code. For example, NullPointerException is a
  www.it-ebooks.info
  Review notes 391
  runtime exception that occurs when a piece of code tries to execute some code
  on a variable that hasn’t been assigned an object and points to null. Another
  example is ArrayIndexOutOfBoundsException, which is thrown when a piece of
  code tries to access an array of list elements at a nonexistent position.
- A runtime exception is a subclass of java.lang.RuntimeException.
- A runtime exception isn’t a part of the method signature, even if a method may
  throw it.
- A runtime exception may not necessarily be caught by a try-catch block.
  Errors:
- An error is a serious exception, thrown by the JVM as a result of an error in the
  environment state, which processes your code. For example, NoClassDefFound-
  Error is an error thrown by the JVM when it is unable to locate the .class file it is
  supposed to run.
- StackOverflowError is another error, thrown by the JVM when the size of the
  memory required by the stack of the Java program is greater than what the JRE
  has offered for the Java application. This error usually occurs as a result of infinite
  or highly nested loops.
- An error is a subclass of the class java.lang.Error.
- An error need not be a part of a method signature.
- Though you can handle the errors syntactically, there is little that you can do
  when these errors occur. For example, when the JVM throws OutOfMemory-
  Error, your code execution will halt, even if you define an exception handler
  for it.

Java Exceptions handling Questions & Answers
---

**Q: Root or base class for all Java exception classes?**

The Throwable is root or base class for all type of Exceptions and Errors in Java.

**Q: What is difference between NoClassDefFoundError and ClassNotFoundException?**

Both are caused when missing classes in CLASSPATH.
NoClassDefFoundError:

- Is type of Error and unchecked by nature (does't require try-catch or finally block)
  ClassNotFoundException is thrown when the followings methods are invoked:
- The `Class.forName()` method
- The `ClassLoader.findSystemClass()` method
- The `ClassLoader.loadClass()` method
- Is type of checked exception (requires try-catch or finally block)

**Q: What is the difference between `ArrayIndexOutOfBoundsException` and `StringIndexOutOfBoundsException`?**
Both ArrayIndexOutOfBoundsException and StringIndexOutOfBoundsException:

- Are child of IndexOutOfBoundsException exception
- Cause of both is accessing to the illegal index of the array.
- The index is illegal if it is `negative`, `greater then` or `equal` to the size of the array

**Q: Explain When and Why occurs `ConcurrentModificationException`?**

When:

- When structure of a Collection is modifying during iteration
- An implementation of the Iterator and ListIterator keep track over transient `modCount` variable
- If modCount does not match to the variable `expectedModCount` then ConcurrentModificationException is thrown
  Why
- Violating the rule of `not modofying a Collection during iteration` 