package jdbc_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQL_Connection {
// Added jar file
	// mysql-connector-java-8.0.25.jar

	public static void main(String[] args) throws Exception {
//		1] register and load the driver classes
		Class.forName("com.mysql.cj.jdbc.Driver");

//		2] get jdbc connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tejas", "root", "AartiInd@618");

//		3]  create jdbc statement with sql query
		Statement stmt = conn.createStatement();

//		4] execute the query and collect results
		ResultSet rSet = stmt.executeQuery("select * from tejas");

// 		5] process the results
		while (rSet.next()) {
			System.out.println(rSet.getInt("roll") + " " + rSet.getString("name"));
		}

		conn.close();
		stmt.close();

	}

}
