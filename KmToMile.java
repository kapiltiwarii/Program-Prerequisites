import java.util.Scanner;
//Kilometer to mile conversion

public class KmToMile {
      public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double Km= sc.nextInt();
      double Miles=Km*0.621371;
        System.out.println(Miles);
    }
}
