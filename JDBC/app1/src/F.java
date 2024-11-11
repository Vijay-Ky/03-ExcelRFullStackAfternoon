import java.sql.*;
import java.util.Scanner;
class F 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);//creating the scanner object
		System.out.println("Please enter id");
		String id = sc.next();
		System.out.println("Please enter name");
		String name = sc.next();
		System.out.println("Please enter age");
		String age = sc.next();
		String sql = "INSERT INTO PERSON VALUES(" + id + ", '" + name +"'," + age +")";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/excelr", "president", "admin");
		Statement stmt = con.createStatement();
		stmt.execute(sql);
		System.out.println("done");
	}
}
/*
1.SQL Developer completely written in Java.


Important Notes for Working on JDBC with MySQL
-----------------------------------------------
1. Download and install mysql-installer-community-8.0.12.0 
   https://downloads.mysql.com/archives/get/p/25/file/mysql-installer-community-8.0.12.0.msi
   (go for customized installation)
   (click on execute)
   (Download and Install VC_redist.x64.exe 2015 and 2017 )
2. Download JDBC connector from https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.12
3. set the classpath for jar file in the env variables
   CLASSPATH=C:\Program Files\MySQL\mysql-connector-java-8.0.12.jar
4. check the class path by using 
   javap com.mysql.jdbc.Driver
5. use the directory structure app1/src classes
   javac -d ../classes File.java
   (dont use -cp bcz it will override the classpath)
   go to classes folder instead 
   cd ../classes
   classes> FileName
6. Example 
import java.sql.*;  
class A{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/Aptech","root","admin");  
//here Aptech is database name, root is username and password  
Statement stmt=con.createStatement();  
String sql1 = "INSERT INTO STUDENT VALUES(101,'vijay')";
//"INSERT INTO STUDENT VALUES(" + 101 + ", '" + vijay +"')";  
stmt.execute(sql1);
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  

*/