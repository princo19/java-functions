import java.util.Scanner;

public class A2D {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter Source number:");
		int snum = scn.nextInt();
		System.out.print("Enter Source base:");
		int sb = scn.nextInt();
		scn.close();
		int ans = AnyBaseToDecimal(snum,sb);
		System.out.println(ans);

	}

	public static int AnyBaseToDecimal(int snum, int sb) {
		int mul = 1;
		int ans =0;

		while (snum != 0) {

			int rem = snum % 10;
			ans = ans + (rem * mul);
			mul = mul * sb;
			snum = snum / 10;
			
		}
		return ans;

	}

}
