import java.sql.*;
public class App3
{
	public static void main(String args[])
	{
		String ss="jdbc:mysql://localhost:3306/Bit";
		try(Connection con=DriverManager.getConnection(ss,"root","Nokia@6600"))
		{
System.out.println("Implementation class is\t"+con.getClass());
Statement st=con.createStatement();
int val=st.executeUpdate("update dept set loc='bombay'");
if(val>0)
{
	System.out.println(val+" Records updated");
}
else
{
	System.out.println("can not update records");
}	
}
catch(Exception ee)
{
	System.out.println(ee);
}
}
}








						