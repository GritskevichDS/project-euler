package org.sabrina.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Project Euler #6: Sum square difference
 *
 * @author Dmitry Gritskevich
 * @see <a href="https://www.hackerrank.com/contests/projecteuler/challenges/euler006">Description</a>
 */
public class N6_SumSquareDifference {

  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {
      int count = Integer.parseInt(reader.readLine());

      while (count-- > 0) {
        int number = Integer.parseInt(reader.readLine());
        System.out.println(Math.abs(sumOfSquares(number) - squareOfSum(number)));
      }
    } catch (Exception e) {
      System.err.println("Something went wrong: " + e);
    }
  }

  private static long sumOfSquares(int number) {
    long result = 0;

    for (int i = number; i > 0; i--)
      result += i * i;
    return result;
  }

  private static long squareOfSum(int number) {
    return (long) Math.pow(number * (number + 1) / 2, 2);
  }
}