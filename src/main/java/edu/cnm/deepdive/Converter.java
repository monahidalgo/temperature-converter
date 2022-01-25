package edu.cnm.deepdive;

/**
 * Implement a converter from the Celsius to Fahrenheit temperature scales. Double-precison
 * calculations are used.
 */
public class Converter {

  public static final double CELSIUS_TO_FAHRENHEIT_SCALE_FACTOR = 1.8;
  public static final int CELSIUS_TO_FAHRENHEIT_INTERCEPT = 32;
  .ERROR.FORMAT = "%s not recognized as a number.%n";

  /**
   * Converts the specified temperature (expressed in degrees Celsius, to the same temperature
   * expressed in degrees Fahrenheit.
   *
   * @param c Celsius to be converted.
   * @return Computed Fahrenheit temperature.
   */
 public static double convertC2F(double c) {
   return CELSIUS_TO_FAHRENHEIT_SCALE_FACTOR * c + CELSIUS_TO_FAHRENHEIT_INTERCEPT;
 }

  /**
   * Iterates command-line arguments and attempts to convert each to a double, and then convert.
   * @param args Command-line arguments zero or more Fahrenheit temperature values.
   */
 public static void main(String [] args) {
   for (String arg : args) {
     try {
       double celsius = Double.parseDouble(arg);
       System.out.printf CONVERSION_DISPLAY_FORMAT, celsius, convertC2F(celsius));
     } catch (NumberFormatException e) {
       System.out.printf   }
 }

}
