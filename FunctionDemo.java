
public class FunctionDemo {
			public static int val =20;

	public static void main(String[] args) {
		System.out.println(val);
		int val =10;
		int one =10;
		int two = 20;
		System.out.println(val);
		System.out.println(FunctionDemo.val);
		int ans = DemoGlobalScope(one);
		System.out.println(ans);
		
		int sum = DemoGlobalScope(one);
		System.out.println(sum);
		System.out.println("Pass by value");
		System.out.println(one + " " + two);
		Swap(one,two);
		System.out.println(one + " " + two);
		
		
	}
	public static void Swap(int one , int two) {
		System.out.println(one + " " + two );
		int temp = one ;
		one = two ;
		two = temp;
		System.out.println(one + " " + two);
	}
	
	public static int DemoGlobalScope(int one) {
		int sum = one + val ;
		return sum;
	
	}

}
