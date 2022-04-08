import java.sql.*;
import java.util.*;

class In
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC","IPC");
			Statement sct=con.createStatement();
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your Roll no");
			int id=s.nextInt();
			String str="select * from student where roillno="+id;
			ResultSet rs=sct.executeQuery(str);
			while(rs.next())
			{
				System.out.print(rs.getString(1)+"\t");
				System.out.println(rs.getString(2));
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}