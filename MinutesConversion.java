import java.util.Scanner; 
public class MinutesConversion {
    public static void main(String args[]) {
      Scanner s  = new Scanner(System.in);
      System.out.println("Enter the minutes : ");
      int minutes = s.nextInt();
      int year = minutes / 525600;
      int remainingMinutes = minutes % 525600;
      int day = remainingMinutes / 1440;
      System.out.println(minutes + " minutes is approximately " + year + " years and " + day + " days.");
    }
}