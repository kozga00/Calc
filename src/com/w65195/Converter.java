package com.w65195;

public class Converter {
  public double fahrenheitToCelsius(double f) {
    return (f - 32) * 5 / 9;
  }

  public double poundsToKilograms(double p) {
    return p * 0.45359237;
  }

  public double milesToKilometers(double m) {
    return m * 1.60934;
  }

  public double feetToMeters(double f) {
    return f * 0.3048;
  }
}
