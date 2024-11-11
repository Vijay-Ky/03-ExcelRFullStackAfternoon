class M
{
	public static void main(String[] args)
	{
		boolean flag = true;
		if(flag == true)
		{
			System.out.println("from if");
		}
		System.out.println("end of main");
		System.out.println(flag);

	}
}

/*

1. **Class Declaration**: The program begins with the declaration of a class named `M`.

2. **Main Method Declaration**: Inside the `M` class, there's a `public static void main(String[] args)` method declaration. This method is the entry point of the program and will be executed when the program is run.

3. **Variable Declaration**: Within the `main` method, a boolean variable named `flag` is declared and initialized to `true`.

4. **Conditional Statement (if)**: The program encounters an `if` statement that checks the value of the `flag` variable using the condition `flag == true`. Since `flag` is indeed `true`, the condition evaluates to `true`, and the following block of code is executed.

5. **Print Statement (if block)**: Inside the `if` block, the program prints the text `"from if"` using the `System.out.println()` statement.

6. **Print Statement (after if block)**: The program continues execution after the `if` block and encounters another `System.out.println()` statement, printing the text `"end of main"`.

7. **Print Statement (flag)**: Another `System.out.println()` statement is encountered, this time printing the value of the `flag` variable. Since `flag` was declared as `true`, it will be printed as `true`.

8. **End of Execution**: The `main` method completes its execution, and the program finishes running.

To summarize, the program initializes a boolean variable `flag` with the value `true`. It then enters an `if` statement since the condition `flag == true` is satisfied. Inside the `if` block, it prints `"from if"`. After the `if` block, it prints `"end of main"` and the value of the `flag` variable (`true`). Finally, the program completes its execution.
*/
