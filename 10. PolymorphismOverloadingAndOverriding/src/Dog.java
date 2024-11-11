class Animal
{
	static void makeSound()
	{
		System.out.println("Generic Animal Sound");
	}
}
class Dog extends Animal
{
	static void makeSound()
	{
		System.out.println("Bark");
	}

	public static void main(String[] args)
	{
		Animal animal1 = new Animal();
		Dog dog = new Dog();

		animal1.makeSound();
		dog.makeSound();

		Animal animal2 = new Dog();
		animal2.makeSound();
	}
}
/*
1. In Java, static members(fields or methods) belong to the class itself rather than to any specific object of the class.
2. static methods are bound at compile time based on the type of the reference, not the type of the object.
3. static members are processed at the compile time(static binding). whereas non-static members are processed at the run time(dynamic binding)
4. when you are performing polymorphism that mechanism works based on run-time(objects are going to be created), polymorphism refers to non-static members not the static members.
5. which is why we say that static members are not involving in polymorphism.
   or static members do not participate in polymorphism.
*/