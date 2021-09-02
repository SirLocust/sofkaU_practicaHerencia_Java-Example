package com.sirlocust.java_exercice.model;

import com.sirlocust.java_exercice.tools.Origin;
import com.sirlocust.java_exercice.tools.Spending;
import com.sirlocust.java_exercice.tools.TypeHouseholdAppliance;

public class Tv extends HouseholdAppliance {

  double size;
  boolean isTDT;

  public Tv(TypeHouseholdAppliance typeHouseholdAppliance, Spending spending, Origin origin, double size,
      boolean isTDT) {
    super(typeHouseholdAppliance, spending, origin);
    this.size = size;
    this.isTDT = isTDT;
    // TODO Auto-generated constructor stub
  }

  public double getSize() {
    return size;
  }

  public void setSize(double size) {
    this.size = size;
  }

  public boolean isTDT() {
    return isTDT;
  }

  public void setTDT(boolean isTDT) {
    this.isTDT = isTDT;
  }

  @Override
  public double calculatePrice() {
    double result = super.calculatePrice();
    if (this.isSizeMore()) {
      result += this.calculatePorcentageMore(result);
    }
    if (isTDT) {
      result += 250_000;
    }
    return result;
  }

  private double calculatePorcentageMore(double basicPrice) {

    return (basicPrice * 30) / 100;

  }

  private boolean isSizeMore() {
    boolean result = false;
    if (size > 40) {
      return true;
    }
    return result;
  }

}
