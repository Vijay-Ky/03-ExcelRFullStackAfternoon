//importing all the members seperately
import java.sql.DriverManager;//class
import java.sql.SQLException;//class
import java.sql.Connection;//interface
import java.sql.Statement;//interface
import java.sql.ResultSet;//interface
import java.sql.ResultSetMetaData;//interface
class M2 
{
	//no need of keeping throws Exception bcz of keeping try and catch
	//if you did not keep throws Exception
	  // should keep try catch wherever checked type of exception is there
	public static void main(String[] args) 
	{
		//1. Registering driver
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		//if any member declare before try that can be used inside a try and also inside a finally
		//these are local variables.
		//we cant initialize DriverManager straightaway here
		  //con = DriverManager.getConnection(url, un, pw);
		    //this statement requires a try catch
		//we are initializing these local variables with
		  //default value null(for references default value)
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try
		{
			//not requires SQL Exception
			String url = "jdbc:mysql://localhost:3306/excelr";
			//not requires SQL Exception
			String un = "president";
			//not requires SQL Exception
			String pw = "admin";
			//2. establishing database connection
			//requires SQL Exception
			con = DriverManager.getConnection(url, un, pw);
			//3. create statement
			//requires SQL Exception
			stmt = con.createStatement();
			//4. compose sql command
			//not requires SQL Exception
			String sql = "SELECT * FROM PERSON";
			//5. triggering sql command
			//requires SQL Exception
			//sending sql command to the database
			rs = stmt.executeQuery(sql);
			//requires SQL Exception
			ResultSetMetaData rsmd = rs.getMetaData();
			int cols = rsmd.getColumnCount();
			for (int i = 1; i <= cols; i++)
			{
				System.out.print(rsmd.getColumnName(i) + "\t");
			}
			System.out.println();
			System.out.println("--------------------");
			while(rs.next())
			{
				for (int i = 1; i <= cols; i++)
				{
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
			}
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		//once sql command sent to the database
		  //we dont require connection and statement object any more
		  //we should try to close connection and statement without fail.
		  //for closing connection without fail we are using finally block.
		finally
		{
			try
			{
				if(rs != null)
				{
					rs.close();
					rs = null;
				}
			}
			catch (SQLException ex)
			{
				ex.printStackTrace();
			}
			//we are trying to close first statement then connection
			  //reason is by using connection only statement is derived
			//inside try in which order you have opened the resources
			  //for that order in the opposite way we should close in the finally block
			// in the finally block dont close all the connection with the same try
			  //one try-catch for closing one resource another try-catch for closing another resource.
			try
			{
				//checking whether stmt realy initialized or not
				 //if not initialized dont close
				//if it is null we get NullPointerException to avoid that.
				if(stmt != null)
				{
					//while closing statement if we get any Exception then it wont be continueing further in the same try
					  // thats why we should go for different try-catches for different resources.
					stmt.close();
					//after assigning to null stmt object is eligible for garbage collection
					stmt = null;
				}
			}
			//in order to call close() SQLException
			catch (SQLException ex)
			{
				ex.printStackTrace();
			}
			try
			{
				if(con != null)
				{
					con.close();
					con = null;
				}
			}
			catch (SQLException ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("done");
	}
}
/*public class DriverManager
extends Object
The basic service for managing a set of JDBC drivers.
*/
/*
public class SQLException
extends Exception
implements Iterable<Throwable>
An exception that provides information on a database access error or other errors.
*/
/*
public interface Connection
extends Wrapper, AutoCloseable
A connection (session) with a specific database. SQL statements are executed and results are returned within the context of a connection.

A Connection object's database is able to provide information describing its tables, its supported SQL grammar, its stored procedures, the capabilities of this connection, and so on. This information is obtained with the getMetaData method.
*/
/*
public interface Statement
extends Wrapper, AutoCloseable
The object used for executing a static SQL statement and returning the results it produces.

By default, only one ResultSet object per Statement object can be open at the same time. Therefore, if the reading of one ResultSet object is interleaved with the reading of another, each must have been generated by different Statement objects. All execution methods in the Statement interface implicitly close a statment's current ResultSet object if an open one exists.
*/
/*
What are checked exceptions?
Checked exceptions are checked at compile-time.
It means if a method is throwing a checked exception 
then it should handle the exception using try-catch block or
it should declare the exception using throws keyword, 
otherwise the program will give a compilation error.

Generally, checked exceptions denote error scenarios which 
are outside the immediate control of the program. ... 
Checked exceptions are subclasses of Exception class. 
Example of checked exceptions are : ClassNotFoundException, 
IOException, SQLException and so on.
*/

/*
The printStackTrace() method in Java is a tool used to 
handle exceptions and errors. It is a method of Java's 
throwable class which prints the throwable along with other 
details like the line number and class name where the exception 
occurred.
*/
