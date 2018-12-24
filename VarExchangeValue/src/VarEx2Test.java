
public class VarEx2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = (400);
		int num2 = (300);
		int num3 = (200);
		int tmp = 0 ;

	
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		System.out.println("__________________e1______________________");		
		System.out.println("num1 "+num1);	
		System.out.println("num1 "+num2);
		System.out.println("num1 "+num3);
		System.out.println("__________________e2______________________");	
		
		tmp = num1;
		num1 = (num2);
		num2 = (tmp);

		System.out.println("__________________s1________________");	
		System.out.println("num1 "+ num1);	
		System.out.println("num1 "+num2);
		System.out.println("num1 "+num3);
		System.out.println("___________________f1___________________");		
		
		tmp = num2;
	    num2 = (num3);
		num3 = (tmp);

		System.out.println("____________________s2____________________");	
		System.out.println("num1 "+ num1);	
		System.out.println("num1 "+num2);
		System.out.println("num1 "+num3);
		System.out.println("______________________f2__________________");	
		
		tmp = num1;
		num1 = num2;
		num2 = tmp;
		
		System.out.println("______________________s3__________________");	
		System.out.println("num1 "+ num1);	
		System.out.println("num1 "+num2);
		System.out.println("num1 "+num3);
		System.out.println("______________________f3__________________");	
	

	}

}
