class Animal
{
	void animalName()
	{
		System.out.println("Animal Name");
	}
}
class Human
{
	void humanName()
	{
		System.out.println("Human Name");
	}
}
//multiple inheritance is not allowed in java
class Creature extends Animal, Human
{
	public static void main(String[] args)
	{
		Creature c = new Creature();
		c.animalName();
		c.humanName();
	}
}