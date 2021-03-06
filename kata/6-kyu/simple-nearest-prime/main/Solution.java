import static java.math.BigInteger.valueOf;

interface Solution {
  static long solve(long n) {
    for (long l = 0, p; ; l++) {
      if (valueOf(p = n - l).isProbablePrime(2) || valueOf(p = n + l).isProbablePrime(2)) {
        return p;
      }
    }
  }
}