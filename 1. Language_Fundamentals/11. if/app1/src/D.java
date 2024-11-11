class D
{
	public static void main(String[] args)
	{
		int i = 10;
		if(i == 10)
		{
			System.out.println("from if");
		}
		System.out.println("end of main");
	}
}
/*


1. **Class Declaration and Main Method:**
   ```java
   class D
   {
       public static void main(String[] args)
       {
   ```
   The program begins with the declaration of a class named `D`. Inside the class, there is a `main` method, which serves as the entry point for the program execution. The `main` method is declared as `public`, which means it can be accessed from outside the class.

2. **Variable Declaration and Initialization:**
   ```java
       int i = 10;
   ```
   Inside the `main` method, an integer variable `i` is declared and initialized with the value `10`. The variable `i` will be used for the subsequent conditional check.

3. **Conditional Statement - `if` Block:**
   ```java
       if(i == 10)
       {
   ```
   This is the beginning of an `if` statement. It checks if the value of the variable `i` is equal to `10`. If the condition is true, the code inside the `if` block will be executed; otherwise, it will be skipped.

4. **Printing from the `if` Block:**
   ```java
           System.out.println("from if");
   ```
   Within the `if` block, this line prints the string "from if" to the console if the condition (`i == 10`) is true.

5. **End of `if` Block:**
   ```java
       }
   ```
   This marks the end of the `if` block. Any code outside the `if` block will be executed regardless of whether the condition was true or false.

6. **Printing Outside the `if` Block:**
   ```java
       System.out.println("end of main");
   ```
   This line is outside the `if` block and will always be executed regardless of the condition's outcome. It prints the string "end of main" to the console.

7. **Method Closing and Class Closing:**
   ```java
       }
   }
   ```
   These closing curly braces mark the end of the `main` method and the `D` class, respectively.

**Summary:**
The provided Java program declares a class named `D` with a `main` method. Inside the `main` method, an integer variable `i` is initialized to `10`. Then, an `if` statement checks if `i` is equal to `10`. If the condition is true, it prints "from if" to the console. Regardless of the condition's outcome, the program prints "end of main" to the console. The program execution ends after this.
*/