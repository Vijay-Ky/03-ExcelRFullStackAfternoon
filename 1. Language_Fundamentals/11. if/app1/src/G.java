class G
{
	public static void main(String[] args)
	{
		boolean flag = true;
		if(flag)
		{
			System.out.println("from if");
		}
		System.out.println("end of main");
	}
}
/*

1. **Class Declaration**: The program starts with the declaration of a class named `G`.

2. **Main Method**: Inside the class `G`, there is a `main` method declared with the `public static` access modifiers. This method serves as the entry point for the program execution.

3. **Variable Declaration**: Within the `main` method, a boolean variable named `flag` is declared and assigned the value `true`.

4. **Conditional Statement - if**: The program enters a conditional statement (`if`) that checks the value of the `flag` variable. Since the value of `flag` is `true`, the condition is evaluated as `true`, and the code within the `if` block will be executed.

5. **Print Statement (Inside if Block)**: As the condition of the `if` statement is true, the program executes the code block within the `if` block. The statement `System.out.println("from if");` is executed, which prints the string "from if" to the console.

6. **Print Statement (Outside if Block)**: After the execution of the `if` block, the program continues to the next statement outside the `if` block. The statement `System.out.println("end of main");` is executed, printing the string "end of main" to the console.

7. **Program Completion**: The `main` method ends, and the program execution completes. The output of the program will be:
   
   ```
   from if
   end of main
   ```

In summary, the program declares a boolean variable `flag` with a value of `true`. It then uses an `if` statement to check the value of `flag`. Since the value is `true`, the code within the `if` block is executed, printing "from if" to the console. After that, the program continues with the code outside the `if` block, printing "end of main" to the console. Finally, the `main` method completes, and the program execution finishes.
*/
