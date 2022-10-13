import java.util.*;

public class hava_sıcaklığı {

	public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.print("Sıcaklık değerini giriniz: ");
double sıcaklık = input.nextDouble();
if (sıcaklık < 5) {System.out.println("Hava sıcaklığı kayak etkinliğine uygun.");}
else if (sıcaklık == 5 || sıcaklık < 15) {System.out.println("Hava sıcaklığı sinema etkinliğine uygun.");}
else if (sıcaklık == 15 || sıcaklık < 25) {System.out.println("Hava sıcaklığı piknik etkinliğine uygun.");}
else if (sıcaklık >=25) {System.out.println("Hava sıcaklığı yüzme etkinliğine uygun.");}  
	}
}