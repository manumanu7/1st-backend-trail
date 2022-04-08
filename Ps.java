//prepared statements
import java.sql.*;
import java.util.*;

class Ps
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC","IPC");
			PreparedStatement sct=con.prepareStatement("insert into student values(?,?)");
			Scanner sc=new Scanner(System.in);
			sct.setInt(1,sc.nextInt());
			sct.setString(2,sc.next());
			int a=sct.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
			