import java.io.*;
public class java43 {
  public static void main(String[] args) throws IOException {
    int x = 1;

    for( int n = 1 ; n <= 8 ; n++ )
    {
        x *= 2;
        System.out.println( "2の" + n + "乗=" + x );
    }
  }
}