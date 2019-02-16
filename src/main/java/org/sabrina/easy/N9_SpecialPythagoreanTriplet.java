package org.sabrina.easy;

import org.sabrina.EulerTask;

/**
 * Project Euler #9: Special Pythagorean triplet
 *
 * | a + b + c = N;   => c = N - a - b;
 * | a^2 + b^2 = c^2; => b^2 = c^2 - a^2;
 *
 * How to get b:                                Why a < N / 3:
 * b^2 = c^2 - a^2;                             a < b < c;
 * b^2 = (c - a)(c + a);                        a < b & a < c;
 * b^2 = (N - a - b - a)(N - a - b + a);        2a < b + c;
 * b^2 = (N - 2a - b)(N - b);                   3a < a + b + c;
 * b^2 = N^2 - bN - 2aN + 2ab - bN + b^2;       3a < N;
 * N^2 - 2bN - 2aN + 2ab = 0;                   a < N / 3;
 * N^2 - 2aN = 2bN - 2ab;
 * N^2 - 2aN = 2b(N - a);
 * b = (N^2 - 2aN) / 2(N - a);
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

  private long productOfTriplet(int N) {
    long result = -1;

    for (int a = 1, bound = N / 3; a < bound; a++) {
      int b = (int) (Math.pow(N, 2) - 2 * a * N) / (2 * (N - a));
      int c = N - a - b;

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