<<<<<<< HEAD
package mypack;

import java.sql.*;
public class App1 
{
	public static void main(String args[])
	{
		String ss="jdbc:mysql://localhost:3306/bit";
		try(Connection con=DriverManager.getConnection(ss,"root","Nokia@6600"))
		{
System.out.println("Implementation class is\t"+con.getClass()); 
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from dept");
while(rs.next())
{
	int no=rs.getInt("deptno");
	String name=rs.getString("dname");
	String add=rs.getString("loc");
	System.out.println(no+"\t"+name+"\t"+add);
}
}
catch(Exception ee)
{
	System.out.println(ee);
}
}
}	


=======
package mypack;

import java.sql.*;
public class App1 
{
	public static void main(String args[])
	{
		String ss="jdbc:mysql://localhost:3306/bit";
		try(Connection con=DriverManager.getConnection(ss,"root","Nokia@6600"))
		{
System.out.println("Implementation class is\t"+con.getClass()); 
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from dept");
while(rs.next())
{
	int no=rs.getInt("deptno");
	String name=rs.getString("dname");
	String add=rs.getString("loc");
	System.out.println(no+"\t"+name+"\t"+add);
}
}
catch(Exception ee)
{
	System.out.println(ee);
}
}
}	


>>>>>>> 29d7a55012ddbfe3271cc17f2f1ae0434f197a0c
					