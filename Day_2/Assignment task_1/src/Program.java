import java.sql.*;
public class Program {
	public static void main(String args[])
	{
		product ref=new product(1,10,97.5,"NoteBook");
		System.out.println(ref);
		String ss="jdbc:mysql://localhost:3306/bit";
		try(Connection con=DriverManager.getConnection(ss,"root","Nokia@6600"))
		{
			PreparedStatement pst=con.prepareStatement("insert into product values(?,?,?,?)");
			pst.setInt(1,ref.getPid());
			pst.setInt(2,ref.getQty());
			pst.setDouble(3,ref.getCost());
			pst.setString(4,ref.getPname());
			int val=pst.executeUpdate();
			if(val>0)
				System.out.println(val+" record updated");
			ref=null;
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from product");
			rs.next();
			ref=new product(rs.getInt(1),rs.getInt(2),rs.getDouble(3),rs.getString(4));
			System.out.println(ref);			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
