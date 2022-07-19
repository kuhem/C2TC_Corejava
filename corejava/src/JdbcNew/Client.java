package JdbcNew;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import JdbcNew.util.DBUtil;

public class Client {
	public static void main(String[] args)throws SQLException{
		Connection connection=DBUtil.getconnection();
		//checking the connection establishment
		if(connection!=null) {
			System.out.println("JDBC:Connection is established");
		}
		addEmployee();
		GetEmployee();
	}
	//Create operation
	private static void addEmployee() throws SQLException
	{
		Connection connection =DBUtil.getconnection();
		Statement stmt = "insert into employee(name,salary,bonus)"+"values('Hemanth',4000.00,80.00)";)"
	int executeupdate = stmt.executeUpdate(salinsert);
	if(executeupdate==1) {
		System.out.println("Entry is added");
	}
	}
	//Update operation
	private static void UpdateEmployaa() throws SQLException
	{
		Connection connection=DBUtil.getconnection();
		Statement stmt = connection.createStatement();
		String sqlupdate="update employee set bonus=100.00 where id=4";
		int executeupdate = stmt.executeUpdate(sqlupdate);
		if(executeupdate==1) {
			System.out.println("Update is successfull");
		}
	}
	//Delete operation
	private static void DeleteEmployee() throws SQLException
	{
		Connection connection = DBUtil.getconnection();
		Statement stmt = connection.createStatement();
		String sqldelete = "delete from employee where id=4";
		int executeupdate = stmt.executeUpdate(sqldelete);
		if(executeupdate==1) {
			System.out.println("Delete is successfull");
		}
	}
	//Retrive operation
	private static void GetEmployee() throws SQLException{
		Connection connection =DBUtil.getconnection();
		Statement stmt = connection.createStatement();
		String sqlretrieve = "select * from employee";
		ResultSet rs = stmt.executeQuery(sqlretrieve);
		while(rs.next()) {
			int id = rs.getInt("id");
				String name = rs.getString("Name");
				Double salary = rs.getDouble("salary");
				Double bonus = rs.getDouble("bonus");
				System.out.println(id+""+name+""+salary+""+bonus);
		}
	}
	//RetrieveById operation
	private static void RtrieveByIdEmployee() throws SQLException{
		Connection connection = DBUtil.getconnection();
		Statement stmt = connection.createStatement();
		String sqlretieve = "select * from employee where id=3";
		ResultSet rs = stmt.executeQuery(sqlretrieve);
		if(rs.next()) {
			int id = rs.getInt("id");
		String name = rs.getString("name");
		Double salary = rs.getDouble("salary");
		Double bonus = rs.getDouble("bonus");
		System.out.println(id+""+name+""+salary+""+bonus);
		}
	else {
		System.out.println("Employee is not available with the mentioned ID...");
	}
}

		}
	


