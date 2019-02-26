
public class IntegerArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ia= {940,880,830,790,750,660,590,510,440};
		System.out.println("Size of the array \"ia\": "+ia.length);
		System.out.println("First index of the array ia: "+"0");
		System.out.println("Last index of the array ia: "+(ia.length-1));

		System.out.println("Element of ia at index 0: "+ia[0]);
		System.out.println("Element of ia at index 0: "+ia[1]);
		System.out.println("Element of ia at index 0: "+ia[2]);
		System.out.println("Element of ia at index 0: "+ia[3]);
		System.out.println("Element of ia at index 0: "+ia[4]);
		System.out.println("Element of ia at index 0: "+ia[5]);
		System.out.println("Element of ia at index 0: "+ia[6]);
		System.out.println("Element of ia at index 0: "+ia[7]);
		System.out.println("Element of ia at index 0: "+ia[8]);
		System.out.println("Element of ia at index 0: "+ia[9]);
		
		for (int i = 0; i <= 9; i++) {
			System.out.println("Element of ia at index "+i+": "+ia[i]);
		}
		for (int i = 0; i <= ia.length; i++) {
			System.out.println("Element of ia at index "+i+": "+ia[i]);
		}
		for (int i = 0; i < 9; i++) {
			System.out.println("Element of ia at index "+i+": "+ia[i]);
		}
		
	}

}
