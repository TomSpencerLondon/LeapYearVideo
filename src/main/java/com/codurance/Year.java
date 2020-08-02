package com.codurance;

public class Year {

  private int year;

  public Year(int year) {
    this.year = year;
  }

  public boolean check() {
    if(year % 4 == 0){
      return true;
    }
    return false;
  }
}
