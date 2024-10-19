package jdbc_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SQL_Connection2 {
	// Database connection details
	static final String JDBC_URL = "jdbc:mysql://localhost:3306/tejas"; // Update with your DB details
	static final String JDBC_USER = "root"; // Update with your DB user
	static final String JDBC_PASSWORD = "AartiInd@618"; // Update with your DB password

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;

		try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
			while (choice != 5) {
				System.out.println("Choose an option:");
				System.out.println("1. Insert Record");
				System.out.println("2. Read Record");
				System.out.println("3. Update Record");
				System.out.println("4. Delete Record");
				System.out.println("5. Exit");

				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					insertRecord(conn, scanner);
					break;
				case 2:
					readRecord(conn, scanner);
					break;
				case 3:
					updateRecord(conn, scanner);
					break;
				case 4:
					deleteRecord(conn, scanner);
					break;
				case 5:
					System.out.println("Exiting...");
					break;
				default:
					System.out.println("Invalid choice! Please select again.");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Insert record method
	private static void insertRecord(Connection conn, Scanner scanner) throws SQLException {
		String query = "INSERT INTO tejas (roll, name) VALUES (?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(query);

		System.out.println("Enter roll number: ");
		int roll = scanner.nextInt();
		System.out.println("Enter name: ");
		String name = scanner.next();

		pstmt.setInt(1, roll);
		pstmt.setString(2, name);

		int rowsInserted = pstmt.executeUpdate();
		if (rowsInserted > 0) {
			System.out.println("Record inserted successfully!");
		}
	}

	// Read record method
	private static void readRecord(Connection conn, Scanner scanner) throws SQLException {
		String query = "SELECT * FROM tejas WHERE roll = ?";
		PreparedStatement pstmt = conn.prepareStatement(query);

		System.out.println("Enter roll number to read: ");
		int roll = scanner.nextInt();

		pstmt.setInt(1, roll);

		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			System.out.println("Roll: " + rs.getInt("roll") + ", Name: " + rs.getString("name"));
		} else {
			System.out.println("No record found with roll number " + roll);
		}
	}

	// Update record method
	private static void updateRecord(Connection conn, Scanner scanner) throws SQLException {
		String query = "UPDATE tejas SET name = ? WHERE roll = ?";
		PreparedStatement pstmt = conn.prepareStatement(query);

		System.out.println("Enter roll number to update: ");
		int roll = scanner.nextInt();
		System.out.println("Enter new name: ");
		String newName = scanner.next();

		pstmt.setString(1, newName);
		pstmt.setInt(2, roll);

		int rowsUpdated = pstmt.executeUpdate();
		if (rowsUpdated > 0) {
			System.out.println("Record updated successfully!");
		} else {
			System.out.println("No record found with roll number " + roll);
		}
	}

	// Delete record method
	private static void deleteRecord(Connection conn, Scanner scanner) throws SQLException {
		String query = "DELETE FROM tejas WHERE roll = ?";
		PreparedStatement pstmt = conn.prepareStatement(query);

		System.out.println("Enter roll number to delete: ");
		int roll = scanner.nextInt();

		pstmt.setInt(1, roll);

		int rowsDeleted = pstmt.executeUpdate();
		if (rowsDeleted > 0) {
			System.out.println("Record deleted successfully!");
		} else {
			System.out.println("No record found with roll number " + roll);
		}
	}
}
