import java.sql.*;
import java.util.*;
public class program {

	public static void main(String[] args) 
	{
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter the desig");
					String desig=sc.next();
					String ss="jdbc:mysql://localhost:3306/bit";
				try {
					Connection con=DriverManager.getConnection(ss,"root","Nokia@6600");
					PreparedStatement pst=con.prepareStatement("select * from Employe where desig=?");
					pst.setString(1, desig);
					ResultSet rs=pst.executeQuery();
					while(rs.next()) 
					{
						System.out.println("empid= "+rs.getInt("empid")+" ename= "+rs.getString("ename"));
					}
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	
		
	}

}
