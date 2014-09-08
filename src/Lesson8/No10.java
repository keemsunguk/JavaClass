package Lesson8;

public class No10 {
	
	private int data[] = {1,2,3,4,5,6,7};
	
	public int SearchTarget(int target) {
		return SearchRecursive(target, data.length-1);
	}
	
	private int SearchRecursive(int target, int last) {
		
		if( last < 0)   return last;
		
		if(data[last] == target) 
			return last;
		else
			return SearchRecursive(target, last-1);
	}
}
