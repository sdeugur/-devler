package deneme;

import java.util.Scanner;

public class notortalamasi {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		System.out.println("Matematik notunuz:");
		int mat;
		mat = key.nextInt();

		System.out.println("Fizik notunuz:");
		int fiz;
		fiz = key.nextInt();

		System.out.println("Kimya notunuz:");
		int kim;
		kim = key.nextInt();

		System.out.println("Türkçe notunuz:");
		int tr;
		tr = key.nextInt();

		System.out.println("Müzik notunuz:");
		int müz;
		müz = key.nextInt();

		System.out.println("Tarih notunuz:");
		int tar;
		tar = key.nextInt();

		double ortalama = ((mat + fiz + kim + tr + müz + tar) / 6);
		System.out.println("Dönem ortalamanız:" + ortalama);

		while (ortalama > 60) {
			System.out.println("Sınıfı geçti.");
			break;
		}
		while (ortalama < 60) {
			System.out.println("Sınıfta kaldı.");
			break;
		}
	}

}
