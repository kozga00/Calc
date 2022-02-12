package com.w65195;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {
  Converter converter = new Converter();
  DecimalFormat decimalFormat = new DecimalFormat("0.00");

  @Test
  public void shouldConvertFahrenheitToCelsius() {
    assertEquals(decimalFormat.format(converter.fahrenheitToCelsius(0)), "-17.78");
    assertEquals(decimalFormat.format(converter.fahrenheitToCelsius(10)), "-12.22");
    assertEquals(decimalFormat.format(converter.fahrenheitToCelsius(90)), "32.22");
  }

  @Test
  public void shouldConvertPoundsToKgs() {
    assertEquals(decimalFormat.format(converter.poundsToKilograms(0)), "0.00");
    assertEquals(decimalFormat.format(converter.poundsToKilograms(10)), "4.54");
    assertEquals(decimalFormat.format(converter.poundsToKilograms(90)), "40.82");
  }

  @Test
  public void shouldConvertFeetToMeters() {
    assertEquals(decimalFormat.format(converter.feetToMeters(0)), "0.00");
    assertEquals(decimalFormat.format(converter.feetToMeters(10)), "3.05");
    assertEquals(decimalFormat.format(converter.feetToMeters(90)), "27.43");
  }

  @Test
  public void shouldConvertMilesToKm() {
    assertEquals(decimalFormat.format(converter.milesToKilometers(0)), "0.00");
    assertEquals(decimalFormat.format(converter.milesToKilometers(10)), "16.09");
    assertEquals(decimalFormat.format(converter.milesToKilometers(90)), "144.84");
  }
}
