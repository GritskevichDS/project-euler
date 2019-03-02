package org.sabrina.easy;

import org.sabrina.EntireEulerTask;

/**
 * Project Euler #7: 10001st prime
 *
 * @author Dmitry Gritskevich
 * @see <a href="https://www.hackerrank.com/contests/projecteuler/challenges/euler007">Description</a>
 */
public class N7_10001stPrime extends EntireEulerTask {

  private int maxNumber = 0;

  private int[] primes;
  private int[] factors;

  public static void main(String[] args) {
    new N7_10001stPrime().execute();
  }

  @Override
  protected void pushNumber(int index, int number) {
    numbers[index] = number;

    if (number > maxNumber) {
      maxNumber = number;
    }
  }

  @Override
  protected void printResults() {
    primes = new int[maxNumber];
    factors = new int[maxNumber];

    fetchPrimes();
    printPrimes();
  }

  private void fetchPrimes() {
    int index = 0;
    int number = 3;
    boolean isPrime;

    primes[index] = factors[index] = 2;
    index++;

    while (index < maxNumber) {
      isPrime = true;

      for (int i = 0; i < index; i++) {
        factors[i]--;

        if (factors[i] == 0) {
          factors[i] = primes[i];
          isPrime = false;
        }
      }

      if (isPrime) {
        primes[index] = number;
        factors[index] = number;
        index++;
      }
      number++;
    }
  }

  private void printPrimes() {
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(primes[numbers[i] - 1]);
    }
  }
}