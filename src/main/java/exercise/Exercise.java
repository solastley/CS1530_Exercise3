/**
* This is the main program for Exercise 3.
*/

package exercise;

import java.util.*;
import java.io.*;
import java.lang.IllegalArgumentException;

public class Exercise {
  public static void main(String[] args) {
    if (args.length < 1) {
      System.out.println("Usage: java Exercise value");
      System.exit(1);
    }

    int value = -1;
    try {
      value = Integer.parseInt(args[0]);
      if (value < 0) {
        System.out.println("Value must be greater than or equal to zero.");
        System.exit(1);
      }
    } catch (NumberFormatException e) {
      System.err.println("Invalid argument.");
      System.exit(1);
    }

    int triValue = tri(value);
    int catererValue = lazyCaterer(value);

    System.out.println("Tri(n) = " + triValue);
    System.out.println("Lazy(n) = " + catererValue);
  }

  /**
  * This method calculates the triangle number for the value n.
  * @param n the value to calculate the triangle number for
  * @return the triangle number of n
  */
  public static int tri(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("n must be greater than 0.");
    }

    return n * (n + 1) / 2;
  }

  /**
  * This method calculates the lazy caterer number for the value n.
  * @param n the value to calculate the lazy caterer number for
  * @return the lazy caterer number of n
  */
  public static int lazyCaterer(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("n must be greater than 0.");
    }

    /* The lazy caterer number for a given value n is equal to its triangle
      number plus one. See here: https://en.wikipedia.org/wiki/Lazy_caterer%27s_sequence */
    return tri(n) + 1;
  }
}
