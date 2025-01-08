import java.util.Scanner;
// VOLUME OF CYLLINDER
public class VolumeOfCyllinder {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int r= sc.nextInt();
       int h= sc.nextInt();
       int V = 22/7*r*r*h;
        System.out.println(V);
    }
}
