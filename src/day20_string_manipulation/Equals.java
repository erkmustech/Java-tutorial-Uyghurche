package day20_string_manipulation;

import java.util.Scanner;

public class Equals {

	public static void main(String[] args) {

		/*
		 * 
		 * • Task-82 LoginFunctionalityLogic UserName,Password --- > Program will ask to
		 * enter username and password --- > If both username and password are blank
		 * "UserName and Password Fields cannot be empty" --- > If userName is blank and
		 * password is not blank "UserName cannot be empty" --- > If userName is not
		 * blank and password is blank "Password cannot be empty" --- > If the username
		 * or password is not valid "UserName or password is not valid. Please verify"
		 * --- > If the username and password are both valid
		 * "User Logged in successfully"
		 */

		String username = "max";
		String password = "max0";
		int limit = 0;
		do {
			System.out.println("inter your username");
			Scanner sc = new Scanner(System.in);
			String inputName = sc.nextLine();
			System.out.println("inter your password");

			String inputP = sc.nextLine();

			if (inputName.equals(username) && inputP.equals(password)) {
				System.out.println("pass");
			} else if (inputName.equals("") && inputP.equals("")) {
				System.out.println("username and password can't be empty");
				limit++;
			} else if (inputName.equals(username) && inputP.equals("")) {
				System.out.println("password can't be empty");
				limit++;
			} else if (inputName.equals("") && inputP.equals("password")) {
				System.out.println("username can't be empty");
				limit++;
			}

		} while (limit < 5);
	}

}
