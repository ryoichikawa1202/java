public class forsample {
  public static void main(String[] args) {
    for(int i = 0; i < 5; i++) {
      for(int j = 0; j < i; j++) {
        System.out.println(" ");
      }

      for(int k = 0; k < (5 - i) * 2 - 1; k++) {
        System.out.println("*");
      }
    }
  }
}