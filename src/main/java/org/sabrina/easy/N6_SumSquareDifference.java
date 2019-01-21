package org.sabrina.easy;

import org.sabrina.EulerTask;

/**
 * Project Euler #6: Sum square difference
 *
 * @author Dmitry Gritskevich
 * @see <a href="https://www.hackerrank.com/contests/projecteuler/challenges/euler006">Description</a>
 */
public class N6_SumSquareDifference extends EulerTask {

  public static void main(String[] args) {
    new N6_SumSquareDifference().execute();
  }

  @Override
  protected String getOutput(int number) {
    long result = Math.abs(sumOfSquares(number) - squareOfSum(number));
    return Long.toString(result);
  }

  private long sumOfSquares(int number) {
    long result = 0;

    for (int i = number; i > 0; i--)
      result += i * i;
    return result;
  }

  private long squareOfSum(int number) {
    return (long) Math.pow(number * (number + 1) / 2, 2);
  }
}