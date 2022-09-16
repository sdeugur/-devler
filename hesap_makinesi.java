import java.util.Scanner;

public class hesap_makinesi {

	public static void main(String[] args) {
		int n1, n2;

		Scanner keyboard = new Scanner(System.in);

		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();

		System.out.print("1. Toplama\n2. Çıkarma\n3. Çarpma\n4. Bölme");
		System.out.print("İslemi seciniz:");
		int select = keyboard.nextInt();

		switch (select) {
		case 1:
			System.out.println((n1 + n2));
			break;

		case 2:
			System.out.println(n1 - n2);
			break;

		case 3:
			System.out.println(n1 * n2);
			break;

		case 4:
			System.out.println((float)n1 / n2);
			break;
		}
	}

}
