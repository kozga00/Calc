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
  private JTextField distance2input;
  private JButton calculateDistance2Button;
  private JTextField distance2output;

  MainWindow() {
    super("Calculators");
    setSize(600, 600);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);
    add(rootPanel);
    setVisible(true);

    calculateTemperatureButton.addActionListener(e -> {
      try {
        double fahrenheit = Double.parseDouble(temperatureInput.getText());
        double celsius = (fahrenheit - 32) * 5 / 9;
        temperatureOutput.setText(celsius + "°C");
      } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Wrong temperature input format");
      }
    });

    weightOutput.addActionListener(e -> {
      try {
        double pound = Double.parseDouble(weightInput.getText());
        double kilogram = pound * 0.45359237;
        calculateWeightButton.setText(kilogram + " kg");
      } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Wrong weight input format");
      }
    });

    calculateDistanceButton.addActionListener(e -> {
      try {
        double miles = Double.parseDouble(distanceInput.getText());
        double kilometers = miles * 1.60934;
        distanceOutput.setText(kilometers + " km");
      } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Wrong miles input format");
      }
    });

    calculateDistance2Button.addActionListener(e -> {
      try {
        double feet = Double.parseDouble(distance2input.getText());
        double meters = feet * 0.3048;
        distance2output.setText(meters + " m");
      } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Wrong feet input format");
      }
    });
  }
}
