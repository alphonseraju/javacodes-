package StudentClass;
public class MethodOverriding {

	public void Check(int a,int b) {
		System.out.println(a+b);
	}

}
class A extends  MethodOverriding{
	public void Check(int a,int b, int c) {
		System.out.println(a+b+c);
	}

}
class B extends A{
	public void Check(int a,int b,int c ,int d) {
		System.out.println(a+b+c+d);
}
	public static void main(String[] args) {
		B b=new B();
		b.Check(10, 20);
		b.Check(10, 20, 30);
		b.Check(10, 20, 40,0);

	}

}