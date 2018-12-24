
public class OperEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int n = 0;
		 * 
		 * n = -10;
		 * 
		 * System.out.println(n);
		 * 
		 * n = -n;
		 * 
		 *///System.out.println(n);
		
		int num = 0;
		int secondnum = 0;
		
		num = 10;
		secondnum = 4;
		
		System.out.printf("%d + %d = %d\n", num, secondnum, num+secondnum);
		System.out.printf("%d - %d = %d\n", num, secondnum, num-secondnum);
		System.out.printf("%d * %d = %d\n", num, secondnum, num*secondnum);
		//int / int -> 10 / 4 ->2
		System.out.printf("%d / %d = %d\n", num, secondnum, num/secondnum);
		System.out.printf("%d / %f = %f\n",
				num, (double)secondnum, num/(double)secondnum);		
	}

}
