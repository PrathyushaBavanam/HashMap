package Map;


import java.util.HashSet;
import java.util.Set;


public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 emp1 = new Employee1(1);
		Employee1 emp2 = new Employee1(1);
		
		Set<Employee1> set = new HashSet<Employee1>();
		set.add(emp1);
		set.add(emp2);
		System.out.println(set.size());
		
		Integer i = new Integer(1);
		Integer i1 = new Integer(1);
		
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(i);
		set1.add(i1);
		System.out.println(set1.size());
	}

}

class Employee1{
	int id;
	public Employee1(int id) {
		this.id = id;
	}
	
}