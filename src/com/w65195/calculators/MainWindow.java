package com.w65195.calculators;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

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

  MainWindow() {
    super("Calculators");
    setSize(600, 600);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);
    add(rootPanel);
    setVisible(true);

    calculateTemperatureButton.addActionListener(e -> {
      double fahrenheit = Double.parseDouble(temperatureInput.getText());
      double celsius = (fahrenheit - 32) * 5 / 9;
      temperatureOutput.setText(String.valueOf(celsius));
    });

    weightOutput.addActionListener(e -> {
      double pound = Double.parseDouble(weightInput.getText());
      double kilogram = pound * 0.45359237;
      calculateWeightButton.setText(String.valueOf(kilogram));
    });

    calculateDistanceButton.addActionListener(e -> {
      double miles = Double.parseDouble(distanceInput.getText());
      double kilometers = miles * 1.60934;
      distanceOutput.setText(String.valueOf(kilometers));
    });
  }
}
