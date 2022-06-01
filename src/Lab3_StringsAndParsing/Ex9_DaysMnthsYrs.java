package Lab3_StringsAndParsing;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Ex9_DaysMnthsYrs {

	public static void main(String[] args) {

		LocalDate pdate = LocalDate.of(2012, 05, 23);
		LocalDate now = LocalDate.now();

		Period diff = Period.between(pdate, now);

		System.out.printf("\n Difference is %d years, %d months, %d days old\n\n ", diff.getYears(), diff.getMonths(),
				diff.getDays());
	}
}
