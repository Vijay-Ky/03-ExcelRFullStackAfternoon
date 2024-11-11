class Dog
{
	//variables, datamembers, properties, attributes, field
	String name; 
	String color;
	int age;
	double weight;
	String breed;
	String gender;
	String nature;

	Dog(String dogName, String dogColor, int dogAge, double dogWeight, String dogBreed, String dogGender)
	{
		name = dogName;
		color = dogColor;
		age = dogAge;
		weight = dogWeight;
		breed = dogBreed;
		gender = dogGender;
		//nature = dogNature;
	}

	{
		nature = "animal";
	}

	//behaviours, member-functions
	void bark()
	{
		System.out.println("This dog barks..!!");
	}
	
	void bite()
	{
		System.out.println("This dog bites..!!");
	}

	void chaseCat()
	{
		System.out.println("This dog chases cat..!!");
	}

	void obeyOrders()
	{
		System.out.println("This dog chases obeys Orders.!!");
	}

	public static void main(String[] args)
	{
		Dog dog1 = new Dog("baby", "black", 2, 7.5, "IndianPeriah", "female");
		System.out.println("-----");
		System.out.println(dog1.name);
		System.out.println(dog1.color);
		System.out.println(dog1.age);
		System.out.println(dog1.breed);
		System.out.println(dog1.gender);
		System.out.println(dog1.weight);
		System.out.println("-----");
		dog1.bark();
		dog1.chaseCat();
	}
}