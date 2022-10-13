import java.util.Scanner;

public class kullanici_girisi {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		System.out.println("Please enter your username:");
		String name = key.nextLine();
		System.out.println("Please enter your password:");
		String password1 = key.nextLine();
		if (name.equals("abc") && password1.equals("123abc")) {
			System.out.println("Log in.");
		} else {
			System.out.println("Wrong password.");
			System.out.println("1. Try again.\n2. Forget your password?");
			int select = key.nextInt();

			switch (select) {
			case 1:
				Scanner a = new Scanner(System.in);
				System.out.println("Please enter your username:");
				String name1 = a.nextLine();
				System.out.println("Please enter your password:");
				String password3 = a.nextLine();
				if (name1.equals("abc") && password3.equals("123abc")) {
					System.out.println("Log in.");
				} else {
					System.out.println("Wrong password.");
					
				}
				break;
			case 2:
				Scanner b = new Scanner(System.in);
				System.out.println("You can change your password. It cannot be equals old one.");
				String password2 = b.nextLine();
				if (password2.equals("123abc")) {
					System.out.println("New password equlas to new password. Try again.");
					
				} else {
					System.out.println("Password changes.");
				}
				break;
			}
		}

	}
}
