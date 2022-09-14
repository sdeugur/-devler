import java.util.Scanner;

public class taksimetre {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		double km;
		System.out.println("Ücretini hesaplamak istediğiniz kilometreyi giriniz:");
		km = key.nextDouble();

		double ücret = (km * 2.20) + 10;

		if (ücret <= 20 && ücret > 0) {
			System.out.println("Ödenecek tutar = 20 TL");

		} else if (ücret > 20 && ücret > 0) {
			System.out.println("Ödenecek tutar = " + ücret + " TL");
		}
		else {
			System.out.println("Lütfen geçerli bir sayı giriniz.");
		}

	}

}
