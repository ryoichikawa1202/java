import java.util.*;


public class C49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int a = Integer.parseInt(line);
        int i = 1;
        int s = 0;
        int m = 0;
        for (int p = 0; p < a; p++) {
            int f = sc.nextInt();
            m = f - i;
            if (m < 0) {
                m = -m;
            }
            s += m;
            i = f;
        }
        System.out.println(s);
    }
}