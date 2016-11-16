public class Dog {
	int dogAge;
	
	public Dog(String name) {
		// This contructor has one parameter, name.
	  System.out.println("Name chosen is :" + name );
	}
	
	public void setAge( int age ) {
		dogAge = age;
	}
	
	public int getAge( ) {
		System.out.println("Dog's age is :" + dogAge );
		return dogAge;
	}
	
	public static void main(String []a) {
		/* Object creation */
		Dog myDog = new Dog( "Scott" );
	
		/* Call class method to set dog's age */
		myDog.setAge( 2 );
	
		/* Call another class method to get dog's age */
		myDog.getAge( );
	
		/* You can access instance variable as follows as well */
		System.out.println("Variable Value :" + myDog.dogAge );
	}
}

