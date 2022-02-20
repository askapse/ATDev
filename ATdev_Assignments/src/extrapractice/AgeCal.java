package extrapractice;

import java.time.LocalDate;
import java.time.Period;

public class AgeCal {
	public static void main(String[] args) {
		LocalDate dob = LocalDate.of(1999, 10, 1);
		Period p = Period.between(dob, LocalDate.now());
		System.out.printf("I am %d years, %d months and %d days old.",p.getYears(),p.getMonths(),p.getDays());
	}
}
