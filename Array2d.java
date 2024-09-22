import java.util.Scanner;

public class Array2d {
  public static int [][] input2dArray(int[][] arr){
    Scanner input=new Scanner(System.in);
    System.out.print("Please enter no of rows : ");
    int rows=input.nextInt();
    System.out.print("Please enter the number of columns :");
    int columns=input.nextInt();
    int[][] nums =new int[rows][columns];
    
    int i=0;
    while (i<rows) {
      int j=0;

      while (j< columns) {
        System.out.print("Please enter the element of row "+(i+1)+
        ",columns"+(j+1)+ ":");
        nums[i][j]=input.nextInt();
        j++;
        
      }
      i++;
      
    }return nums;
  }
}
