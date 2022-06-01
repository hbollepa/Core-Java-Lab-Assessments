package Lab3_StringsAndParsing;

import java.util.*;

public class MirrorImageOfString {

	public String getImage(String str) {

		StringBuffer sbr = new StringBuffer(str);
		sbr.append('|');
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		sbr.append(sb);
		return sbr.toString();
	}

	public static void main(String[] args) {

		MirrorImageOfString p = new MirrorImageOfString();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter A String  : ");
		String str = s.next();
		System.out.println(p.getImage(str));
	}

}
