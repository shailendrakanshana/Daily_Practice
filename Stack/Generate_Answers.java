import java.util.*;

public class Generate_Answers {
    static int evaluate(char operator, int lhs, int rhs){
		if(operator == '*'){
			return lhs * rhs;
		}
		else if(operator == '+'){
			return lhs + rhs;
		}
		else{
			return lhs - rhs;
		}
	}
    	
	static List<Integer> findAllOutcomes(String s){
		List<Integer> currentResults = new ArrayList<Integer>();
		boolean noOp = true;
		for(int i = 0; i < s.length(); i++){
		    	// Search for an operator '+', '-', '*
			if(s.charAt(i) == '*' || s.charAt(i) == '+' || s.charAt(i) == '-'){
				noOp = false;
				// Split the string at operator and find outcomes for left part and right part
				List<Integer> left = findAllOutcomes(s.substring(0, i));
				List<Integer> right = findAllOutcomes(s.substring(i + 1));
				// Get all outcomes by applying the found operator to all pairs of results from left and right parts
				for(Integer l : left){
					for(Integer r : right){
						currentResults.add(evaluate(s.charAt(i), l, r));
					}
				}
			}
		}
		// Terminating case: If there was no operator, result is just the number formed by the digits
		if(noOp){
			currentResults.add(Integer.parseInt(s));
		}
		return currentResults;
	}
	public static void main(String[] args) {
		System.out.println(findAllOutcomes("2+3*5-2"));
	}
}
