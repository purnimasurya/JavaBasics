import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]) {
      Scanner sc =  new Scanner(System.in);
      System.out.println("Enter the number of terms : ");
      int n = sc.nextInt();
      int n1 = -1, n2 = 1, n3;
      System.out.println("The Fibonacci Series is : ");
      for(int i = 0;i<n;i++)
      {
          n3 = n1 + n2;
          System.out.println(n3);
          n1 = n2;
          n2 = n3;
      }
    }
}