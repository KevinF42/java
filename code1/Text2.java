class Text2 {
	public static void main (String a[]){
		int i,ci; // integer i
		char c; // character c
	i = 7;
	c = 'A';
	String s = "this is a string";
	System.out.println(".........................");
	System.out.println("i = "+i);		
	System.out.println("c = "+c);	
	System.out.println("s = "+s);	
		System.out.println(".........................");
	//do some math on the variables
	i = i % 7;
	ci = (int)c; // type cast character c
	
	System.out.println(".........................");
	System.out.println("i = " + i);
	System.out.println("ci = "+ci);
	ci = ci % 7;
	System.out.println("Now ci = "+ci);
	
	}
}
