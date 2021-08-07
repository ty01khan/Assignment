package JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/JDBC";
		String username = "root";
		String password = "";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		
		String query = "CREATE TABLE EmployeeDetails (EID INT, Name VARCHAR(50), Age INT, Designation VARCHAR(30), Gender CHAR(1), Salary DOUBLE(10, 2))";
		PreparedStatement pst = con.prepareStatement(query);
		pst.executeUpdate();
		
		Employee e1 = new Employee(1, "Abhinav Kumar Singh", 23, "Data Manager", "M", 650000.00);
		Employee e2 = new Employee(2, "Avinash Kumar SHarma", 40, "Product Manager", "M", 2500000.00);
		Employee e3 = new Employee(3, "Shruti Mandana", 35, "Project Leader", "F", 1600000.00);
		Employee e4 = new Employee(4, "Srijon Pal", 55, "Company Manager", "M", 4500000.00);
		Employee e5 = new Employee(5, "Harsh Raj", 25, "SDE-2", "M", 1800000.00);
		Employee e6 = new Employee(6, "Akhilesh Patidar", 32, "SDE-3", "M", 2000000.00);
		
		List <Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		
		query = "INSERT INTO EmployeeDetails VALUES " + " (?, ?, ?, ?, ?, ?) ;";
		pst = con.prepareStatement(query);
		con.setAutoCommit(false);
		
		Iterator <Employee> i = empList.iterator();
		while(i.hasNext()) {
			Employee e = (Employee) i.next();
			pst.setInt(1, e.getEmpID());
			pst.setString(2, e.getName());
			pst.setInt(3, e.getAge());
			pst.setString(4, e.getPost());
			pst.setString(5,  e.getGender());
			pst.setDouble(6, e.getSalary());
			
			pst.addBatch();
		}
		
		pst.executeBatch();
		con.commit();
		con.setAutoCommit(true);
		
		query = "SELECT * FROM EmployeeDetails ORDER BY Age";
		pst = con.prepareStatement(query);
		ResultSet rs = pst.executeQuery();
		
		System.out.printf("%5s\t%13s\t%3s\t%11s\t%6s\t%6s\n\n", "Employee ID", "Employee Name", "Age", "Designation", "Gender", "Salary");
		while(rs.next()) {
			int id = rs.getInt("EID");
			String name = rs.getString("Name");
			int age = rs.getInt("Age");
			String post = rs.getString("Designation");
			String gender = rs.getString("Gender");
			double salary = rs.getDouble("Salary");
			
			System.out.printf("%5d\t%17s\t%3d\t%11s\t%3s\t%2.2f\n", id, name, age, post, gender, salary);
		}
		
		pst.close();
		con.close();
	}

}
