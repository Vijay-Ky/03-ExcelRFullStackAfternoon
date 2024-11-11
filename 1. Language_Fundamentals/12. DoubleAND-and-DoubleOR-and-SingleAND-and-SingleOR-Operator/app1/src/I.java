class I
{
	public static void main(String[] args)
	{
		int i = 0;
		if((i++ == 1) || (i++ == 1))
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
   The program begins with the declaration of a class named `I`. Inside this class, there is a `public static void main(String[] args)` method, which is the entry point of the program.

2. **Variable Initialization:**
   Inside the `main` method, an integer variable `i` is declared and initialized to 0. This variable will be used to track the value of the integer throughout the program.

3. **If Statement Condition:**
   An `if` statement is used to check a condition. The condition consists of two parts separated by the logical OR (`||`) operator:
   - The first part is `(i++ == 1)`, which evaluates to `false` since the current value of `i` is 0 and the post-increment operation `i++` returns the original value before incrementing.
   - The second part is `(i++ == 1)`, which is also `false` for the same reason.

4. **If Block Execution:**
   Since the condition in the `if` statement evaluates to `false`, the code inside the `if` block is not executed. The program skips the block enclosed in the curly braces `{}`.

5. **Print Statement Outside If Block:**
   After the `if` statement, the program encounters the line `System.out.println("end of main");`. This line prints the text "end of main" to the console.

6. **Incrementing the Variable:**
   The value of `i` is incremented by 1 using the post-increment operation `i++`.

7. **Print Statement for Variable `i`:**
   The line `System.out.println(i);` prints the value of `i` to the console. At this point, the value of `i` is 1 due to the increment operation in the previous step.

8. **Program Output:**
   When the program is executed, the following output is produced:
   
   ```
   end of main
   1
   ```

In summary, the program initializes an integer variable `i` to 0. It then uses an `if` statement to evaluate two conditions, both of which evaluate to `false`. As a result, the code inside the `if` block is not executed. The program proceeds to print "end of main" and the value of `i`, which is 1 after the increment operation.
*/
