package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(5);
		
		Map<Employee, String> map = new HashMap<Employee, String>();
		map.put(emp1, "Jack");
		map.put(emp2, "Jack");
		System.out.println(map.size());

		Map<String, String> map3 = new HashMap<String, String>();
		map3.put(null, "4");
		map3.put("jhk", "jgfjhg");
		int h = map3.hashCode();
		System.out.println(h);
		
		
		
		Integer i = new Integer(1);
		Integer i1 = new Integer(1);
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(i, "One");
		map1.put(i1, "One");
		System.out.println(map1.size());
	}

}

class Employee{
	int id;
	public Employee(int id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}
	
}