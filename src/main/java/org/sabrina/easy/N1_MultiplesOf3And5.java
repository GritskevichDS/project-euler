package org.sabrina.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Project Euler #1: Multiples of 3 and 5
 *
 * @author Dmitry Gritskevich
 * @see <a href="https://www.hackerrank.com/contests/projecteuler/challenges/euler001">Description</a>
 */
public class N1_MultiplesOf3And5 {

  public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
      int count = Integer.parseInt(reader.readLine());

      while (count-- > 0) {
        int number = Integer.parseInt(reader.readLine());
        System.out.println(sumOfMultiples(number));
      }
    } catch (Exception e) {
      System.err.println("Something went wrong: " + e);
    }
  }

  private static long sumOfMultiples(long number) {
    long sum = 0;

    long count = (number - 1) / 3;
    sum += 3 * subSum(count);

    count = (number - 1) / 5;
    sum += 5 * subSum(count);

    count = (number - 1) / 15;
    sum -= 15 * subSum(count);

    return sum;
  }

  private static long subSum(long n) {
    return n * (n + 1) / 2;
  }
}