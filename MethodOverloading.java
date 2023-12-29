package StudentClass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodOverloading {

	//methoadOverloading
	public String Student(String name,int rollno) {
		return "name of Student is "+name+" and rollno is "+rollno;
	}
	public String Student(String name,int rollno,String city) {
		return "name of Student is "+name+" and rollno is "+rollno+" and he lives in "+city;

	}
	public String Student(String name,int rollno,String city,long phoneno) {
		return "name of Student is "+name+" and rollno is "+rollno+" and he lives in "+city+" and phoneno is "+phoneno;

	}

	public static void main(String[] args) {
		MethodOverloading ml=new MethodOverloading();
		String s = ml.Student("raju", 23);
		String ss = ml.Student("raju", 23, "machilipatnam");
		String sss = ml.Student("raju", 23, "machilipatnam", 9110510224l);

		List<String> list=Arrays.asList(s,ss,sss);

		for(String ll:list) {
			System.out.println(ll);
		}

	}

}
