import java.util.*;

public class kucukten_buyuge_sıralama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		double s1, s2, s3;
		System.out.println("3 adet sayı giriniz:");
		s1 = key.nextDouble();
		s2 = key.nextDouble();
		s3 = key.nextDouble();
		if (s1 > s2 && s1 > s3) {
			if (s2 > s3) {
				System.out.println(s1 + " > " + s2 + " > " + s3);
			} else {
				System.out.println(s1 + " > " + s3 + " > " + s2);
			}
		}
		if (s2 > s1 && s2 > s3) {
			if (s1 > s3) {
				System.out.println(s2 + " > " + s1 + " > " + s3);
			} else {
				System.out.println(s2 + " > " + s3 + " > " + s1);
			}
		}

		if (s3 > s2 && s3 > s1) {
			if (s2 > s1) {
				System.out.println(s3 + " > " + s2 + " > " + s1);
			} else {
				System.out.println(s3 + " > " + s1 + " > " + s3);
			}
		}
	}
}