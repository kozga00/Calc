package com.w65195;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {
  @Test
  public void shouldConvertFahrenheitToCelsius() {
    Converter converter = new Converter();
    DecimalFormat decimalFormat = new DecimalFormat("0.00");
    assertEquals(decimalFormat.format(converter.fahrenheitToCelsius(90)), "32.22");
  }

  @Test
  public void shouldConvertPoundsToKgs() {
    Converter converter = new Converter();
    DecimalFormat decimalFormat = new DecimalFormat("0.00");
    assertEquals(decimalFormat.format(converter.poundsToKilograms(90)), "40.82");
  }

  @Test
  public void shouldConvertFeetToMeters() {
    Converter converter = new Converter();
    DecimalFormat decimalFormat = new DecimalFormat("0.00");
    assertEquals(decimalFormat.format(converter.feetToMeters(90)), "27.43");
  }

  @Test
  public void shouldConvertMilesToKm() {
    Converter converter = new Converter();
    DecimalFormat decimalFormat = new DecimalFormat("0.00");
    assertEquals(decimalFormat.format(converter.milesToKilometers(90)), "144.84");
  }
}
