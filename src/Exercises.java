import java.util.ArrayList;
import java.util.*;

public class Exercises {

	public boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {
		if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
			return false;
		}
		// write your code here

		if(a.get(a.size() - 1) == b.get(b.size() - 1) || a.get(0) == b.get(0)){
			return true;
		}
		
		return false;	// default return value to ensure compilation
	}
	
	public ArrayList<String> endsMeet(ArrayList<String> values, int n) {
		// write your code here
		
		

		return null;	// default return value to ensure compilation
	}
	
	public int difference(ArrayList<Integer> numbers) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
	
	public double biggest(ArrayList<Double> numbers) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
	
	public ArrayList<String> middle(ArrayList<String> values) {
		// write your code here
		
		return null;	// default return value to ensure compilation
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean consecutive(ArrayList<Integer> numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean balance(ArrayList<Integer> numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public int clumps(ArrayList<String> values) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}

	public static void main(String[] args){ 
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);
		System.out.println(cars.size());
		cars.remove(2);
		System.out.println(cars);
		System.out.println(cars.size());

	}

}
