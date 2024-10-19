package jdbc_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SQL_Connection1 {
// Added jar file	// mysql-connector-java-8.0.25.jar

	public static void main(String[] args) throws Exception {
//		1] register and load the driver classes
		Class.forName("com.mysql.cj.jdbc.Driver");

//		2] get jdbc connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tejas", "root", "AartiInd@618");

//		3]  create jdbc statement with prepared statement
		PreparedStatement stmt = conn.prepareStatement("insert into tejas values (?,?)");

//      4] set the values for the prepared statement parameters
		for (int i = 1; i <= 100; i++) {

			stmt.setInt(1, i);
			stmt.setString(2, ("Tejas " + i));
			stmt.executeUpdate();
		}

//		print the results with the result set
		ResultSet rSet = stmt.executeQuery("select * from tejas");
		while (rSet.next()) {
			System.out.println(rSet.getInt("roll") + " " + rSet.getString("name"));
		}

		System.out.println("The values for the prepared statement parameters");

	}

}
