
public class IntegerArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ia=new int[10];
		ia[0]=940;
		ia[1]=880;
		ia[2]=830;
		ia[3]=790;
		ia[4]=750;
		ia[5]=660;
		ia[6]=650;
		ia[7]=590;
		ia[8]=510;
		ia[9]=440;
		for (int i = 0; i < ia.length; i++) {
			System.out.println("Element of ia at index "+i+":" +ia[i]);
			
		}
		System.out.println("after reassigning ia to a different, new array:");
		ia=new int[4];
		ia[0]=14;
		ia[1]=23;
		ia[2]=-3;
		ia[3]=4;
		for (int i = 0; i < ia.length; i++) {
			System.out.println("Elemetn of ia at index "+i+": "+ia[i]);
			
		}
		
		}

}
