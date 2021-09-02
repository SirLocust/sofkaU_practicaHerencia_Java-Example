package com.sirlocust.java_exercice.model;

import com.sirlocust.java_exercice.tools.Origin;
import com.sirlocust.java_exercice.tools.Spending;
import com.sirlocust.java_exercice.tools.TypeHouseholdAppliance;

public class HouseholdAppliance {
  TypeHouseholdAppliance typeHouseholdAppliance;
  Spending spending;
  Origin origin;

  public HouseholdAppliance(TypeHouseholdAppliance typeHouseholdAppliance, Spending spending, Origin origin) {
    this.typeHouseholdAppliance = typeHouseholdAppliance;
    this.spending = spending;
    this.origin = origin;
  }

  public TypeHouseholdAppliance getTypeHouseholdAppliance() {
    return typeHouseholdAppliance;
  }

  public void setTypeHouseholdAppliance(TypeHouseholdAppliance typeHouseholdAppliance) {
    this.typeHouseholdAppliance = typeHouseholdAppliance;
  }

  public Spending getSpending() {
    return spending;
  }

  public void setSpending(Spending spending) {
    this.spending = spending;
  }

  public Origin getOrigin() {
    return origin;
  }

  public void setOrigin(Origin origin) {
    this.origin = origin;
  }

  private double priceBySpending() {
    double result = 0;
    if (spending == Spending.A) {
      result = 450_000;
    }
    if (spending == Spending.B) {
      result = 350_000;

    }
    if (spending == Spending.C) {
      result = 250_000;

    }
    return result;
  }

  private double priceByOrigin() {
    double result = 0;
    if (origin == Origin.NATIONAL) {
      result = 250_000;
    }
    if (origin == Origin.IMPORTED) {
      result = 350_000;
    }
    return result;
  }

  public double calculatePrice() {
    return priceByOrigin() + priceBySpending();
  }
}
