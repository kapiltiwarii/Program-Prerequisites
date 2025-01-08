import java.util.*;
// VOLUME OF CYLLINDER
public class VolumeOfCyllinder {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double r= sc.nextInt();
       double h= sc.nextInt();
       double V = Math.PI*Math.pow(r,2)*h;
        System.out.println(V);
    }
}
