import java.util.Scanner;

public class üçgen_alanı_hesaplama {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		int a, b, c;
		System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz.");
		a = key.nextInt();
		b = key.nextInt();
		c = key.nextInt();

		int u = (a + b + c) / 2;
		double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
		System.out.println("Üçgenin alanı = " + alan);

	}

}
