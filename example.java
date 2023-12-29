public class example { 
	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		int fac=1;
		for(int i =10;i>0;i--) {
			System.out.println(i);
			fac*=i;
		}
		System.out.println("Factorial of "+" is :"+fac);
	}
}