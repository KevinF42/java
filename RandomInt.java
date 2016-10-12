// name this file: RandomInt.java
import java.util.Arrays;
class RandomInt{
	public static void main (String args[]){
		int i;
		int[] t = new int[1280];//array t
			
			//genrate random numbers from 0 to 5
			for (i = 0; i < 1280; i++){
				t[i] = (int)(Math.random()*5+1);
				System.out.print(t[i]+",");
				if (i % 8 == 0)System.out.println();
		
	}
	
	 Arrays.sort(t);
				
	//write code  to output the array		 
	}//end public
}// end class
