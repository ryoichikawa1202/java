import java.io.*;
public class java47 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int giants = 0;
    int tigers = 0;

    for (int game = 1; game <= 9; game++) {
      System.out.println(game + "回表、巨人の得点は？");
      giants += Integer.parseInt(br.readLine());

      System.out.println(game + "回表、阪神の得点は？");
      tigers += Integer.parseInt(br.readLine());
    }
    System.out.println("巨人:" + giants + "点、阪神:" + tigers);

    if (giants > tigers)
     System.out.println("巨人の勝ち");
    else if (giants < tigers)
      System.out.println("阪神の勝ち");
    else
      System.out.println("引き分け");

  }
}