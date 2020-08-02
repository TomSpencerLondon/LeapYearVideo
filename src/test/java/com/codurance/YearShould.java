package com.codurance;
//
//A year is not a leap year if not divisible by 4
//    A year is a leap year if divisible by 4
//    A year is a leap year if divisible by 400
//    A year is not a leap year if divisible by 100 but not by 400
//
//    1997 is not a leap year (not divisible by 4)
//    1996 is a leap year (divisible by 4)
//    1600 is a leap year (divisible by 400)
//    1800 is not a leap year (divisible by 4, divisible by 100, NOT divisible by 400)

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class YearShould {

  @ParameterizedTest
  @CsvSource({
      "1997, false",
      "1996, true"
  })
  void return_correct_check_for_leap_year(int input, boolean output) {
    assertEquals(output, newYear(input).check());
  }

  private Year newYear(int input) {
    return new Year(input);
  }
}
