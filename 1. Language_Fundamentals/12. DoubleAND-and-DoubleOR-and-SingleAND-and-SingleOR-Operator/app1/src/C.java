class C
{
	public static void main(String[] args)
	{
		int i = 0;
		if((i++ == 0) && (i++ == 1))
		{
			System.out.println("from if");
			i++;
		}
		System.out.println("end of main");
		System.out.println(i);
	}
}

/*

1. **Class and Method Definition:**
   - We have a class named `C` with a `public static void main(String[] args)` method, which serves as the entry point of the program.

2. **Variable Initialization:**
   - Inside the `main` method, an integer variable `i` is declared and initialized with the value `0`.

3. **Conditional Statement (if):**
   - A conditional statement (if statement) is used to evaluate a condition and execute code block based on the result.
   
4. **Condition Check (Part 1):**
   - The first part of the condition inside the if statement is `(i++ == 0)`. This condition involves the post-increment operator `i++`.
   - Since `i` is `0` initially, `i++` returns `0` and then increments `i` to `1`.
   - The condition `(0 == 0)` evaluates to `true`, so the program proceeds to the next part of the condition.

5. **Condition Check (Part 2):**
   - The second part of the condition is `(i++ == 1)`.
   - Now, `i` is `1` due to the previous post-increment operation.
   - The post-increment `i++` here returns `1` and then increments `i` to `2`.
   - The condition `(1 == 1)` also evaluates to `true`.

6. **Block Inside if Statement:**
   - Since both parts of the condition evaluate to `true`, the code block inside the if statement is executed.

7. **Print Statement inside if Block:**
   - The statement `System.out.println("from if");` is executed, printing `"from if"` to the console.

8. **Increment i Inside if Block:**
   - The statement `i++;` increments the value of `i` to `3`.

9. **End of if Block:**
   - The block of code inside the if statement is now complete.

10. **Print Statement after if Block:**
    - The statement `System.out.println("end of main");` is executed, printing `"end of main"` to the console.

11. **Print i Value:**
    - The statement `System.out.println(i);` is executed, printing the current value of `i` (which is `3`) to the console.

12. **Program Termination:**
    - The `main` method completes its execution, and the program terminates.

**Output:**
The program will produce the following output:
```
from if
end of main
3
```

**Explanation of Output:**
- The program increments the variable `i` multiple times, both within and outside the if statement.
- The "from if" message is printed because both parts of the condition inside the if statement evaluate to `true`.
- The value of `i` is incremented to `3` due to various post-increment operations.
*/
