import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class EmployeeMain{
	
	public static void main(String[] args){
		List<Employee> list = Arrays.asList(
		new Employee("Dhanush",20,20000),
		new Employee("gowda",22,30000),
		new Employee("jhon",25,23000),
		new Employee("sith",26,40000),
		new Employee("tom",28,45000),
		new Employee("alex",30,120000)
		);	
		
		OptionalDouble averageSal = list.stream().filter(e -> e.age >20 && e.age<26).mapToDouble(Employee::getSalary).average();
		System.out.println(averageSal.getAsDouble());
		
	}
	
}

class Employee {
	
	String name ;
	int age ;
	double salary;
	
	public Employee(String name , int age , int salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public String getName(){
	return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public double getSalary(){
		return salary;
	}
	
	
}