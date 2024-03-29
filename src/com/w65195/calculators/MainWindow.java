package com.w65195.calculators;

import com.w65195.Converter;

import javax.swing.*;
import java.text.DecimalFormat;

public class MainWindow extends JFrame {

  private final Converter converter;
  private final DecimalFormat decimalFormat;

  // bind variables to UI elements
  private JPanel rootPanel;
  private JTextField temperatureInput;
  private JTextField temperatureOutput;
  private JButton calculateTemperatureButton;
  private JTextField weightInput;
  private JTextField calculateWeightButton;
  private JButton weightOutput;
  private JButton calculateDistanceButton;
  private JTextField distanceInput;
  private JTextField distanceOutput;
  private JTextField distance2input;
  private JButton calculateDistance2Button;
  private JTextField distance2output;

  MainWindow() {
    // create app main window
    super("Calculators");
    setSize(600, 600);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);
    add(rootPanel);
    setVisible(true);

    // create instance of converter class
    this.converter = new Converter();

    // create formatter for converted values
    this.decimalFormat = new DecimalFormat("0.00");

    // handle conversion of temperature
    calculateTemperatureButton.addActionListener(e -> {
      try {
        double fahrenheit = Double.parseDouble(temperatureInput.getText());
        double celsius = this.converter.fahrenheitToCelsius(fahrenheit);
        temperatureOutput.setText(this.decimalFormat.format(celsius) + "°C");
      } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Wrong temperature input format");
      }
    });

    // handle weight conversion
    weightOutput.addActionListener(e -> {
      try {
        double pound = Double.parseDouble(weightInput.getText());
        double kilogram = this.converter.poundsToKilograms(pound);
        calculateWeightButton.setText(this.decimalFormat.format(kilogram) + "kg");
      } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Wrong weight input format");
      }
    });

    // handle distance conversion
    calculateDistanceButton.addActionListener(e -> {
      try {
        double miles = Double.parseDouble(distanceInput.getText());
        double kilometers = this.converter.milesToKilometers(miles);
        distanceOutput.setText(this.decimalFormat.format(kilometers) + "km");
      } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Wrong miles input format");
      }
    });

    // handle distance conversion
    calculateDistance2Button.addActionListener(e -> {
      try {
        double feet = Double.parseDouble(distance2input.getText());
        double meters = this.converter.feetToMeters(feet);
        distance2output.setText(this.decimalFormat.format(meters) + "m");
      } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Wrong feet input format");
      }
    });
  }
}
