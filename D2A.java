import java.util.Scanner;

public class D2A {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter source number:");
		int snum = scn.nextInt();
		
		
		System.out.print("Enter destination base:");
		int db = scn.nextInt();
		scn.close();
		int ans = DecimalToAnyBase(snum,db);
		System.out.println(ans);



	}
	public static int DecimalToAnyBase(int snum , int db) {
		int ans =0;
		int mul =1;
		while(snum!=0) {
			int rem = snum%db;
			ans = ans + (rem*mul);
			mul = mul * 10;
			snum = snum/db;
			
		}
		return ans;
	}

}
