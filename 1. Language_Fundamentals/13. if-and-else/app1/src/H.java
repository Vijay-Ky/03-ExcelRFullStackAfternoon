class H 
{
	public static void main(String[] args) 
	{
		if(true)
		{
			System.out.println("if");
			if(true)
			{
				System.out.println("inner if");
			}
		}
	}
}
/*

1. **Class Definition**: The program starts with the definition of a class named `H`.

2. **Main Method**: Inside the `H` class, the `public static void main(String[] args)` method is defined. This method is the entry point of the program and will be executed when the program runs.

3. **Outer If Statement**: The program enters an `if` statement with the condition `if(true)`. Since the condition is always `true`, the code inside the `if` block will always execute.

4. **Print Statement - "if"**: Inside the outer `if` block, there is a `System.out.println("if");` statement. This will print the string "if" to the console when executed.

5. **Inner If Statement**: Within the outer `if` block, there's another `if` statement with the condition `if(true)`. Just like the outer `if` block, this inner `if` block will always execute because its condition is also `true`.

6. **Print Statement - "inner if"**: Inside the inner `if` block, there is a `System.out.println("inner if");` statement. This will print the string "inner if" to the console when executed.

7. **Program End**: After the inner `if` block's code is executed, the program's execution comes to an end.

Here's a summary of the program's behavior:
- The program defines a class called `H`.
- Inside the `main` method, an outer `if` block is encountered with a `true` condition, causing its contents to be executed.
- Inside the outer `if` block, a string "if" is printed to the console.
- An inner `if` block is found within the outer `if` block, also with a `true` condition, causing its contents to be executed.
- Inside the inner `if` block, a string "inner if" is printed to the console.
- The program execution finishes after executing the inner `if` block's content.

Please note that the behavior of this program is quite straightforward due to the constant `true` conditions in the `if` statements. In a real-world scenario, conditions in `if` statements are usually based on variables, user input, or other dynamic factors, making the program's behavior more flexible and dependent on the actual conditions.
*/