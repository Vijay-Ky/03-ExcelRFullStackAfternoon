class H
{
	public static void main(String[] args)
	{
		int i = 0;
		if((i++ == 0) || (i++ == 1))
		{
			System.out.println("from if");
			i++;
		}
		System.out.println("end of main");
		System.out.println(i);
	}
}

/*

1. **Class Declaration and Main Method:**
   - The program starts with the declaration of a class named `H`.
   - Inside the class, there is a `public static void main(String[] args)` method, which serves as the entry point of the program.

2. **Variable Initialization:**
   - Within the `main` method, an integer variable `i` is declared and initialized to 0.
   
3. **Conditional Statement (if):**
   - An `if` statement is used to create a conditional block of code. The condition being checked is `(i++ == 0) || (i++ == 1)`.
   - The `i++` operation is a post-increment operation, which means the value of `i` will be incremented after its current value is used in the expression.

4. **Condition Evaluation:**
   - The condition `(i++ == 0) || (i++ == 1)` is evaluated.
   - The first part of the condition, `(i++ == 0)`, checks whether the current value of `i` (which is 0) is equal to 0. This is true, so the left side of the `||` operator evaluates to `true`.
   - However, due to short-circuit evaluation, the right side of the `||` operator, `(i++ == 1)`, is not evaluated because the whole condition is already determined to be `true` based on the left side.

5. **Print Statement and Increment:**
   - Since the condition is `true`, the code block inside the `if` statement is executed.
   - The line `System.out.println("from if");` prints "from if" to the console.

6. **Increment of i:**
   - After printing "from if," the post-increment operation `i++` is executed twice.
   - First, the value of `i` (which was 0) is incremented to 1, and then it is incremented to 2. This is because the post-increment operation increments the value after it's used in the expression.

7. **End of Main:**
   - The control flow continues after the `if` block.
   - The line `System.out.println("end of main");` prints "end of main" to the console.

8. **Print i:**
   - The line `System.out.println(i);` prints the value of `i` (which is 2) to the console.
   
9. **Program Output:**
   - After the program execution, the following output will be produced:
   
     ```
     from if
     end of main
     2
     ```

In summary, the program initializes a variable `i` to 0, evaluates a condition using the `if` statement (with short-circuit evaluation), increments `i` within the `if` block, prints some messages, and finally prints the value of `i` after the execution of the program.
*/
