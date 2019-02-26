
public class IsSorted {

	
	public static void main(String[] args) 
	{
		int[] ns= {2,4,3,3};
		boolean isSorted=true;
		for (int i = 0; i < ns.length-1&&isSorted; i++) {
			isSorted=ns[i]<=ns[i+1];
		}
		System.out.println("Array is sorted "+isSorted);
		
	}
	
}
