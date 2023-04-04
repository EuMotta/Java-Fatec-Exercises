public class ex05 {
  public static boolean isPrimo(int n) {
    if (n <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    for (int i = 2; i <= 1000; i++) {
      if (isPrimo(i)) {
        System.out.print(i + " ");
      }
    }
  }
}
