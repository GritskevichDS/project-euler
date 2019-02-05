package org.sabrina.easy;

import org.sabrina.EulerTask;

/**
 * Project Euler #9: Special Pythagorean triplet
 *
 * @author Dmitry Gritskevich
 * @see <a href="https://www.hackerrank.com/contests/projecteuler/challenges/euler009">Description</a>
 */
public class N9_SpecialPythagoreanTriplet extends EulerTask {

  public static void main(String[] args) {
    new N9_SpecialPythagoreanTriplet().execute();
  }

  @Override
  protected String getOutput(int number) {
    long result = productOfTriplet(number);
    return Long.toString(result);
  }

  private long productOfTriplet(int n) {
    long result = -1;

    for (int a = 1, bound = n / 3; a <= bound; a++) {
      int b = (int) (Math.pow(n, 2) - 2 * a * n) / (2 * (n - a));
      int c = n - a - b;

      if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
        long product = a * b * c;

        if (product > result) {
          result = product;
        }
      }
    }
    return result;
  }
}