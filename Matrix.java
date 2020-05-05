import java.util.Scanner; 
public class Matrix {
    public static void main(String args[]) {
      int i, j, k;
      int a[][] = {{1,3,4}, {2,4,3}, {3,4,5}};
      int b[][] = {{1,3,4}, {2,4,3}, {1,2,4}};
      int[][] c = new int[3][3];
      
      System.out.println("Matrix A is : \n");
      
      for(i=0;i<3;i++)
      {
          for(j=0;j<3;j++)
          {
             System.out.print(a[i][j] + "\t");
          }
          System.out.println("");
      }
      
      System.out.println("\nMatrix B is : \n");
      
       for(i=0;i<3;i++)
      {
          for(j=0;j<3;j++)
          {
             System.out.print(b[i][j] + "\t");
          }
          System.out.println("");
      }  
      
      System.out.println("\nSum of the matrices is : \n");
      for(i=0;i<3;i++)
      {
          for(j=0;j<3;j++)
          {
              System.out.print(a[i][j] + b[i][j] + "\t");
          }
          System.out.println("");
      }
      
      for(i=0;i<3;i++)
      {
          for(j=0;j<3;j++)
          {
              for(k=0;k<3;k++)
              {
                  c[i][j] = c[i][j] + a[i][k] * b[k][j];
              }
          }
      }
      
      System.out.println("\nProduct of the matrices is : \n");
      for(i=0;i<3;i++)
      {
          for(j=0;j<3;j++)
          {
             System.out.print(c[i][j] + "\t");
          }
          System.out.println("");
      }
      
    }
}