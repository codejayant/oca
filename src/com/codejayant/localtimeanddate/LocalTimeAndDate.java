package com.codejayant.localtimeanddate;

import java.time.*;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class LocalTimeAndDate {

	public static void main(final String[] args) {
		System.out.println(DayOfWeek.FRIDAY.getDisplayName(TextStyle.FULL, Locale.getDefault()));

		// LocalDate: represents a year-month-day in the ISO calendar
		final LocalDate date = LocalDate.of(2000, Month.NOVEMBER, 20);
		final TemporalAdjuster adj = TemporalAdjusters.next(DayOfWeek.WEDNESDAY);
		final LocalDate nextWed = date.with(adj);
		System.out.printf("For the date of %s, the next Wednesday is %s.%n", date, nextWed);
		System.out.print("hello\n");

		// YearMonth: month of specific month
		final YearMonth dateYearMonth = YearMonth.now();
		System.out.printf("%s: %d%n", dateYearMonth, dateYearMonth.lengthOfMonth());
		final YearMonth date2 = YearMonth.of(2010, Month.FEBRUARY);
		System.out.printf("%s: %d%n", date2, date2.lengthOfMonth());
		final YearMonth date3 = YearMonth.of(2012, Month.FEBRUARY);
		System.out.printf("%s: %d%n", date3, date3.lengthOfMonth());

		// MonthDay: day of a particular month
		final MonthDay monthDay = MonthDay.of(Month.FEBRUARY, 29);
		System.out.println("is Leap Year (MonthDay): " + monthDay.isValidYear(2010));

		// Year: represents a year
		System.out.println("is Leap Year (Year): " + Year.of(2012).isLeap());

		// LocalTime
		System.out.println("Hour: " + LocalTime.now().getHour());

		// LocalDateTime
		System.out.printf("%nnow: %s%n", LocalDateTime.now());
		System.out.printf("Apr 15, 1994 @ 11:30am: %s%n", LocalDateTime.of(1994, Month.APRIL, 15, 11, 30));
		System.out.printf("now (from Instant): %s%n", LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));
		System.out.printf("6 months from now: %s%n", LocalDateTime.now().plusMonths(6));
		System.out.printf("6 months ago: %s%n", LocalDateTime.now().minusMonths(6));

	}

}
