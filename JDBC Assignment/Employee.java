package JDBC;

/**
 * 
 * @author Talha Yaseen
 *
 */
public class Employee {
	private int id;
	private String name;
	private int age;
	private String designation;
	private String gender;
	private double salary;
	
	public Employee(int eid, String ename, int eage, String post, String gen, double sal) {
		id = eid;
		name = ename;
		age = eage;
		designation = post;
		gender = gen;
		salary = sal;
	}
	
	public void setEmpID(int eid) {
		id = eid;
	}
	
	public void setName(String ename) {
		name = ename;
	}
	
	public void setAge(int eage) {
		age = eage;
	}
	
	public void setPost(String post) {
		designation = post;
	}
	
	public void setGender(String egen) {
		gender = egen;
	}
	
	public void setSalary(double sal) {
		salary = sal;
	}
	
	public int getEmpID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getPost() {
		return designation;
	}
	
	public String getGender() {
		return gender;
	}
	
	public double getSalary() {
		return salary;
	}
}
