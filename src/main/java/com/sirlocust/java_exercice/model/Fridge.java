package com.sirlocust.java_exercice.model;

import com.sirlocust.java_exercice.tools.Origin;
import com.sirlocust.java_exercice.tools.Spending;
import com.sirlocust.java_exercice.tools.TypeHouseholdAppliance;

public class Fridge extends HouseholdAppliance {
  double capacity;

  public Fridge(TypeHouseholdAppliance typeHouseholdAppliance, Spending spending, Origin origin, double capacity) {
    super(typeHouseholdAppliance, spending, origin);
    this.capacity = capacity;
    // TODO Auto-generated constructor stub
  }

  @Override
  public double calculatePrice() {
    double result = super.calculatePrice();
    if (capacity > 120) {
      result += this.calculateMorePrice(result);
    }
    return result;
  }

  private double calculateMorePrice(double basicPrice) {
    double result = 0;
    double capacityMore = capacity - 120;
    double countAddMore = capacityMore / 10;
    result = (basicPrice * 5) / 100;
    return result * countAddMore;
  }

}
