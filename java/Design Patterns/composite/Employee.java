package composite;

import java.util.ArrayList;
import java.util.List;
//һ����֯��Ա���Ĳ�νṹ
public class Employee {
	private String name;
	private String dept;
	private int salary;
	private List<Employee> subordinates;
	
	public Employee(String name, String dept, int sal) {
		this.name = name;
		this.dept = dept;
		this.salary = sal;
		subordinates = new ArrayList<Employee>();
	}
	
	public void add(Employee emplyee) {
		subordinates.add(emplyee);
	}
	
	public List<Employee> getSubordinates(){
		return subordinates;
	}
	
	public String toString() {
		return ("Employee :{Name: "+name+", dept: "+dept+", salary:"+salary+"}");
	}
	public static void main(String[] args) {
		Employee CEO = new Employee("John", "CEO", 30000);
		
		Employee headSales = new Employee("Robert", "Head Sale", 20000);
		Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);
		
		Employee clerk1 = new Employee("Laura", "Marketing", 10000);
		Employee clerk2 = new Employee("Bob", "Marketing", 10000);
		
		Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
		Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);
		
		CEO.add(headSales);
		CEO.add(headMarketing);

		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);
		
		headMarketing.add(clerk1);
		headMarketing.add(clerk2);
	
		System.out.println(CEO);
		for (Employee HeadEmployee: CEO.getSubordinates()) {
			System.out.println(headMarketing);
			for (Employee employee : HeadEmployee.getSubordinates()) {
				System.out.println(employee);
			}
		}
	}
}
