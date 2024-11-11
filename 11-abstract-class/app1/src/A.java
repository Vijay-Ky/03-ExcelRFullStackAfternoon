abstract class A
{
	void test1()
	{
	}
	abstract void test2();
}

/*
1. Hiding implementation details is nothing but abstraction. 
2. Highlight the set of services what we offer. 
2. The main advantages of abstraction are we can achieve security as we are not highlighting internal implementation.
3. Hiding un-neccessary details.
4. An abstract class is a class that is declared with an abstract keyword.
5. An abstract method is a method that is declared without implementation.
6. An abstract class may or may not have all abstract methods. Some of them can be concrete methods.
7. There can be no object of an abstract class. That is, an abstract class can not be directly instantiated with the new operator.
8. abstract is a keyword
9. abstraction is one of the object orieted programming piller.
10. Hiding the internal implementation details just showing the functionality.
11. we can declare class as abstract.
12. abstract class can become a member of the java file.
13. in one java file we can develop any no. of abstract classes.
14. for abstract class class also javac compiler will be producing .class file
15. abstract class can have abstract methods and non-abstract methods.
16. if at least one abstract method is there then compulsary class must be declared as abstract.
17. if a method doesnt have a body then compulary we should declare it as abstract.
18. even if we dont have any abstract method in a class we can declare that class as abstract, but its not recommended, since we cant create object for an abstract class. so use the abstract keyword for a class as required, not every time.
*/