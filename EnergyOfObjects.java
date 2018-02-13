/****************************************************************************
 *
 * Created by: Johnathan Bell
 * Created on: Feb 2018
 * This program calculates the energy released in joules given the mass of an
 *     object.
 *
 ****************************************************************************/
import java.util.Scanner;

public class EnergyOfObjects {

  public static void main(String[] args) {

    // variables for weights
    double mass = 0.0;
    double speedOfLight = 2.99 * Math.pow(10,18);

    // instructions on how to use the program are at the top when the program is run.
    System.out.println("enter the mass of an object in Kg and this program will say"
    + " how much energy is released from it");

    // scanners make user inputs possible (found on
    Scanner input = new Scanner(System.in);
    mass = input.nextInt();

    System.out.println("");
    System.out.println("You entered " + mass + "kg.");

    // when you enter the number into the console it will calculate the energy in joules
    double energy = mass * Math.pow(speedOfLight,2);
    System.out.println("");
    System.out.println("The object has " + energy + " joules of energy.");

  }

}

