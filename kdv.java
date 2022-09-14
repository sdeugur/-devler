import java.util.Scanner;

public class kdv {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		double fiyat;
		System.out.println("Lütfen ücret tutarını giriniz:");
		fiyat = key.nextDouble();

		if (fiyat < 1000 && fiyat > 0) {
			double kdv;
			kdv = (fiyat / 100) * 18;
			System.out.println("KDV'siz Fiyat = " + fiyat);
			System.out.println("KDV'li Fiyat = " + (fiyat + kdv));
			System.out.println("KDV tutarı = " + kdv);
		}

		else if (fiyat > 1000 && fiyat > 0) {
			double kdv2;
			kdv2 = (fiyat / 100) * 8;
			System.out.println("KDV'siz Fiyat = " + fiyat);
			System.out.println("KDV'li Fiyat = " + (fiyat + kdv2));
			System.out.println("KDV tutarı = " + kdv2);
		}
		else {
			System.out.println("Lütfen geçerli bir fiyat giriniz.");
		}

	}

}
