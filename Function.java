
public class Function {

	public static void main(String[] args) {
		int sum = additionpar(20,30);
		System.out.println(sum);
		add(10,20);
		
		int one =10;
		int two =40;
		int res = Demoscope(one,two);
		System.out.println(res);

	}
	public static int Demoscope(int one , int another) {
		int sum = one + another ;
		return sum;
	}
	
	
	public static int additionpar(int a , int b) {
		int sum	= a + b;
		return sum;
	}
	
	public static void add(int a , int b) {
		int sum = a + b;
		System.out.println(sum);
	}


	public static void addition() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("Sum is: " + c);

	}
}
