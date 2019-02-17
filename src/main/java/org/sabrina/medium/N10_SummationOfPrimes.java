package org.sabrina.medium;

import org.sabrina.EulerTask;

/**
 * Project Euler #10: Summation of primes
 *
 * @author Dmitry Gritskevich
 * @see <a href="https://www.hackerrank.com/contests/projecteuler/challenges/euler010">Description</a>
 */
public class N10_SummationOfPrimes extends EulerTask {

  private static int maxNumber = 1_000_000;
  private static long[] results = new long[maxNumber + 1];

  public static void main(String[] args) {
    fillResults();
    new N10_SummationOfPrimes().execute();
  }

  private static void fillResults() {
    int length = (int) Math.ceil((maxNumber + 1 - 3) / 2f);
    boolean[] oddNumbers = new boolean[length]; // [3, 5, 7, 9, 11,...]
    long sum = 2;
    results[2] = sum;

    for (int i = 0; i < length; i++) {
      if (!oddNumbers[i]) {
        int prime = 2 * i + 3;
        sum += prime;
        results[prime] = sum;

        for (int j = i; j < length; j += prime) {
          oddNumbers[j] = true;
        }
      }
    }
  }

  @Override
  protected String getOutput(int number) {
    long result = sumOfPrimes(number);
    return Long.toString(result);
  }

  private long sumOfPrimes(int number) {
    while (results[number] == 0 && number > 1) {
      number--;
    }
    return results[number];
  }
}