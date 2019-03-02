package org.sabrina.easy;

import org.sabrina.StepwiseEulerTask;

/**
 * Project Euler #1: Multiples of 3 and 5
 *
 * @author Dmitry Gritskevich
 * @see <a href="https://www.hackerrank.com/contests/projecteuler/challenges/euler001">Description</a>
 */
public class N1_MultiplesOf3And5 extends StepwiseEulerTask {

  public static void main(String[] args) {
    new N1_MultiplesOf3And5().execute();
  }

  @Override
  protected String getOutput(int number) {
    return Long.toString(sumOfMultiples(number));
  }

  private long sumOfMultiples(long number) {
    long sum = 0;

    long count = (number - 1) / 3;
    sum += 3 * subSum(count);

    count = (number - 1) / 5;
    sum += 5 * subSum(count);

    count = (number - 1) / 15;
    sum -= 15 * subSum(count);

    return sum;
  }

  private long subSum(long n) {
    return n * (n + 1) / 2;
  }
}