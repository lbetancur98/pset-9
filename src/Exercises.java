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
		
		if(values == null || n > values.size() || n < -1){
			return new ArrayList<String>();
		}

		ArrayList<String> result =  new ArrayList<String>();

		for(int i = 0; i < n; i++){
			result.add(values.get(i));
		}

		for(int i = values.size() - n; i < values.size(); i++){
			result.add(values.get(i));
		}

		

		return result;	// default return value to ensure compilation
	}
	
	public int difference(ArrayList<Integer> numbers) {
		// write your code here

		if(numbers == null || numbers.size() < 1){
			return -1;
		}

		int bigger = numbers.get(0);
		int smaller = numbers.get(0);
		

		for(int i = 0; i < numbers.size(); i++){
			if(numbers.get(i) > bigger){
				bigger = numbers.get(i);
			}
			if(numbers.get(i) < smaller){
				smaller = numbers.get(i);
			}
		}
		

	
		return bigger - smaller;		// default return value to ensure compilation
	}
	
	public double biggest(ArrayList<Double> numbers) {
		// write your code here

		
		if(numbers == null || numbers.size() < 3 || numbers.size() % 2 == 0){
			return -1;
		}

		for(int i = 0; i < numbers.size(); i++){
			if(numbers.get(i) < 0){
				return -1;
			}
		}

		double first = numbers.get(0);
		double last = numbers.get(numbers.size() - 1);
		double middle = numbers.get(numbers.size() / 2);

		if(first > middle && first < last){
			return first;
		} else if (last > middle && last > first){
			return last;
		} else if (middle > last && middle > first){
			return middle;
		}
		
		return first;		// default return value to ensure compilation
	}
	
	public ArrayList<String> middle(ArrayList<String> values) {
		// write your code here

		if(values == null || values.size() < 3 || values.size() % 2 == 0){
			return new ArrayList<String>();
		}

		for(int i = 0; i < values.size(); i++){
			if(values.get(i) == null){
				return new ArrayList<String>();
			}
		}

		ArrayList<String> result = new ArrayList<String>();
		String middle = values.get(values.size() / 2);
		String leftMiddle = values.get((values.size() / 2) -1);
		String rightMiddle = values.get((values.size() / 2) +1);

		result.add(leftMiddle);
		result.add(middle);
		result.add(rightMiddle);


		
		return result;	// default return value to ensure compilation
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		// write your code here

		if(numbers == null || numbers.size() < 3){
			return false;
		}

		for(int i = 0; i < numbers.size() -2; i++){
			int one = numbers.get(i);
			int two = numbers.get(i +1);
			int three = numbers.get(i+2);
			
			if(one < two && two < three){
				return true;
			}
		}


		
		return false;	// default return value to ensure compilation
	}
	
	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		// write your code here
		if(numbers == null || numbers.size() < 1){
			return false;
		}

		boolean continuity = false;

		for(int i = 0; i< numbers.size() -2; i++){
			int first = numbers.get(i);
			int second = numbers.get(i+1);
			int third = numbers.get(i +2);

			if(i == 0){
				if(first == x){
					continuity = true;
				} 
			} else if(i == numbers.size() -2){
				if(third == x){
					continuity = true;
				}
			} else if(second == x){
				continuity = true;
			} else if(second != x){
				if(first == x || third == x){
					continuity = true;
				} else {
					return false;
				}
			}
		}

		
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
		
	}

}
