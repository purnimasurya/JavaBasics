import java.util.Scanner; 
public class SwitchCase {
    public static void main(String args[]) {
      int choice;
      System.out.println("Pick one : \n1.Hi\n2.Hey\n3.Hello");
      Scanner s = new Scanner(System.in);
      choice = s.nextInt();
      switch(choice)
      {
          case 1 : System.out.println("You said Hi");
                   break;
          case 2 : System.out.println("You said Hey");
                   break;
          case 3 : System.out.println("You said Hello");
                   break;
          default : System.out.println("Invalid choice");
      }
    }
}