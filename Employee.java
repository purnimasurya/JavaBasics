import java.util.Scanner;

public class Employee
{
    String FName, LName, Add;
    int Yoj;

    void GetData()           // Defining GetData()
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("\n\tEnter Employee First Name : ");
        FName = sc.nextLine();

        System.out.print("\n\tEnter Employee Last Name : ");
        LName = sc.nextLine();

        System.out.print("\n\tEnter Employee Address : ");
        Add = sc.nextLine();

        System.out.print("\n\tEnter Year of Joining : ");
        Yoj = sc.nextInt();


    }

    void PutData()           // Defining PutData()
    {
        System.out.print("\n\t" + FName + "\t\t" + Yoj + "\t" + Add + "\n\t" + LName);
    }

    public static void main(String args[])
    {

        Employee[] Emp = new Employee[3];
        int i;

        for(i=0;i<3;i++)
            Emp[i] =  new Employee();   // Allocating memory to each object

        for(i=0;i<3;i++)
        {
            System.out.print("\nEnter details of "+ (i+1) +" Employee\n");
            Emp[i].GetData();
        }

        System.out.print("\nDetails of Employees\n");
        System.out.print("\n\t" + "Name" + "\t" + "Year of joining" + "\t" + "Address");
        for(i=0;i<3;i++)
            Emp[i].PutData();

    }
}