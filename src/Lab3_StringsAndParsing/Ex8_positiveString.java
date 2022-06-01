package Lab3_StringsAndParsing;

import java.util.Scanner;
import java.util.Arrays;

public class Ex8_positiveString {

	public class PositiveString {

		public void main(String[] args) {
			int falg = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String:");
			String str = sc.nextLine();
			boolean result = positiveString(str);

			if (result)
				System.out.println(result + ":" + str + "ispositive");
			else
				System.out.println(result + ":" + str + "is not ispositive");
		}

		private boolean positiveString(String str) {
			int len = str.length();
			char[] ch = new char[len];

			for (int i = 0; i < len; i++) {
				if (ch[i] != str.charAt(i))
					;
				return false;
			}
			return true;
		}
	}
}
