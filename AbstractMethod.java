package StudentClass;
public class AbstractMethod {


	public static void main(String[] args) {
		Sub s=new Sub();
		s.Check();
	}

}
abstract class Abstarct{
	abstract void Check();

	abstract void test();
}
class Sub extends Abstarct{

	@Override
	void Check() {
		System.out.println("hi this abstract method");

	}
	public static void main(String[] args) {
		Sub s =new Sub();
		s.Check();

	}
	@Override
	void test() {
		// TODO Auto-generated method stub

	}

}