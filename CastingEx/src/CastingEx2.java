
public class CastingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 자동 형변환
//		자동 형변환의 규칙
//		기존의 값을 최대한 보존할 수 있는 타입으로 자동 형변환한다.
//		  1       2		  4		 8		  4		   8
//		byte -> short -> int -> long -> float -> double
//		->      char ->
//		묵시적 형변환 : 값의 손실이 없다.
//		명시적 형변환 : 값의 손실이 있지만 그 결과가 원하는 결과라고 compiler에게 알려준다.
		
		/*
		 * 1.boolean을 제외한 나머지 7개의 기본형은 서로 형변환이 가능하다.
		 * $2.기본형과 참조형은 서로 형변환할 수 없다.$ 아직은 필요치 않은 정보
		 * 3.서로 다른 타입의 변수간의 연산은 형변환을 하는 것이 원칙이지만,
		 *   값의 범위가 작은 타입에서 큰 타입으로 형변환은 생략할 수 있다.
		 * 
		 * 
		 * 
		 * 
		 */
		
		int n = 1321333333;
		
				System.out.println("int = "+ n);
				System.out.println("intlong = "+ n);
				System.out.println("intdouble = "+ (double)n);
		System.out.println();
		
		long num = 1321333333;
		
		n = (int)num; 
		System.out.println("long= "+ n);
		System.out.println("longint= "+ (int)num);
		System.out.println("longdouble= "+ (double)num);
		System.out.println();
		
		double d = 1321333333;
		
		System.out.println("double= "+ d);
		System.out.println("doubleint= "+(int)d);
		System.out.println("doublelong= "+ (long)d);
		/*
		 * double doublenum = 0.0;
		 * 
		 * doublenum = 107865345435l;
		 * 
		 * long bignum = (long)32145321; int bignum2 = (int)320145312120l;
		 * 
		 * System.out.println(bignum2); System.out.println();
		 * 
		 * System.out.println(doublenum); System.out.println();
		 * 
		 */
		
		
		
	}

}
