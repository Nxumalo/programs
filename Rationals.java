public class Rationals{
	public int numerator;
	public int denominator;
	public Rationals(int a,int b){
		numerator=a;
		denominator=b;
		

	}

	private int  GCD(int f,int s){
		int first=f;
		int second=s;
		int half;
		if(first<second){
			if(first%2==0){
				half=first/2;
			}
			if(first%3==0){
				half=first/3;
			}
			if(first%5==0){
				half=first/5;
			}
			if(first%7==0){
				half=first/7;
			}
		}
		else{
			if(second%2==0){
				half=second/2;
			}
			if(second%3==0){
				half=second/3;
			}
			if(second%5==0){
				half=second/5;
			}
			if(second%7==0){
				half=second/7;
			}
		}
		for(int k=half;k<=half;k--){
			if(first%half==0 && second%half==0){
				first=first/half;
				second=second/half;
				
				break;
			}
		}
		
	}
	public boolean equals(int one,int two){
		double z=one/
		

	}

	public static void main(String[] args)
{
	Rational r1 = new Rational(3,6);
	Rational r2 = new Rational(2,4);
	Rational r3,r4;
	System.out.println(r1.equal(r2));
	r3 = r1.add(r2);
	r4 = r1.multiply(r2).multiply(r2);
	System.out.println(r1);
	System.out.println(r2);
	System.out.println(r3);
	System.out.println(r4);
	}

}
