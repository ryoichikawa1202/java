import java.util.*;


public class AND {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      
      if (n >= 10 && m >= 10) {
          System.out.println("YES");
      } else {
          System.out.println("NO");
      }
    }
}