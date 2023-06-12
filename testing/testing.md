# Unit Testing and Test Driven Development

## Literature and Resources

- [Test-driven development - wiki](https://en.wikipedia.org/wiki/Test-driven_development)
- [Test Driven Development By Example, by K. Beck](https://learning.oreilly.com/library/view/test-driven-development/0321146530/)
- [Growing Object-Oriented Software, Guided by Tests, by N. Pryce](https://learning.oreilly.com/library/view/growing-object-oriented-software/9780321574442/)
- [Effective Unit Testing: A guide for Java Developers, by L. Koskela](https://www.safaribooksonline.com/library/view/effective-unit-testing/9781935182573/)
- [The Art of Unit Testing, Second Edition, by R. Osherove](https://learning.oreilly.com/library/view/the-art-of/9781617290893/)
- [xUnit Test Patterns: Refactoring Test Code, by G. Meszaros](https://www.safaribooksonline.com/library/view/xunit-test-patterns/9780131495050/)

## TDD

### Cycle of the TDD

- Write a test for: new feature
- Runs the test
- Write code for the test
- Run the test
- Refactor the code
- Repeat above steps

### Test Doubles objects

- Dummy object
- Stub object
- Mock object
- Spy object
- Fake object

### Patterns of Test-Driven Development

## Questions & Answers

### Test Driven Development (TDD) and Behavior Driven Development (BDD)

**Q: What benefits the tests give to us in general?**

Testing - is a `design` tool and `quality` tool at the same time

- Help us to catch mistakes
- Shape our design to actual use
- Help us to meet right behavior and requirements to the application

**Q: What is the `Test Smells`?**

- Code Smells
    - Obscure Test/Long Test/Complex Test/Verbose Test - It's difficult to understand the test at the glance.
    - Conditional Test Logic - A test contains a code that may or may not be executed
    - Hard-to-Test Code
    - Test Code Duplication
    - Test Logic in Production
- Behavior Smells
- Project Smells

**Q: Test as Documentation?**

**Q: Test as Execution of a Specification?**

### Unit Testing

**Q: What is the `Testing Doubles` objects?**

Testing Doubles objects help you `isolate the code under test` from `its collaborators` so that you can test all facets
of its behavior.

Q: What are the most common `Testable Issues` in Unit Testing?

- Can't instantiate a class
- Can't invoke a `private` method
- Can't observe the outcome right result
- Can't substitute a collaborator
- Can't override a method

### Component Testing

### Integration Testing