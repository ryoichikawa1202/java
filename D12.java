import java.util.*;


public class D12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 0) {
            number = -number;
        }
        System.out.println(number);
    }
}