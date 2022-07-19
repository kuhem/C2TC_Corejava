package JdbcNew;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbcDriver");//step 2 class loader	
try {
	Connection con=DriverManager.getConnection("jdbc:mysql://lacalhost:3306/hemanth","root","root");//step 3 create connection
	Statement st=con.createStatement();//step 4
	String quert1="insert into emp1 values(3,'hemanth')";
	String query="select*from emp1";
	ResultSet rs=st.executeQuery("SELECT*from emp1");
	while(rs.next())
	{
		System.out.println(rs.getString(1));// First Column
        System.out.println(rs.getString(2));// Second Column
        System.out.println(rs.getString(3));//Third Column
	}
	st.executeUpdate(query);
	System.out.println("Student Table created successfully");
	System.out.println("row inserted susccessfully");
	st.close();
	con.close();
}catch(SQLException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
}
	}
	
}
