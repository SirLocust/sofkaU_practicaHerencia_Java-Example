package com.sirlocust.java_exercice.controller;

import java.util.Scanner;

public class GeneratorHouseHoldAppliance {

  final static Scanner scanner = new Scanner(System.in);

  public void init() {

  }

  private String readLine() {
    return this.scanner.nextLine();
  }

  private void menu() {
    while (true) {
      System.out.println("Bienvenido elija un tipo de electrodomestico ");
      System.out.println("Precione 1 para Electrodomesticos  ");
      System.out.println("Precione 2 para Televisores  ");
      System.out.println("Preciones 3 para  ");

    }
  }
}
