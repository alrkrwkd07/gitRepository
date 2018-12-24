
public class PrimitiveType {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		
//		저장가능한값의 범위
//		논리형 boolean
//		문자형 char: 0~65535
//		정수형  byte, short, int , long
//		byte: -127~127
//		short: -32,768 ~32,767
//		int -2의 31승 ~ 반대까지 약 +-20억
//		long: -2의 63승 ~ 반대까지
//		실수형  float, double
//		float: 1.4E-45 ~3.4E38
//		double: 엄청 크다(long보다 큼)
		
//		boolea
//		기본값 : false
		boolean power = true;
		boolean checked = false;
	
		System.out.println("대답 tes/no, 스위치 on/off");
		System.out.println(power);
		System.out.println(checked);

//		문자형 char
	
		char ch = 34;
//		하나의 문자만을 저장할 수 있다.
//		아스키코드
		System.out.println(ch);
		
//		인코딩 디코딩
		
//		정수형
//		byte, short , int, long
//		1, 2, 4, 8
//bit	8, 16, 32 ,64    00 01 10 11
		int num = -2000000009;
		
		System.out.println(num);
//		-128~127
		byte b = 127; 
		
		b=(byte)(b+2);
		
		System.out.println(b);
		//기본값 int
		long bignum = 3000000000L;
		long bignum2 = 300000000132120233L;
		
		System.out.println("long 타입: " + bignum);
		System.out.println("long 타입: " + bignum2);				
				
		int firstnum = 1500000000;
		int secondnum = 1300000000;
		
		long sum = 0;
		sum =firstnum + secondnum;
		System.out.println("1개 명품금액 " + firstnum);
		System.out.println("총 명품금액: " + sum);
		
//		실수형
//		float, double
//		4byte, 8byte
//		실수 정확도 -> 정밀도
		float f = 9.12345678901234567890f;
		float f2 = 1.2345678901234567890f;
		double d = 9.12345678901234567890d;
		float ff = 0.23f;
		
		System.out.println(f);
		System.out.println(f2);
		System.out.println(d);
		
		
		
		
	}

}
