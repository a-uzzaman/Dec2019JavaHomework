package homework3;

public class AshifHomework3 {
	static int x=2;
	static int y=6;
	static int z=8;
	
	public static void addNumbers(int x, int y) {
		int result=x+y;
		System.out.println(result);
	}
	
	public static void divideEven(int x, int y, int z) {
		int remainder=x%2;
		int remainder2=y%2;
		int remainder3=z%2;
		if(x>y) {
			
			if(remainder==0) {
				System.out.println("Its a even numbner");
				if(remainder2==0) {
					System.out.println("second number is are EVEN");
					int result =x/y;
					System.out.println(result);
				}
				else {
					System.out.println("only the first number is even");
					if(x>z) {

						if(remainder3==0) {
							System.out.println("third number is even");
							int result=x/z;
							System.out.println(result);
							
						}
					else {
						if(remainder3==0) {
							System.out.println("The third number is even");
							int result = z/x;
							System.out.println(result);
						}
					}
				}
			}
		}
		}
		else {
			
			if(remainder==0) {
				System.out.println("first number is a even numbner");
				if(remainder2==0) {
					System.out.println("the second number is even numbers");
					int result = y/x;
					System.out.println(result);
				}
				else {
					if(remainder3==0) {
						System.out.println("the third numbner is a even number");
						int result = z/x;
						System.out.println(result);
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addNumbers(x, y);
		divideEven(x, y, z);
		
	}

}
